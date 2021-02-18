package com.yondervision.yfmap.form;

/** 
* @ClassName: AppApi00101Form 
* @Description: 余额
* @author Caozhongyan
* @date Nov 5, 2013 3:37:03 PM   
* 
*/ 
public class AppApi50007Form extends AppApiCommonForm {
	private String organCode;//组织机构代码

	public String getOrganCode() {
		return this.organCode;
	}

	public void setOrganCode(final String organCode) {
		this.organCode = organCode;
	}

	//familyMembers 家庭成员姓名及证件号
	private String familyMembers;

	public String getFamilyMembers() {
		return this.familyMembers;
	}

	public void setFamilyMembers(final String familyMembers) {
		this.familyMembers = familyMembers;
	}

	private String WorkSheetLogVo;//生成工单入参

	public String getWorkSheetLogVo() {
		return this.WorkSheetLogVo;
	}

	public void setWorkSheetLogVo(final String workSheetLogVo) {
		this.WorkSheetLogVo = workSheetLogVo;
	}

	private String buildUnit;//建设单位（个人）
	private String qgbh;//全国统一编号
	private String qsbh;//全市统一编号

	public String getBuildUnit() {
		return this.buildUnit;
	}

	public void setBuildUnit(final String buildUnit) {
		this.buildUnit = buildUnit;
	}

	public String getQgbh() {
		return this.qgbh;
	}

	public void setQgbh(final String qgbh) {
		this.qgbh = qgbh;
	}

	public String getQsbh() {
		return this.qsbh;
	}

	public void setQsbh(final String qsbh) {
		this.qsbh = qsbh;
	}

	private String Organization_Id;//调用机构代码
	private String User_ID;//请求人证件号码
	private String xm;//姓名
	private String User_Name;//请求人姓名
	private String Organization;//调用机构名称

	public String getOrganization_Id() {
		return this.Organization_Id;
	}

	public void setOrganization_Id(final String organization_Id) {
		this.Organization_Id = organization_Id;
	}

	public String getUser_ID() {
		return this.User_ID;
	}

