package com.manager.inner.util;

import com.manager.inner.dto.Page;

public class PageUtil {

	/**
	 * 分页区间
	 * @param pagesLen
	 * @param page
	 * @return
	 */
	public static <T> Page<T> getInterval(Page<T> pageHelper){
		long count = pageHelper.getPageResultCount();
		int page = pageHelper.getPage();
		int start = page - 4;
		int end = page + 3;
		if(count < 8){
			start = 1;
			end = (int)count;
		}
		
		if(start <= 0){
			end += (0 - start); 
			start = 1;
		}
		if(end >= count){
			start -= (end - count);
			end = (int)count;
		}
		pageHelper.setStart(start);
		pageHelper.setEnd(end);
		return pageHelper;
	}
}
