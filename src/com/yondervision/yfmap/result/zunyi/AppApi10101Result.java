package com.yondervision.yfmap.result.zunyi;

import java.util.List;

import com.yondervision.yfmap.result.TitleInfoBean;

/** 
* @ClassName: AppApi10101Result 
* @Description: TODO
* @author Caozhongyan
* @date Sep 27, 2013 2:56:13 PM   
* 
*/ 
public class AppApi10101Result {
	private AppApi10101Result01 map = null;
	
	private List<TitleInfoBean> list = null;
	
	private List<TitleInfoBean> content = null;

	public AppApi10101Result01 getMap() {
		return map;
	}

	public void setMap(AppApi10101Result01 map) {
		this.map = map;
	}

	public List<TitleInfoBean> getList() {
		return list;
	}

	public void setList(List<TitleInfoBean> list) {
		this.list = list;
	}

	public List<TitleInfoBean> getContent() {
		return content;
	}

	public void setContent(List<TitleInfoBean> content) {
		this.content = content;
	}
	
	
}


