/**
 * @author kexiaohong
 * @version 1.0 2017年12月6日
 *
 */
package com.manager.inner.tree.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.manager.inner.tree.entity.TreeNode;
import com.manager.utils.StringUtil;


public class TreeUtil {
	
	/**
	 * TODO 将list数据转化成tree节点数据
	 * @author Devil 
	 * @version TreeUtil
	 * date: 2017年12月26日 上午10:26:06
	 * List<TreeNode>
	 * @param data 数据
	 * @param temp 模板
	 * @return
	 * @throws Exception
	 */
	public static <T> List<TreeNode> coverToTreeNode(Iterable<T> data,TreeNode temp) throws Exception{
		List<TreeNode> list = new ArrayList<TreeNode>();
		Iterator<T> iterator = data.iterator();
		while(iterator.hasNext()){
			T t = iterator.next();
			list.add(getNodeByTemp(t,temp));
		}
		return list;
	}
	
	/**
	 * TODO 将分散的tree节点组装成tree的树形结构
	 * @author Devil 
	 * @version TreeUtil
	 * date: 2017年12月26日 上午10:24:24
	 * List<TreeNode>
	 * @param data 数据
	 * @param temp 模版
	 * @return
	 * @throws Exception
	 */
	public static List<TreeNode> coverToTreeData(List<TreeNode> data,TreeNode temp) throws Exception{
		List<TreeNode> list = new ArrayList<TreeNode>();
		Map<String,TreeNode> doMap = new HashMap<String,TreeNode>();
		for(TreeNode node: data){
			doMap.put(node.getId(), node);
		}
		for(Map.Entry<String, TreeNode> entry: doMap.entrySet()){
			TreeNode node = entry.getValue();
			if(StringUtil.isNull(node.getFdParentId())){
				list.add(node);
			}else{
				doMap.get(node.getFdParentId()).addChildren(node);
			}
		}
		return list;
	}
	
	/**
	 * TODO 将list数据按照一定规则封装成树形结构
	 * @author Devil 
	 * @version TreeUtil
	 * date: 2017年12月6日 下午6:37:32
	 * List<TreeNode>
	 * @param data 数据
	 * @param temp 模版
	 * @return
	 * @throws Exception
	 */
	public static <T> List<TreeNode> coverToTreeData(Iterable<T> data,TreeNode temp) throws Exception{
		List<TreeNode> list = new ArrayList<TreeNode>();
		Map<String,TreeNode> doMap = new HashMap<String,TreeNode>();
		Iterator<T> iterator = data.iterator();
		List<TreeNode> origins = new ArrayList<TreeNode>();
		while(iterator.hasNext()){
			T t = iterator.next();
			origins.add(getNodeByTemp(t,temp));
		}
		for(TreeNode node: origins){
			doMap.put(node.getId(), node);
		}
		for(Map.Entry<String, TreeNode> entry: doMap.entrySet()){
			TreeNode node = entry.getValue();
			if(StringUtil.isNull(node.getFdParentId())){
				list.add(node);
			}else{
				doMap.get(node.getFdParentId()).addChildren(node);
			}
		}
		return list;
	}

	@SuppressWarnings( "rawtypes" )
	private static <T> TreeNode getNodeByTemp(T t, TreeNode temp) throws Exception {
		TreeNode treeNode = new TreeNode();
		Class<?> c = TreeNode.class;
		Field []fields = c.getDeclaredFields();
		for(Field field: fields){
			String name = field.getName();
			Type type = field.getGenericType();
			Method getMethod = getGetMethod(name, c);
			Method setMethod = getSetMethod(name,c,field.getType());
			Object value = getMethod.invoke(temp);
			if(type == String.class && StringUtil.isNotNull((String)value)){
				Class tc =  t.getClass();
				Method tGetMethod = getGetMethod((String)value, tc);
				Object val = tGetMethod.invoke(t);
				setMethod.invoke(treeNode, val);
			}
		}
		return treeNode;
	}

	/**
	 * TODO 获取get方法
	 * @author Devil 
	 * @version TreeUtil
	 * date: 2017年12月6日 下午6:38:15
	 * @param name
	 * @param c
	 * @return
	 * @throws Exception
	 */
	private static Method getGetMethod(String name,Class<?> c) throws Exception {
		char ch = name.charAt(0);
		String methonName = "get"+Character.toUpperCase(ch)+name.substring(1);
		Method method = c.getMethod(methonName);
		return method;
	}
	
	/**
	 * 
	 * TODO 获取set方法
	 * @author Devil 
	 * @version TreeUtil
	 * date: 2017年12月6日 下午6:38:46
	 * Method
	 * @param name
	 * @param c
	 * @param cc
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("rawtypes")
	private static Method getSetMethod(String name,Class<?> c,Class ...cc) throws Exception{
		char ch = name.charAt(0);
		String methonName = "set"+Character.toUpperCase(ch)+name.substring(1);
		Method method = c.getDeclaredMethod(methonName, cc);
		return method;
	}
}
