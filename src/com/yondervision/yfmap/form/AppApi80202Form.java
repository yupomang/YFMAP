package com.yondervision.yfmap.form;

public class AppApi80202Form extends AppApiCommonForm {
	/** 页码 */				
	private String pagenum = "";				
	/** 行数 */				
	private String pagerows = "";	
	/** 账户类型 */				
	private String zhlx = "";
		
	/**				
	 *<pre> 执行获取页码处理 </pre>				
	 * @return pagenum 页码				
	 */				
	public String getPagenum() {				
	    return pagenum;				
	}				
					
	/**				
	 *<pre> 执行设定页码处理 </pre>				
	 * @param pagenum 页码				
	 */				
	public void setPagenum(String pagenum) {				
	    this.pagenum = pagenum;				
	}				
					
	/**				
	 *<pre> 执行获取行数处理 </pre>				
	 * @return pagerows 行数				
	 */				
	public String getPagerows() {				
	    return pagerows;				
	}				
					
	/**				
	 *<pre> 执行设定行数处理 </pre>				
	 * @param pagerows 行数				
	 */				
	public void setPagerows(String pagerows) {				
	    this.pagerows = pagerows;				
	}

	/**
	 * <pre> 执行获取账户类型处理 </pre>	
	 * @return zhlx 账户类型
	 */
	public String getZhlx() {
		return zhlx;
	}

	/**
	 * <pre> 执行设定账户类型处理 </pre>
	 * @param zhlx 账户类型
	 */
	public void setZhlx(String zhlx) {
		this.zhlx = zhlx;
	}
}