	public void setUser_ID(final String user_ID) {
		this.User_ID = user_ID;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXm(final String xm) {
		this.xm = xm;
	}

	public String getUser_Name() {
		return this.User_Name;
	}

	public void setUser_Name(final String user_Name) {
		this.User_Name = user_Name;
	}

	public String getOrganization() {
		return this.Organization;
	}

	public void setOrganization(final String organization) {
		this.Organization = organization;
	}

	private String csfnsrsbh;//承受方识别号(身份证) csfnsrsbh 不可为空
	private String projid;//填核查办件对应的办件号或主键
	private String czrkxm;//常住人口姓名 czrkxm(精确匹配)

	public String getCsfnsrsbh() {
		return this.csfnsrsbh;
	}

	public void setCsfnsrsbh(final String csfnsrsbh) {
		this.csfnsrsbh = csfnsrsbh;
	}

	public String getProjid() {
		return this.projid;
	}

	public void setProjid(final String projid) {
		this.projid = projid;
	}

	public String getCzrkxm() {
		return this.czrkxm;
	}

	public void setCzrkxm(final String czrkxm) {
		this.czrkxm = czrkxm;
	}

	private String aHAP0015;//身份证号码
	private String bHAX0114;//年
	private String bHAX0115;//月

	public String getaHAP0015() {
		return this.aHAP0015;
	}

	public void setaHAP0015(final String aHAP0015) {
		this.aHAP0015 = aHAP0015;
	}

	public String getbHAX0114() {
		return this.bHAX0114;
	}

	public void setbHAX0114(final String bHAX0114) {
		this.bHAX0114 = bHAX0114;
	}

	public String getbHAX0115() {
		return this.bHAX0115;
	}

	public void setbHAX0115(final String bHAX0115) {
		this.bHAX0115 = bHAX0115;
	}

	private String content;//反馈内容
	private String status;//办件状态
	private String resultCode;//核查状态编码
	private String checkCode;//核查编码
	private String message;//核查参数

	public String getContent() {
		return this.content;
	}

	public void setContent(final String content) {
		this.content = content;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(final String resultCode) {
		this.resultCode = resultCode;
	}

	public String getCheckCode() {
		return this.checkCode;
	}

	public void setCheckCode(final String checkCode) {
		this.checkCode = checkCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(final String message) {
		this.message = message;
	}

	private String qlr;//权利人
	private String zjh;//证件号
	private String cert_num_man;//男方身份证号
	private String name_man;//男方姓名
	private String cert_num_woman;//女方身份证号
	private String name_woman;//女方姓名
	private String czrkgmsfhm;//公民身份证号码
	private String sydwTycode;//事业单位统一社会信用代码
	private String closereason;//注销原因
	private String YSXKZTYBH;//预售许可证统一编号
	private String nsrqz;//纳税日期止
	private String nsrqq;//纳税日期起
	private String qshm;//契税号码

	private String AltDate;//变更日期
	private String nsrmc;//纳税人名称
	private String kprqz;//开票日期止
	private String nsrsbh;//纳税人识别号
	private String kprqq;//开票日期起
	private String dzsphm; //电子税票号码
	
	private String companyName;//企业名称
	private String registerNo;//营业执照注册号
	private String entType;// E企业，P个体	
	private String regno;//注册号
	private String jcrs;//缴存人数
	private String jcjsze;//缴存基数总额（元）
	private String dwzfgjjzh;//单位住房公积金账号
	private String lxdh;//联系电话
	private String materialForm;//社会团体变更登记申请表
	private String sponsorCode;//申请人/法人证件编码
	private String jcbl;//缴存比率
	private String lxr;//联系人
	private String yb;//邮编
	private String yjcjs;//月缴存基数（元）
	private String txdz;//通信地址

	private String filename;//文件名称
	private String filepath;//文件路径
	private String qlrid;//权利人证件号
	private String gmsfhm;//公民身份证号
	private String pageSize;//查询月数
	private String bae001;//查询类型 1、按单位代码查询 2、按统一社会信用代 
	private String aab001;//单位代码 
	private String bab010;//统一社会信用代码
	private String name;//姓名
	private String cardId;//身份证号
	private String FYQSSJ;//费用所属起始时间(格式：YYYYMMDD)
	private String JYLX;//就医类型(可为空，为空时查询所有， 具体如字典说明)
	private String FYJSSJ;//费用所属截止时间(格式：YYYYMMDD)
	private String SFZH;//身份证号(身份证号)
	private String JKLX;//接口类型(Nbyb-Yspt1002)

	private String applyCardType;//申请者证件类型
	private String belongSystem;//所属系统
	private String applyName;//申请者名称
	private String applyCardNumber;//申请者证件号码
	private String busType;//业务类型
	private String deptId;//收件部门编码
	private String applyFrom;//申报来源类型
	private String areaCode;//收件部门所属行政区划编码
	private String serviceCodeId;//权利事项基本码
	private String projId;//统一申请编码
	
	private String  speflag;//网厅登录检查密码标志 0-检查 1-不检查
	private String  jgh;//机构号 非加密；
	private String  jkbm;//接口编码 非加密
	private String  SRFZJHM;//	SRFZJHM	房屋买受人证件号码
	private String  SZCS;//	SZCS	所在城市行政编码
	private String  HTBH;//	HTBH	合同编号
	
	private String  syzlwz;
	private String  cqmj;
	private String  powerMatters;
	private String  subPowerMatters;
	private String  materialName;
	private String  fpdm;//发票代码
	private String  fphm;//发票号码
	private String  bdcqzh;//不动产权字号
	private String  xzqbm;//行政区编码
	//信用办接口
	private String  xtjrm;//系统接入码明文
	private String  tysqsbm;//统一申请识别码，当同一部门根据相同审批事项对同一主体进行信用核查时，需使用相同的统一申请识别码，反之，任意条件不同时，则需使用不同的统一申请识别码。
	private String  mc;//核查主体的法人名称,对象类型为法人时，必填 最大100
	private String  tyshxydm;//法人统一社会信用代码或者自然人身份证件号码,对象类型为自然人时，必填
	private String  czrxm;//操作人姓名
	private String  czrsfzhm;//操作人身份证号码,非必须
	private String  sxmc;//办理事项名称
	private String  sxdm;//办理事项代码
	private String  hcsy;//核查事由
	private String  bmmc;//部门名称
	private String  bmdm;//部门代码，区域代码+部门代码，详情见本文档的部门代码规范
	private String  hcrq;//核查日期
	private String  timestamp;//时间戳,接口调用的时间 2018/6/5 12:00
	private String  cslbdm;//措施类别代码	1006
	private String  cslbmc;//措施类别名称	对开票主体对象进行信用核查
	private String  csdm;//措施代码	
	private String  csmc;//措施名称	对开票主体限制网上办理
	private String  ms;//描述,最大长度2000	对开票主体限制网上办理
	private String  fkrq;//反馈日期	2018/6/5
	private String  tysbm;

	//房管局接口
	private String 	address;
	private String 	additional;
	//五证合一
	private String 	uniscid;//	统一社会信用代码
	private String 	entname;//	企业名称（字号名称）
	
	//人社接口
	private String 	AAC002;//社会保障号
	private String 	AAC003;//姓名
	private String 	AAE103;//事项名称（中文，最多100字）
	private String 	AAB301;//行政区划代码
	private String 	sndmsgid;//发起方报文ID
	
	private String 	zl;//房屋坐落，模糊匹配,但是长度必须大于4
	private String 	clientusercid;//申请人证件号/提取公积金人的证件号
	private String 	qlrzjh;//被查询人证件号/以家庭单位的被查询人证件号
	private String 	computername;//查询部门/查询部门
	private String 	cxfw;//查询范围/被查询人需要查询的住房所在区域
	private String 	clientusername;//申请人姓名/提取公积金人的姓名
	private String 	qlrmc;//被查询人姓名/以家庭单位的被查询人姓名

	
	private String  certitype;
	private String  certinum;
	
	private String  qdapprnum;
	//===========  宁波新加================forU盾信息修改
	private String 	unitaccname;//单位名称
	private String 	unitcertitype;//证件类型
	private String 	unitcertinum;//证件号
	private String 	ukeynum;//U盾序列号
	private String 	chgtype;//修改类型
	private String 	ukflag;//是否主管盾
	private String 	unitlinkman;//单位联系人
	private String 	unitlinkphone;//单位经办人联系电话
	private String 	ukeystate;//修改后状态
	
	//房管局
	private String  divisionCode;//房源所属行政区域(字典表)
	private String  certType;//房产证类型1不动产权证号2老产权证号
	private String  certNumber;//房产证号码
	private String  contractNo;//材料号
	private String  located;//房屋地址
	/** 上传备用字段1*/
	private String freeuse1_in="";
	/** 上传备用字段2*/
	private String freeuse2_in="";
	/** 上传备用字段3*/
	private String freeuse3_in="";
	
//===========  宁波新加================for个人高级登录
	/** 交易类型*/
	private String checkflag="";
	
	public String getCheckflag() {
		return checkflag;
	}

	public void setCheckflag(String checkflag) {
		this.checkflag = checkflag;
	}

	//宁波公务员最多跑一次接口
	private String procInsId;

	private String loginWorkNo;

	private String remark;

	private String action;

	public String getProcInsId() {
		return this.procInsId;
	}

	public void setProcInsId(String procInsId) {
		this.procInsId = procInsId;
	}

	public String getLoginWorkNo() {
		return this.loginWorkNo;
	}

	public void setLoginWorkNo(String loginWorkNo) {
		this.loginWorkNo = loginWorkNo;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	//===========  宁波新加================for非因工伤残或因病丧失劳动能力程度鉴定结论

	private String bjdr = "";

	public String getBjdr() {
		return this.bjdr;
	}

	public void setBjdr(String bjdr) {
		this.bjdr = bjdr;
	}
	//===========  株洲新加================
	/** 自定义用户名*/
	private String zdyyhm = "";	
	/** 序号*/
	private String seqno = "";	
	/** 用户渠道标识*/
	private String yhqdbs = "";	
	/** 参数值*/
	private String csz = "";
	/** 修改类型*/
	private String xglx = "";
	/** 
	 * 注：
	 * 客户密码     使用之前的 password
	 * 手机号         使用之前的 tel
	 * 姓名             使用之前的 fullName
	 * 证件号         使用之前的 bodyCardNumber
	 * 短信验证码  使用之前的 checkcode
	 */

	
	//银行账号有效性验证 50026添加
	/** 银行账户名称*/
	private String bankaccnm = "";
	/** 银行账号*/
	private String bankaccnum = "";
	//50026添加end

	//银行还款账号维护 50027添加
	/** 审批号*/
	private String apprnum = "";
	/** 还款账号*/
	private String hkzh = "";
	/** 借款人类型*/
	private String loaneetype = "";
	/** 原内容*/
	private String oldvalue = "";
	/** 姓名*/
	private String xingming = "";
	/** 账户开户银行代码*/
	private String zhkhyhdm = "";
	/** 证件号码*/
	private String zjhm = "";
	//50027添加end
//===========  株洲新加================
	

	public String getFreeuse1_in() {
		return freeuse1_in;
	}

	public String getZdyyhm() {
		return zdyyhm;
	}

	public void setZdyyhm(String zdyyhm) {
		this.zdyyhm = zdyyhm;
	}

	public String getSeqno() {
		return seqno;
	}

	public void setSeqno(String seqno) {
		this.seqno = seqno;
	}

	public String getYhqdbs() {
		return yhqdbs;
	}

	public void setYhqdbs(String yhqdbs) {
		this.yhqdbs = yhqdbs;
	}

	public String getCsz() {
		return csz;
	}

	public void setCsz(String csz) {
		this.csz = csz;
	}

	public void setFreeuse1_in(String freeuse1_in) {
		this.freeuse1_in = freeuse1_in;
	}

	public String getFreeuse2_in() {
		return freeuse2_in;
	}

	public void setFreeuse2_in(String freeuse2_in) {
		this.freeuse2_in = freeuse2_in;
	}

	public String getFreeuse3_in() {
		return freeuse3_in;
	}

	public void setFreeuse3_in(String freeuse3_in) {
		this.freeuse3_in = freeuse3_in;
	}


	/**
	 * 手机号
	 */
	private String tel="";
	/**
	 * 手机短信验证码
	 */
	private String checkcode="";
	/**
	 * 公积金密码
	 */
	private String password="";
	/**
	 * 新公积金密码
	 */
	private String newpassword="";
	/**
	 * 新公积金密码
	 */
	private String confirmnewpassword="";
	/**
	 * 银行代码
	 */
	private String bankcode="";
	/**
	 * 姓名
	 */
	private String fullName;
	/**
	 * 证件号码 
	 */
	private String idcardNumber;
	/**
	 * 手机号码
	 */
	private String mobileNumber;
	/**
	 * 电子邮箱
	 */
	private String email;
  
	// 业务名称
	private String businName = "";
	
	/** 登录方式 */			
	private String logintype = "";	
	
	/** 个人公积金账户 */			
	private String accnum = "";	
	/** 个人姓名 */			
	private String accname = "";
	/** 绑定银行卡号 */			
	private String cardno = "";	
	/** 单位账号 */			
	private String unitaccnum = "";	
	/**
	 * 性别
	 */
	private String sex="";
	/**
	 * 生日，YYYY-MM-DD
	 */
	private String birthday="";
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getUnitaccnum() {
		return unitaccnum;
	}

	public void setUnitaccnum(String unitaccnum) {
		this.unitaccnum = unitaccnum;
	}

	public String getAccnum() {
		return accnum;
	}

	public void setAccnum(String accnum) {
		this.accnum = accnum;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getLogintype() {
		return logintype;
	}

	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIdcardNumber() {
		return idcardNumber;
	}

	public void setIdcardNumber(String idcardNumber) {
		this.idcardNumber = idcardNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getConfirmnewpassword() {
		return confirmnewpassword;
	}

	public void setConfirmnewpassword(String confirmnewpassword) {
		this.confirmnewpassword = confirmnewpassword;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getBusinName() {
		return businName;
	}

	public void setBusinName(String businName) {
		this.businName = businName;
	}
	public String getBankaccnm() {
		return bankaccnm;
	}
	public void setBankaccnm(String bankaccnm) {
		this.bankaccnm = bankaccnm;
	}
	public String getBankaccnum() {
		return bankaccnum;
	}
	public void setBankaccnum(String bankaccnum) {
		this.bankaccnum = bankaccnum;
	}
	public String getApprnum() {
		return apprnum;
	}
	public void setApprnum(String apprnum) {
		this.apprnum = apprnum;
	}
	public String getHkzh() {
		return hkzh;
	}
	public void setHkzh(String hkzh) {
		this.hkzh = hkzh;
	}
	public String getLoaneetype() {
		return loaneetype;
	}
	public void setLoaneetype(String loaneetype) {
		this.loaneetype = loaneetype;
	}
	public String getOldvalue() {
		return oldvalue;
	}
	public void setOldvalue(String oldvalue) {
		this.oldvalue = oldvalue;
	}
	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	public String getZhkhyhdm() {
		return zhkhyhdm;
	}
	public void setZhkhyhdm(String zhkhyhdm) {
		this.zhkhyhdm = zhkhyhdm;
	}
	public String getZjhm() {
		return zjhm;
	}
	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}

	public String getXglx() {
		return xglx;
	}

	public void setXglx(String xglx) {
		this.xglx = xglx;
	}

	public String getUnitaccname() {
		return unitaccname;
	}

	public void setUnitaccname(String unitaccname) {
		this.unitaccname = unitaccname;
	}

	public String getUnitcertitype() {
		return unitcertitype;
	}

	public void setUnitcertitype(String unitcertitype) {
		this.unitcertitype = unitcertitype;
	}

	public String getUnitcertinum() {
		return unitcertinum;
	}

	public void setUnitcertinum(String unitcertinum) {
		this.unitcertinum = unitcertinum;
	}

	public String getUkeynum() {
		return ukeynum;
	}

	public void setUkeynum(String ukeynum) {
		this.ukeynum = ukeynum;
	}

	public String getChgtype() {
		return chgtype;
	}

	public void setChgtype(String chgtype) {
		this.chgtype = chgtype;
	}

	public String getUkflag() {
		return ukflag;
	}

	public void setUkflag(String ukflag) {
		this.ukflag = ukflag;
	}

	public String getUnitlinkman() {
		return unitlinkman;
	}

	public void setUnitlinkman(String unitlinkman) {
		this.unitlinkman = unitlinkman;
	}

	public String getUnitlinkphone() {
		return unitlinkphone;
	}

	public void setUnitlinkphone(String unitlinkphone) {
		this.unitlinkphone = unitlinkphone;
	}

	public String getUkeystate() {
		return ukeystate;
	}

	public void setUkeystate(String ukeystate) {
		this.ukeystate = ukeystate;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getCertNumber() {
		return certNumber;
	}

	public void setCertNumber(String certNumber) {
		this.certNumber = certNumber;
	}

	public String getQdapprnum() {
		return qdapprnum;
	}

	public void setQdapprnum(String qdapprnum) {
		this.qdapprnum = qdapprnum;
	}

	public String getCertitype() {
		return certitype;
	}

	public void setCertitype(String certitype) {
		this.certitype = certitype;
	}

	public String getCertinum() {
		return certinum;
	}

	public void setCertinum(String certinum) {
		this.certinum = certinum;
	}

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getClientusercid() {
		return clientusercid;
	}

	public void setClientusercid(String clientusercid) {
		this.clientusercid = clientusercid;
	}

	public String getQlrzjh() {
		return qlrzjh;
	}

	public void setQlrzjh(String qlrzjh) {
		this.qlrzjh = qlrzjh;
	}

	public String getComputername() {
		return computername;
	}

	public void setComputername(String computername) {
		this.computername = computername;
	}

	public String getCxfw() {
		return cxfw;
	}

	public void setCxfw(String cxfw) {
		this.cxfw = cxfw;
	}

	public String getClientusername() {
		return clientusername;
	}

	public void setClientusername(String clientusername) {
		this.clientusername = clientusername;
	}

	public String getQlrmc() {
		return qlrmc;
	}

	public void setQlrmc(String qlrmc) {
		this.qlrmc = qlrmc;
	}

	public String getZl() {
		return zl;
	}

	public void setZl(String zl) {
		this.zl = zl;
	}

	public String getAAC002() {
		return AAC002;
	}

	public void setAAC002(String aAC002) {
		AAC002 = aAC002;
	}

	public String getAAC003() {
		return AAC003;
	}

	public void setAAC003(String aAC003) {
		AAC003 = aAC003;
	}

	public String getAAE103() {
		return AAE103;
	}

	public void setAAE103(String aAE103) {
		AAE103 = aAE103;
	}

	public String getAAB301() {
		return AAB301;
	}

	public void setAAB301(String aAB301) {
		AAB301 = aAB301;
	}

	public String getSndmsgid() {
		return sndmsgid;
	}

	public void setSndmsgid(String sndmsgid) {
		this.sndmsgid = sndmsgid;
	}

	public String getUniscid() {
		return uniscid;
	}

	public void setUniscid(String uniscid) {
		this.uniscid = uniscid;
	}

	public String getEntname() {
		return entname;
	}

	public void setEntname(String entname) {
		this.entname = entname;
	}

	public String getLocated() {
		return located;
	}

	public void setLocated(String located) {
		this.located = located;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	public String getMc() {
		return mc;
	}

	public void setMc(String mc) {
		this.mc = mc;
	}

	public String getTyshxydm() {
		return tyshxydm;
	}

	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}

	public String getXtjrm() {
		return xtjrm;
	}

	public void setXtjrm(String xtjrm) {
		this.xtjrm = xtjrm;
	}

	public String getTysqsbm() {
		return tysqsbm;
	}

	public void setTysqsbm(String tysqsbm) {
		this.tysqsbm = tysqsbm;
	}

	public String getCzrxm() {
		return czrxm;
	}

	public void setCzrxm(String czrxm) {
		this.czrxm = czrxm;
	}

	public String getCzrsfzhm() {
		return czrsfzhm;
	}

	public void setCzrsfzhm(String czrsfzhm) {
		this.czrsfzhm = czrsfzhm;
	}

	public String getSxmc() {
		return sxmc;
	}

	public void setSxmc(String sxmc) {
		this.sxmc = sxmc;
	}

	public String getSxdm() {
		return sxdm;
	}

	public void setSxdm(String sxdm) {
		this.sxdm = sxdm;
	}

	public String getHcsy() {
		return hcsy;
	}

	public void setHcsy(String hcsy) {
		this.hcsy = hcsy;
	}

	public String getBmmc() {
		return bmmc;
	}

	public void setBmmc(String bmmc) {
		this.bmmc = bmmc;
	}

	public String getBmdm() {
		return bmdm;
	}

	public void setBmdm(String bmdm) {
		this.bmdm = bmdm;
	}

	public String getHcrq() {
		return hcrq;
	}

	public void setHcrq(String hcrq) {
		this.hcrq = hcrq;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String csdm() {
		return cslbdm;
	}

	public void setCslbdm(String cslbdm) {
		this.cslbdm = cslbdm;
	}

	public String getCslbmc() {
		return cslbmc;
	}

	public void setCslbmc(String cslbmc) {
		this.cslbmc = cslbmc;
	}

	public String getCsdm() {
		return csdm;
	}

	public void setCsdm(String csdm) {
		this.csdm = csdm;
	}

	public String getCsmc() {
		return csmc;
	}

	public void setCsmc(String csmc) {
		this.csmc = csmc;
	}

	public String getMs() {
		return ms;
	}

	public void setMs(String ms) {
		this.ms = ms;
	}

	public String getFkrq() {
		return fkrq;
	}

	public void setFkrq(String fkrq) {
		this.fkrq = fkrq;
	}

	public String getTysbm() {
		return tysbm;
	}

	public void setTysbm(String tysbm) {
		this.tysbm = tysbm;
	}

	public String getCslbdm() {
		return cslbdm;
	}

	public String getBdcqzh() {
		return bdcqzh;
	}

	public void setBdcqzh(String bdcqzh) {
		this.bdcqzh = bdcqzh;
	}

	public String getXzqbm() {
		return xzqbm;
	}

	public void setXzqbm(String xzqbm) {
		this.xzqbm = xzqbm;
	}

	public String getFpdm() {
		return fpdm;
	}

	public void setFpdm(String fpdm) {
		this.fpdm = fpdm;
	}

	public String getFphm() {
		return fphm;
	}

	public void setFphm(String fphm) {
		this.fphm = fphm;
	}

	public String getPowerMatters() {
		return powerMatters;
	}

	public void setPowerMatters(String powerMatters) {
		this.powerMatters = powerMatters;
	}

	public String getSubPowerMatters() {
		return subPowerMatters;
	}

	public void setSubPowerMatters(String subPowerMatters) {
		this.subPowerMatters = subPowerMatters;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getSyzlwz() {
		return syzlwz;
	}

	public void setSyzlwz(String syzlwz) {
		this.syzlwz = syzlwz;
	}

	public String getCqmj() {
		return cqmj;
	}

	public void setCqmj(String cqmj) {
		this.cqmj = cqmj;
	}

	public String getSRFZJHM() {
		return SRFZJHM;
	}

	public void setSRFZJHM(String sRFZJHM) {
		SRFZJHM = sRFZJHM;
	}

	public String getSZCS() {
		return SZCS;
	}

	public void setSZCS(String sZCS) {
		SZCS = sZCS;
	}

	public String getHTBH() {
		return HTBH;
	}

	public void setHTBH(String hTBH) {
		HTBH = hTBH;
	}

	public String getJgh() {
		return jgh;
	}

	public void setJgh(String jgh) {
		this.jgh = jgh;
	}

	public String getJkbm() {
		return jkbm;
	}

	public void setJkbm(String jkbm) {
		this.jkbm = jkbm;
	}

	public String getSpeflag() {
		return speflag;
	}

	public void setSpeflag(String speflag) {
		this.speflag = speflag;
	}

	public String getApplyCardType() {
		return applyCardType;
	}

	public void setApplyCardType(String applyCardType) {
		this.applyCardType = applyCardType;
	}

	public String getBelongSystem() {
		return belongSystem;
	}

	public void setBelongSystem(String belongSystem) {
		this.belongSystem = belongSystem;
	}

	public String getApplyName() {
		return applyName;
	}

	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}

	public String getApplyCardNumber() {
		return applyCardNumber;
	}

	public void setApplyCardNumber(String applyCardNumber) {
		this.applyCardNumber = applyCardNumber;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public String getApplyFrom() {
		return applyFrom;
	}

	public void setApplyFrom(String applyFrom) {
		this.applyFrom = applyFrom;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getServiceCodeId() {
		return serviceCodeId;
	}

	public void setServiceCodeId(String serviceCodeId) {
		this.serviceCodeId = serviceCodeId;
	}

	public String getProjId() {
		return projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getPageSize() {
		return pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getBae001() {
		return bae001;
	}

	public void setBae001(String bae001) {
		this.bae001 = bae001;
	}

	public String getAab001() {
		return aab001;
	}

	public void setAab001(String aab001) {
		this.aab001 = aab001;
	}

	public String getBab010() {
		return bab010;
	}

	public void setBab010(String bab010) {
		this.bab010 = bab010;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getFYQSSJ() {
		return FYQSSJ;
	}

	public void setFYQSSJ(String fYQSSJ) {
		FYQSSJ = fYQSSJ;
	}

	public String getJYLX() {
		return JYLX;
	}

	public void setJYLX(String jYLX) {
		JYLX = jYLX;
	}

	public String getFYJSSJ() {
		return FYJSSJ;
	}

	public void setFYJSSJ(String fYJSSJ) {
		FYJSSJ = fYJSSJ;
	}

	public String getSFZH() {
		return SFZH;
	}

	public void setSFZH(String sFZH) {
		SFZH = sFZH;
	}

	public String getJKLX() {
		return JKLX;
	}

	public void setJKLX(String jKLX) {
		JKLX = jKLX;
	}

	public String getGmsfhm() {
		return gmsfhm;
	}

	public void setGmsfhm(String gmsfhm) {
		this.gmsfhm = gmsfhm;
	}

	public String getQlrid() {
		return qlrid;
	}

	public void setQlrid(String qlrid) {
		this.qlrid = qlrid;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getJcrs() {
		return jcrs;
	}

	public void setJcrs(String jcrs) {
		this.jcrs = jcrs;
	}

	public String getJcjsze() {
		return jcjsze;
	}

	public void setJcjsze(String jcjsze) {
		this.jcjsze = jcjsze;
	}

	public String getDwzfgjjzh() {
		return dwzfgjjzh;
	}

	public void setDwzfgjjzh(String dwzfgjjzh) {
		this.dwzfgjjzh = dwzfgjjzh;
	}

	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getMaterialForm() {
		return materialForm;
	}

	public void setMaterialForm(String materialForm) {
		this.materialForm = materialForm;
	}

	public String getSponsorCode() {
		return sponsorCode;
	}

	public void setSponsorCode(String sponsorCode) {
		this.sponsorCode = sponsorCode;
	}

	public String getJcbl() {
		return jcbl;
	}

	public void setJcbl(String jcbl) {
		this.jcbl = jcbl;
	}

	public String getLxr() {
		return lxr;
	}

	public void setLxr(String lxr) {
		this.lxr = lxr;
	}

	public String getYb() {
		return yb;
	}

	public void setYb(String yb) {
		this.yb = yb;
	}

	public String getYjcjs() {
		return yjcjs;
	}

	public void setYjcjs(String yjcjs) {
		this.yjcjs = yjcjs;
	}

	public String getTxdz() {
		return txdz;
	}

	public void setTxdz(String txdz) {
		this.txdz = txdz;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getEntType() {
		return entType;
	}

	public void setEntType(String entType) {
		this.entType = entType;
	}

	public String getNsrmc() {
		return nsrmc;
	}

	public void setNsrmc(String nsrmc) {
		this.nsrmc = nsrmc;
	}

	public String getKprqz() {
		return kprqz;
	}

	public void setKprqz(String kprqz) {
		this.kprqz = kprqz;
	}

	public String getNsrsbh() {
		return nsrsbh;
	}

	public void setNsrsbh(String nsrsbh) {
		this.nsrsbh = nsrsbh;
	}

	public String getDzsphm() {
		return this.dzsphm;
	}

	public void setDzsphm(String dzsphm) {
		this.dzsphm = dzsphm;
	}

	public String getKprqq() {
		return kprqq;
	}

	public void setKprqq(String kprqq) {
		this.kprqq = kprqq;
	}

	public String getAltDate() {
		return AltDate;
	}

	public void setAltDate(String altDate) {
		AltDate = altDate;
	}

	public String getNsrqz() {
		return nsrqz;
	}

	public void setNsrqz(String nsrqz) {
		this.nsrqz = nsrqz;
	}

	public String getNsrqq() {
		return nsrqq;
	}

	public void setNsrqq(String nsrqq) {
		this.nsrqq = nsrqq;
	}

	public String getQshm() {
		return qshm;
	}

	public void setQshm(String qshm) {
		this.qshm = qshm;
	}

	public String getYSXKZTYBH() {
		return YSXKZTYBH;
	}

	public void setYSXKZTYBH(String ySXKZTYBH) {
		YSXKZTYBH = ySXKZTYBH;
	}

	public String getClosereason() {
		return closereason;
	}

	public void setClosereason(String closereason) {
		this.closereason = closereason;
	}

	public String getSydwTycode() {
		return this.sydwTycode;
	}

	public void setSydwTycode(final String sydwTycode) {
		this.sydwTycode = sydwTycode;
	}

	public String getCzrkgmsfhm() {
		return this.czrkgmsfhm;
	}

	public void setCzrkgmsfhm(final String czrkgmsfhm) {
		this.czrkgmsfhm = czrkgmsfhm;
	}

	public String getCert_num_man() {
		return this.cert_num_man;
	}

	public void setCert_num_man(final String cert_num_man) {
		this.cert_num_man = cert_num_man;
	}

	public String getName_man() {
		return this.name_man;
	}

	public void setName_man(final String name_man) {
		this.name_man = name_man;
	}

	public String getCert_num_woman() {
		return this.cert_num_woman;
	}

	public void setCert_num_woman(final String cert_num_woman) {
		this.cert_num_woman = cert_num_woman;
	}

	public String getName_woman() {
		return this.name_woman;
	}

	public void setName_woman(final String name_woman) {
		this.name_woman = name_woman;
	}

	public String getQlr() {
		return this.qlr;
	}

	public void setQlr(final String qlr) {
		this.qlr = qlr;
	}

	public String getZjh() {
		return this.zjh;
	}

	public void setZjh(final String zjh) {
		this.zjh = zjh;
	}
}
