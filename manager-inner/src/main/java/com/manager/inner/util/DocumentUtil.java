package com.manager.inner.util;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.manager.inner.dto.Page;
import com.mongodb.client.FindIterable;

public class DocumentUtil {

	private static final String SETTER = "set";
//	private static final String GETTER = "get";
	
	/**
	 * FindIterable<Document>类转换成List<T>
	 * @param documents
	 * @param T
	 * @return List<T>
	 */
	public static <T> List<T> documentToList(FindIterable<Document> documents,Class<T> T){
		List<T> list = new ArrayList<T>();
		try {
			for(Document document: documents){
				T o = T.newInstance();
				Field []fields = T.getDeclaredFields();
				for(Field field:fields){
					String fieldName = field.getName();
					Method m = T.getDeclaredMethod(getMethodName(field,SETTER), field.getType());
					m.invoke(o, document.get(getDocumentProperties(fieldName)));
				}
				list.add(o);
			}
		} catch (Exception e) {
			e.printStackTrace();
			list = null;
		}
		return list;
 	}
	
	/**
	 * 根据fieldName获取document的key值
	 * @param document
	 * @param fieldName
	 * @return
	 */
	private static String getDocumentProperties(String fieldName) {
		StringBuffer sb = new StringBuffer();
		for(int i =0,l = fieldName.length(); i < l; i++){
			char c = fieldName.charAt(i);
			if(!Character.isLowerCase(c)){
				sb.append("_");
			}
			sb.append(Character.toLowerCase(c));
		}
		return sb.toString();
	}

	/**
	 * 根据Field获取名称
	 * @param field
	 * @return
	 */
	private static String getMethodName(Field field,String type){
		String fieldName = field.getName();
		char c = fieldName.charAt(0);
		return type + Character.toUpperCase(c) + fieldName.substring(1);
	}

	public static <T> Page<T> documentToPage(FindIterable<Document> documents, Class<T> T) {
		Page<T> page = new Page<T>();
		page.setList(documentToList(documents, T));
		return page;
	}
	
	public static <T> Document entityToDocument(T t){
		Document document = new Document();
		try {
			Class<?> c = t.getClass();
			Field []fields = c.getDeclaredFields();
			for(Field field: fields){
				String fieldName = field.getName();
				PropertyDescriptor pd = new PropertyDescriptor(fieldName,c);
				Method m = pd.getReadMethod();
				String value = m.invoke(t).toString();
				document.append(getDocumentProperties(fieldName), value);
			}
		} catch (Exception e) {
		}
		return document;
	}
}
