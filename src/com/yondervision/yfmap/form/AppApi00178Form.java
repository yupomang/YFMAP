package com.yondervision.yfmap.form;


/**
* @ClassName: AppApi00225Form
* @Description: 浙江省公积金个人账户基本信息查询接口
* @author luolin
* @date 2019-10-14
*
*/
public class AppApi00178Form {
/*
证件号码 ZJHM
*/
	private String businName;
	private String ZJHM;
	private String channel;
/*
贷款异地证明打印
accnum 个人账号
certinum 身份证
centername 发送方中心名称
userid 柜员号
brccode 机构码
channel 渠道号
projectname 回执方中心名称*/
	private String accnum;
	private String certinum;
	private String centername;
	private String userid;
	private String brccode;
	private String projectname;

	private String centerId;
	private String buzType;
	private String tyxydm;
	private String regno;
	private String idcard;

	public String getTyxydm() {
		return this.tyxydm;
	}

	public void setTyxydm(String tyxydm) {
		this.tyxydm = tyxydm;
	}

	public String getRegno() {
		return this.regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getBuzType() {
		return this.buzType;
	}

	public void setBuzType(final String buzType) {
		this.buzType = buzType;
	}

	public String getCenterId() {
		return this.centerId;
	}

	public void setCenterId(final String centerId) {
		this.centerId = centerId;
	}

	public String getAccnum() {
		return this.accnum;
	}

	public void setAccnum(final String accnum) {
		this.accnum = accnum;
	}

	public String getCertinum() {
		return this.certinum;
	}

	public void setCertinum(final String certinum) {
		this.certinum = certinum;
	}

	public String getCentername() {
		return this.centername;
	}

	public void setCentername(final String centername) {
		this.centername = centername;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(final String userid) {
		this.userid = userid;
	}

	public String getBrccode() {
		return this.brccode;
	}

	public void setBrccode(final String brccode) {
		this.brccode = brccode;
	}

	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(final String projectname) {
		this.projectname = projectname;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(final String channel) {
		this.channel = channel;
	}

	public String getBusinName() {
		return this.businName;
	}

	public void setBusinName(final String businName) {
		this.businName = businName;
	}

	public String getZJHM() {
		return this.ZJHM;
	}

	public void setZJHM(final String ZJHM) {
		this.ZJHM = ZJHM;
	}
}
