package com.yondervision.yfmap.form;


/**
* @ClassName: AppApiForm
* @Description: 浙江省公积金个人账户基本信息查询接口
* @author luolin
* @date 2019-10-14
*
*/
public class AppApi00226Form  {
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
	private String accname;

	private String centerId;
	private String buzType;
	private String seqno;

	//transdate":"网厅证明出具时间
	private String transdate;

	private String qdapprnum;


	//2020-12-22
	private String loancontrnum;

	private String indiaccstate;

	private String addr;

	private String unitaccname;

	private String year;

	private String unitprop;

	private String recode;

	private String bal;

	private String linkphone;

	private String indiprop;

	private String amt;

	private String flag;

	private String month1;

	private String month;

	private String opnaccdate;

	private String linkman;

	private String indipaysum;

	private String year1;

	private String basenum;

	private String userId;

	private String brcCode;

	//------------------------------------- 2020-12-22异地缴存证明字段添加完毕


	public String getAccname() {
		return this.accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getBrcCode() {
		return brcCode;
	}

	public void setBrcCode(String brcCode) {
		this.brcCode = brcCode;
	}

	public String getBasenum() {
		return basenum;
	}

	public void setBasenum(String basenum) {
		this.basenum = basenum;
	}

	public String getYear1() {
		return year1;
	}

	public void setYear1(String year1) {
		this.year1 = year1;
	}

	public String getIndipaysum() {
		return indipaysum;
	}

	public void setIndipaysum(String indipaysum) {
		this.indipaysum = indipaysum;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getOpnaccdate() {
		return opnaccdate;
	}

	public void setOpnaccdate(String opnaccdate) {
		this.opnaccdate = opnaccdate;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getMonth1() {
		return month1;
	}

	public void setMonth1(String month1) {
		this.month1 = month1;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getAmt() {
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}

	public String getIndiprop() {
		return indiprop;
	}

	public void setIndiprop(String indiprop) {
		this.indiprop = indiprop;
	}

	public String getLinkphone() {
		return linkphone;
	}

	public void setLinkphone(String linkphone) {
		this.linkphone = linkphone;
	}

	public String getBal() {
		return bal;
	}

	public void setBal(String bal) {
		this.bal = bal;
	}

	public String getRecode() {
		return recode;
	}

	public void setRecode(String recode) {
		this.recode = recode;
	}

	public String getUnitprop() {
		return unitprop;
	}

	public void setUnitprop(String unitprop) {
		this.unitprop = unitprop;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getUnitaccname() {
		return unitaccname;
	}

	public void setUnitaccname(String unitaccname) {
		this.unitaccname = unitaccname;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getIndiaccstate() {
		return indiaccstate;
	}

	public void setIndiaccstate(String indiaccstate) {
		this.indiaccstate = indiaccstate;
	}

	public String getLoancontrnum() {
		return loancontrnum;
	}

	public void setLoancontrnum(String loancontrnum) {
		this.loancontrnum = loancontrnum;
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


	public String getTransdate() {
		return transdate;
	}

	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}

	public String getQdapprnum() {
		return qdapprnum;
	}

	public void setQdapprnum(String qdapprnum) {
		this.qdapprnum = qdapprnum;
	}

	public String getSeqno() {
		return seqno;
	}

	public void setSeqno(String seqno) {
		this.seqno = seqno;
	}
}
