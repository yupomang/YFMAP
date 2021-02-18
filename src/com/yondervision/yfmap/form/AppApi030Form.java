package com.yondervision.yfmap.form;

public class AppApi030Form extends AppApiCommonForm {
	private String appramt;//审批金额
	private String approvaldate;//批准日期

	public String getAppramt() {
		return this.appramt;
	}

	public void setAppramt(final String appramt) {
		this.appramt = appramt;
	}

	public String getApprovaldate() {
		return this.approvaldate;
	}

	public void setApprovaldate(final String approvaldate) {
		this.approvaldate = approvaldate;
	}

	private String ywtype;//业务类型
	private String para;//zwfw加密数据
	private String sfzh;//身份证号15位或18位，从认证用户信息中获取
	private String xm;// 姓名，从认证用户信息中获取
	private String jgh;//选择的公积金缴存地对应的机构号,jgh编码采用《浙江省住房公积金基础数据标准》中“A30机构号”编码。
	private String ywlx;//业务类型，取值为“2.1查询业务类型”。
	private String level;//个人实名认证级别
	
	private String begym;//开始年月
	
	private String  baseInfoXml;//事项办件基础数据
	private String  attrXml;//事项办件附件数据
	private String  formXml;//业务表单信息
	
	private String 	projid;//申报号
	private String 	servicecode;//权利事项编码
	private String 	applyname;//申报者名称
	private String 	apply_cardnumber;//申报者证件号码
	private String 	apply_cardtype;//申报者证件类型
	private String 	telphone;//联系电话
	private String 	receivetime;//申报时间
	
	private String  peoplenum;//本地职工人数:
	private String  isfinished;//是否办结：isfinished（0办结  1非办结）
	private String  seqno;//渠道标志，1为网厅，2为自助终端
	private String  regdate;// 楼盘录入时间
	//可贷楼盘查询
	private String cocustname_wb;//开发商名称	上传
	private String projectname_wb;//楼盘名称	上传
	private String num_web1;//当前页数	上下传
	private String num_web2;//当前页面记录数	上下传

	private String 	housecontrnum;//购房合同号
	private String 	lpstate;//楼盘状态
	private String 	indemhouse;//是否保障性住房
	private String 	isyzr;//是否楼盘准入
	private String 	indiacctype;//个人账户类型
	private String 	infotype;//密码重置/修改标志
	private String 	isgetearnest;//是否收取保证金
	private String 	earnestprop;//保证金比例
	private String 	cocustname;//开发公司名称
	private String 	regaddr;//注册地址
	private String 	leglhandset;//手机
	private String 	certitype1;//证件类型
	private String 	certinum1;//证件号码
	private String 	linkmanphone;//电话(座机)
	private String 	linkmanphone1;//手机
	private String 	founddate;//成立日期
	private String 	pleunitkind;//公司类型
	private String 	regfundtype;//注册资金类型
	private String 	regfund;//注册资本(万元)
	private String 	incfund;//实收资本(万元)
	private String 	evaldate;//评定日期
	private String 	certificatenum;//营业期限类型
	private String 	worksterm;//营业期限
	private String 	depostsite;//公积金缴存地
	private String 	lncrelevel;//信用等级
	private String 	lnunitaccnum;//公积金帐号
	private String 	depositnum;//缴存人数
	private String 	openbankname;//基本账户开户银行
	private String 	openbankaccnum;//基本账户帐号
	private String 	paybankcode;//收款银行代码
	private String 	paybankname;//收款银行名称
	private String 	paybankaccnm;//收款银行账户名称
	private String 	paybankaccnum;//收款银行账户
	private String 	cityswapno;//同城交换号
	private String 	bankcorrno;//支行联行号
	private String 	earnestaccname;//保证金账户名称
	private String 	earnstbankaccnum;//保证金开户银行帐号
	private String 	housesit;//楼盘坐落位置
	private String 	glebelevel;//地段等级
	private String 	landkind;//土地性质
	private String 	guarmode;//担保方式
	private String 	buildarea;//土地面积
	private String 	salbuildarea;//总建筑面积(平方米)
	private String 	salresconarea;//可售住宅面积(平方米)
	private String 	salhounum;//可售住宅套数
	private String 	buildtype;//楼盘类型
	private String 	polecounts;//楼盘总栋数
	private String 	amttype;//投资额资金类型
	private String 	prototint;//总投资额
	private String 	prohasint;//本期投资额
	private String 	plandevarea;//计划开发建筑面积
	private String 	realdevarea;//实际开发建筑面积
	private String 	salehouseint;//可售住宅总额(万元)
	private String 	salehouseprice;//可售住宅均价
	private String 	plandelidate;//预计交付日期
	private String 	profundsales;//拟贷款套数
	private String 	projapploanamt;//预计贷款资金总量(万元)
	private String 	housenum1;//90(不包含)平米以下套数
	private String 	housearea1;//90(不包含)平米以下面积
	private String 	housenum2;//90(包含)-144(不包含)平米套数
	private String 	housearea2;//90(包含)-144(不包含)平米面积
	private String 	housenum3;//144(包含)平米以上套数
	private String 	housearea3;//144(包含)平米以上面积
	private String 	lowhousenum;//低层住宅套数
	private String 	lowhousearea;//低层住宅建筑面积
	private String 	melonhousenum;//多层住宅套数
	private String 	melonhousearea;//多层住宅建筑面积
	private String 	miduphousenum;//中高层住宅套数
	private String 	miduphousearea;//中高层住宅建筑面积
	private String 	highhousenum;//高层住宅套数
	private String 	highhousearea;//高层住宅建筑面积
	private String 	isgetall;//预售许可证是否收全
	private String 	avaloansum;//可提供贷款额度
	private String 	loanbegdate;//预计放贷开始日期
	private String 	agrtoffdate;//合作到期日
	private String 	loanenddate;//放贷结束日期
	
	

	private String 	superbankcode	;//分行
	private String 	loancontrnum;//受理号
	private String 	newloanterm;//新贷款期限
	private String 	newrepaymode;//还款方式
	private String 	payerbankacc;//付款人账户
	private String 	payerbankaccnm;//付款人户名
	private String 	payerbankcode;//付款银行
	private String 	payercertinum;//付款人证件号码
	private String 	payercertitype;//付款人证件类型
	private String 	payertype;//付款人类型
	private String 	settlemode;//结算方式
	private String 	repaytype;//还款类型
	private String 	repaytolamt;//还款总金额
	
	private String 	crtflag;//密码重置/修改标志
	private String 	type;//密码重置/修改标志
	private String 	newpassword;//新密码
	private String 	confirmnewpassword;//确认新密码
	
	
	private String 	buslicnum;//	营业执照号码
	private String 	tysocialxydm;//	统一社会信用代码
	private String 	qualevel;//	开发资质
	private String 	saleprojectname;//	楼盘名称（预售许可证）
	private String 	projarea;//	楼盘所在地
	private String 	linkman;//	经办人姓名
	private String 	checkcode;//	手机验证码
	

	private String 	realdpayamt;
	private String 	ukeynum;
	private String 	bankaccnm;
	private String 	bankaccnum;
	
	private String 	comcialflag;
	private String 	loanbal;
	private String 	loancontrstate;

	private String 	pubaccnum;//账户账号
	//===================宁波新加for不动产抵押证明领取预约		
	private String 	lnundtkbcode;//受理分行
	private String 	lnundtksubbcode;//受理支行
	private String 	linkphone;//接收手机号

	//===================宁波新加for个人贷款试算		
	private String 	instcode;//预约人公积金缴存地
	private String 	lnaccnum;//借款人个人公积金缴存账号
	private String 	basenum;//公积金缴存基数
	private String 	conpaymonth;//公积金账户连续缴存月份分类
	private String 	loantimes;//公积金贷款认定次数
	private String 	apploanterm;//借款人申请贷款年限
	private String 	apploanamt;//贷款申请金额
	private String 	usebal;//账户认定余额
	private String 	shisuantype;//试算类型
	private String 	housetype;//房屋类型
	private String 	rangeyear;//离退休年纪
	private String 	loanhousenum;//第n套房贷款
	private String 	age;//年龄

	private String projectname;//贷款地中心名称 
	private String loaneecertinum;//证件号码 
	//===================宁波新加for提前还款试算		
	private String curbal;//当前余额
	private String loanrate;//贷款月利率
	private String repaymode;//还款方式
	private String repaycycle;//还款周期
	private String remainterm;//剩余期限
	private String shttermflag;//计算方式
	private String transdate;//还款日期
	private String loancontrcode;//合同代码
	private String planrepaydate;//计划还款日期

	private String frzflag;
	//===================宁波新加for一般提取		
	private String buyhousetype;
	private String accloantype;
	private String renttype;
	private String payeebankcode;
	private String FinancialDate;
	private String monthrepayamt;
	private String buyhouseamt;
	private String commonthrepayamt;
	private String rentnum3;
	private String rentname;
	private String rentcertinum;
	private String rentdate;
	private String rentenddate;
	private String rentamt;
	private String buyhousename;
	private String buyhousecerid;
	private String buyhousedate;
	private String lasttrsdate;
	private String loansum;
	private String loanterm;
	private String certinum;
	private String certitype;
	private String commloansum;
	private String repaylntype;
	private String contrsigndate;
	private String drawreasoncode1;
	private String bankcode;
	private String houseaddr;
	private String inputamt;
	private String drawreason;
	private String relation;
	private String payeebankaccnum;
	private String bal;
	private String monbal;
	private String supbal;
	private String subbal;

	//===================宁波新加for一般提取可提取金额计算		
	private String 	clearamt;//结清金额
	private String 	cleardate;//结清日期
	private String 	ahdrepayamt;//提前部分还款金额
	private String 	conamt;//政府补贴金额

	//++++++++++++++++++++++++张杰于20201218由异地缴存证明新接口调用
	/** 业务名称 */
	private String businName = "";

	private String centername;
	/** 统一信用代码和单位名称 */
	private String spt_tyxyydm = "";
	private String spt_dwmc = "";

	/** 年审经办人手机号码 */				
	private String handset = "";		
	/** 年审经办人姓名 */				
	private String accname = "";		
	/** 外来务工人数 */				
	private String mannum = "";	
	/** 转出机构号 */				
	private String tsoinstcode = "";		
	/** 变更前比例 */				
	private String bfchgunitprop = "";				
	/** 变更后比例 */				
	private String afchgunitprop = "";	
	/** 页码 */				
	private String pagenum = "";				
	/** 行数 */				
	private String pagerows = "";				
	/** 开始日期 */				
	private String startdate = "";				
					
	/** 是否分页标识 */	
	private String ispaging = "";
	
	/** 确认标志 */			
	private String checkin = "";			
	/** 登记号 */			
	private String regnum = "";
	
	/** 个人公积金账号 */			
	private String accnum = "";			
	/** 借款人一身份证号 */			
	private String lncertinum1 = "";			
	/** 贷款合同号 */			
	private String lncontrnum = "";			
	/** 本次实还金额 */			
	private String retamt = "";			
	/** 交易标志 */			
	private String tranflag = "";			
	/** 代扣账号 */			
	private String dedaccnum = "";			
	
	/** 单位公积金账号 */			
	private String unitaccnum = "";			
	/** 单位名称 */			
	private String unitaccname = "";			
	/** 单位地址 */			
	private String unitaddr = "";			
	/** 经办部门 */			
	private String agentdept = "";			
	/** 联系人 */			
	private String unitlinkman = "";			
	/** 联系电话1 */			
	private String unitlinkphone = "";			
	/** 联系电话2 */			
	private String unitlinkphone2 = "";			
	/** 上传批量文件名 */			
	private String filename = "";			
	/** 业务流程号 */			
	private String flowids = "";			
	/** 申请调整原因 */			
	private String appadjustreason = "";			
	/** 批准文号 */			
	private String authfilenum = "";			
	/** 启用年月 */			
	private String beginpaydate = "";			
	/** 变更人数 */			
	private String changepeople = "";
	/** 开始年月 */			
	private String begdate = "";	
	/** 终止年月 */			
	private String enddate = "";			
	/** 调整后个人比例 */			
	private String newperprop = "";			
	/** 调整后单位比例 */			
	private String newunitprop = "";			
	/** 转入单位公积金账号 */			
	private String tsiunitaccnum = "";			
	/** 转出单位公积金账号 */			
	private String tsounitaccnum = "";			
	/** 终止年月 */			
	private String endym = "";			
	/** 支付方式 */			
	private String paymode = "";			
	/** 自筹财政标志 */			
	private String selfintype = "";			
	/** 本次补缴金额 */			
	private String payamt = "";			
			
	/** 本次补缴人数 */			
	private String paynum = "";			
	/** 补缴类型 */			
	private String spaytype = "";			

	/** 补贴方式 */			
	private String dpsubsidytype = "";			
	
//===================宁波新加for公共字段		
	/** 渠道受理号 */	
	private String qdapprnum= "";
	/** 上传文件路径 */	
	private String qdfilepath= "";
	/** 上传文件名 */	
	private String qdfilename= "";
	/** 分页标识 */	
	private String pageflag= "";
	/** 每页条数 */	
	private String pagesum= "";
//===================宁波新加for单位资料变更		
	private String basebankname= "";
	private String createfileregnum= "";
	private String leglphone= "";
	private String licensenum= "";
	private String linkmanmsn= "";
	private String msumsalry= "";
	private String tradetype= "";
	private String createfile= "";
	private String indihigprop= "";
	private String indispeprop= "";
	private String linkmancertinum= "";
	private String orgcode= "";
	private String relpelnum= "";
	private String salbankaccnum= "";
	private String salday= "";
	private String createdate= "";
	private String newpubcustid1= "";
	private String unitauth2= "";
	private String apprnum= "";
	private String funcno= ""; 
	private String leglcertinum= "";
	private String unithigprop= "";
	private String cmfundsouflag= "";
	private String linkmanqq= "";
	private String salbankcode= "";
	private String speflag= "";
	private String zip= "";
	private String flag= "";
	private String leglcertitype= "";
	private String linkmancertitype= "";
	private String linkmanemail= "";
	private String unitareacode= "";
	private String unitauth1= "";
	private String unitspeprop= "";
	private String unitycode= "";
	private String leglaccname= "";
	private String newpubcustid2= "";
	private String salbankaccnm= "";
	private String unitsoicode= "";
	private String accbankcode= "";
	private String economytype= "";
	private String indinorprop= "";
	private String supsubrelation= "";
	private String unitlicaddr= "";
	private String unitnorprop= "";
	private String webbusmaget= "";
	private String cagorcode= "";
	private String chgtype= "";

	public String getCagorcode() {
		return this.cagorcode;
	}

	public void setCagorcode(String cagorcode) {
		this.cagorcode = cagorcode;
	}

	public String getChgtype() {
		return this.chgtype;
	}

	public void setChgtype(String chgtype) {
		this.chgtype = chgtype;
	}
//===================株洲新加
	/** 密码 */			
	private String password = "";
	private String acceptreason     = "";
	private String accinstcode      = "";
	private String agentinstcode    = "";
	private String agentop          = "";
	private String approveop        = "";
	private String authop           = "";
	private String baseuppflag      = "";
	private String checkid          = "";
	private String chkop            = "";
	private String cocietycode      = "";
	private String comflag          = "";
	private String crefilnum        = "";
	private String dwdz             = "";
	private String dwdzxx           = "";
	private String dwfrdbxm         = "";
	private String dwfrdbzjhm       = "";
	private String dwfrdbzjlx       = "";
	private String dwfxr            = "";
	private String dwjjlx           = "";
	private String dwlsgx           = "";
	private String dwmc             = "";
	private String basebankaccname  = "";
	private String basebankaccnum   = "";
	private String dwslrq           = "";
	private String dwsshy           = "";
	private String dwyb             = "";
	private String dwzh             = "";
	private String finalflag        = "";
	private String insurancenum     = "";
	private String isserdispach     = "";
	private String jbrgddhhm        = "";
	private String resuflag         = "";
	private String unitacctype      = "";
	private String jbrqq            = "";
	private String jbrrzsj          = "";
	private String jbrsfpx          = "";
	private String jbrsjhm          = "";
	private String jbrxm            = "";
	private String jbrzjhm          = "";
	private String jbrzjlx          = "";
	private String mngdept          = "";
	private String mngdepter        = "";
	private String mngdepterphone   = "";
	private String orgtype          = "";
	private String ownershipkind    = "";
	private String remark           = "";
	private String unitcustid       = "";
	private String unitkind         = "";
	private String useflag          = "";
	private String workernum        = "";
	private String zzjgdm           = "";
	private String dwfrdbsjhm  = "";
	//个人缴存证明打印04203 start
	/** 交易代码 */			
	private String transcode = "";
	/** 类型 */			
	private String transtype = "";
	//个人缴存证明打印04203 end
//===================株洲新加	
	public String getQdapprnum() {
		return qdapprnum;
	}

	public void setQdapprnum(String qdapprnum) {
		this.qdapprnum = qdapprnum;
	}

	public String getQdfilepath() {
		return qdfilepath;
	}

	public void setQdfilepath(String qdfilepath) {
		this.qdfilepath = qdfilepath;
	}

	public String getQdfilename() {
		return qdfilename;
	}

	public void setQdfilename(String qdfilename) {
		this.qdfilename = qdfilename;
	}

	public String getPageflag() {
		return pageflag;
	}

	public void setPageflag(String pageflag) {
		this.pageflag = pageflag;
	}

	public String getPagesum() {
		return pagesum;
	}

	public void setPagesum(String pagesum) {
		this.pagesum = pagesum;
	}
	public String getBegdate() {
		return begdate;
	}

	public void setBegdate(String begdate) {
		this.begdate = begdate;
	}

	public String getTranscode() {
		return transcode;
	}

	public void setTranscode(String transcode) {
		this.transcode = transcode;
	}

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	/**			
	 *<pre> 执行获取个人公积金账号处理 </pre>			
	 * @return accnum 个人公积金账号			
	 */			
	public String getAccnum() {			
	    return accnum;			
	}			
				
	/**			
	 *<pre> 执行设定个人公积金账号处理 </pre>			
	 * @param accnum 个人公积金账号			
	 */			
	public void setAccnum(String accnum) {			
	    this.accnum = accnum;			
	}			
				
	/**			
	 *<pre> 执行获取借款人一身份证号处理 </pre>			
	 * @return lncertinum1 借款人一身份证号			
	 */			
	public String getLncertinum1() {			
	    return lncertinum1;			
	}			
				
	/**			
	 *<pre> 执行设定借款人一身份证号处理 </pre>			
	 * @param lncertinum1 借款人一身份证号			
	 */			
	public void setLncertinum1(String lncertinum1) {			
	    this.lncertinum1 = lncertinum1;			
	}			
				
	/**			
	 *<pre> 执行获取贷款合同号处理 </pre>			
	 * @return lncontrnum 贷款合同号			
	 */			
	public String getLncontrnum() {			
	    return lncontrnum;			
	}			
				
	/**			
	 *<pre> 执行设定贷款合同号处理 </pre>			
	 * @param lncontrnum 贷款合同号			
	 */			
	public void setLncontrnum(String lncontrnum) {			
	    this.lncontrnum = lncontrnum;			
	}			
				
		
				
	/**			
	 *<pre> 执行获取交易标志处理 </pre>			
	 * @return tranflag 交易标志			
	 */			
	public String getTranflag() {			
	    return tranflag;			
	}			
				
	/**			
	 *<pre> 执行设定交易标志处理 </pre>			
	 * @param tranflag 交易标志			
	 */			
	public void setTranflag(String tranflag) {			
	    this.tranflag = tranflag;			
	}			
				
	/**			
	 *<pre> 执行获取代扣账号处理 </pre>			
	 * @return dedaccnum 代扣账号			
	 */			
	public String getDedaccnum() {			
	    return dedaccnum;			
	}			
				
	/**			
	 *<pre> 执行设定代扣账号处理 </pre>			
	 * @param dedaccnum 代扣账号			
	 */			
	public void setDedaccnum(String dedaccnum) {			
	    this.dedaccnum = dedaccnum;			
	}			
				
	/**			
	 *<pre> 执行获取本次实还金额处理 </pre>			
	 * @return retamt 本次实还金额			
	 */			
	public String getRetamt() {			
	    return retamt;			
	}			
				
	/**			
	 *<pre> 执行设定本次实还金额处理 </pre>			
	 * @param retamt 本次实还金额			
	 */			
	public void setRetamt(String retamt) {			
	    this.retamt = retamt;			
	}			
				
	/**			
	 *<pre> 执行获取单位公积金账号处理 </pre>			
	 * @return unitaccnum 单位公积金账号			
	 */			
	public String getUnitaccnum() {			
	    return unitaccnum;			
	}			
				
	/**			
	 *<pre> 执行设定单位公积金账号处理 </pre>			
	 * @param unitaccnum 单位公积金账号			
	 */			
	public void setUnitaccnum(String unitaccnum) {			
	    this.unitaccnum = unitaccnum;			
	}			
				
	/**			
	 *<pre> 执行获取单位名称处理 </pre>			
	 * @return unitaccname 单位名称			
	 */			
	public String getUnitaccname() {			
	    return unitaccname;			
	}			
				
	/**			
	 *<pre> 执行设定单位名称处理 </pre>			
	 * @param unitaccname 单位名称			
	 */			
	public void setUnitaccname(String unitaccname) {			
	    this.unitaccname = unitaccname;			
	}			
				
	/**			
	 *<pre> 执行获取单位地址处理 </pre>			
	 * @return unitaddr 单位地址			
	 */			
	public String getUnitaddr() {			
	    return unitaddr;			
	}			
				
	/**			
	 *<pre> 执行设定单位地址处理 </pre>			
	 * @param unitaddr 单位地址			
	 */			
	public void setUnitaddr(String unitaddr) {			
	    this.unitaddr = unitaddr;			
	}			
				
	/**			
	 *<pre> 执行获取经办部门处理 </pre>			
	 * @return agentdept 经办部门			
	 */			
	public String getAgentdept() {			
	    return agentdept;			
	}			
				
	/**			
	 *<pre> 执行设定经办部门处理 </pre>			
	 * @param agentdept 经办部门			
	 */			
	public void setAgentdept(String agentdept) {			
	    this.agentdept = agentdept;			
	}			
				
	/**			
	 *<pre> 执行获取联系人处理 </pre>			
	 * @return unitlinkman 联系人			
	 */			
	public String getUnitlinkman() {			
	    return unitlinkman;			
	}			
				
	/**			
	 *<pre> 执行设定联系人处理 </pre>			
	 * @param unitlinkman 联系人			
	 */			
	public void setUnitlinkman(String unitlinkman) {			
	    this.unitlinkman = unitlinkman;			
	}			
				
	/**			
	 *<pre> 执行获取联系电话1处理 </pre>			
	 * @return unitlinkphone 联系电话1			
	 */			
	public String getUnitlinkphone() {			
	    return unitlinkphone;			
	}			
				
	/**			
	 *<pre> 执行设定联系电话1处理 </pre>			
	 * @param unitlinkphone 联系电话1			
	 */			
	public void setUnitlinkphone(String unitlinkphone) {			
	    this.unitlinkphone = unitlinkphone;			
	}			
				
	/**			
	 *<pre> 执行获取联系电话2处理 </pre>			
	 * @return unitlinkphone2 联系电话2			
	 */			
	public String getUnitlinkphone2() {			
	    return unitlinkphone2;			
	}			
				
	/**			
	 *<pre> 执行设定联系电话2处理 </pre>			
	 * @param unitlinkphone2 联系电话2			
	 */			
	public void setUnitlinkphone2(String unitlinkphone2) {			
	    this.unitlinkphone2 = unitlinkphone2;			
	}			
				
	/**			
	 *<pre> 执行获取上传批量文件名处理 </pre>			
	 * @return filename 上传批量文件名			
	 */			
	public String getFilename() {			
	    return filename;			
	}			
	/**			
	 *<pre> 执行设定上传批量文件名处理 </pre>			
	 * @param filename 上传批量文件名			
	 */			
	public void setFilename(String filename) {			
	    this.filename = filename;			
	}			
	/**			
	 *<pre> 执行获取业务流程号处理 </pre>			
	 * @return flowids 业务流程号			
	 */			
	public String getFlowids() {			
	    return flowids;			
	}			
	/**			
	 *<pre> 执行设定业务流程号处理 </pre>			
	 * @param flowids 业务流程号			
	 */			
	public void setFlowids(String flowids) {			
	    this.flowids = flowids;			
	}			
	/**			
	 *<pre> 执行获取申请调整原因处理 </pre>			
	 * @return appadjustreason 申请调整原因			
	 */			
	public String getAppadjustreason() {			
	    return appadjustreason;			
	}			
	/**			
	 *<pre> 执行设定申请调整原因处理 </pre>			
	 * @param appadjustreason 申请调整原因			
	 */			
	public void setAppadjustreason(String appadjustreason) {			
	    this.appadjustreason = appadjustreason;			
	}			
	/**			
	 *<pre> 执行获取批准文号处理 </pre>			
	 * @return authfilenum 批准文号			
	 */			
	public String getAuthfilenum() {			
	    return authfilenum;			
	}			
	/**			
	 *<pre> 执行设定批准文号处理 </pre>			
	 * @param authfilenum 批准文号			
	 */			
	public void setAuthfilenum(String authfilenum) {			
	    this.authfilenum = authfilenum;			
	}			
	/**			
	 *<pre> 执行获取启用年月处理 </pre>			
	 * @return beginpaydate 启用年月			
	 */			
	public String getBeginpaydate() {			
	    return beginpaydate;			
	}			
	/**			
	 *<pre> 执行设定启用年月处理 </pre>			
	 * @param beginpaydate 启用年月			
	 */			
	public void setBeginpaydate(String beginpaydate) {			
	    this.beginpaydate = beginpaydate;			
	}			
	/**			
	 *<pre> 执行获取变更人数处理 </pre>			
	 * @return changepeople 变更人数			
	 */			
	public String getChangepeople() {			
	    return changepeople;			
	}			
	/**			
	 *<pre> 执行设定变更人数处理 </pre>			
	 * @param changepeople 变更人数			
	 */			
	public void setChangepeople(String changepeople) {			
	    this.changepeople = changepeople;			
	}			
				
	/**			
	 *<pre> 执行获取终止年月处理 </pre>			
	 * @return enddate 终止年月			
	 */			
	public String getEnddate() {			
	    return enddate;			
	}			
				
	/**			
	 *<pre> 执行设定终止年月处理 </pre>			
	 * @param enddate 终止年月			
	 */			
	public void setEnddate(String enddate) {			
	    this.enddate = enddate;			
	}			
				
	/**			
	 *<pre> 执行获取调整后个人比例处理 </pre>			
	 * @return newperprop 调整后个人比例			
	 */			
	public String getNewperprop() {			
	    return newperprop;			
	}			
				
	/**			
	 *<pre> 执行设定调整后个人比例处理 </pre>			
	 * @param newperprop 调整后个人比例			
	 */			
	public void setNewperprop(String newperprop) {			
	    this.newperprop = newperprop;			
	}			
				
	/**			
	 *<pre> 执行获取调整后单位比例处理 </pre>			
	 * @return newunitprop 调整后单位比例			
	 */			
	public String getNewunitprop() {			
	    return newunitprop;			
	}			
				
	/**			
	 *<pre> 执行设定调整后单位比例处理 </pre>			
	 * @param newunitprop 调整后单位比例			
	 */			
	public void setNewunitprop(String newunitprop) {			
	    this.newunitprop = newunitprop;			
	}			
				
	/**			
	 *<pre> 执行获取转入单位公积金账号处理 </pre>			
	 * @return tsiunitaccnum 转入单位公积金账号			
	 */			
	public String getTsiunitaccnum() {			
	    return tsiunitaccnum;			
	}			
				
	/**			
	 *<pre> 执行设定转入单位公积金账号处理 </pre>			
	 * @param tsiunitaccnum 转入单位公积金账号			
	 */			
	public void setTsiunitaccnum(String tsiunitaccnum) {			
	    this.tsiunitaccnum = tsiunitaccnum;			
	}			
				
	/**			
	 *<pre> 执行获取转出单位公积金账号处理 </pre>			
	 * @return tsounitaccnum 转出单位公积金账号			
	 */			
	public String getTsounitaccnum() {			
	    return tsounitaccnum;			
	}			
				
	/**			
	 *<pre> 执行设定转出单位公积金账号处理 </pre>			
	 * @param tsounitaccnum 转出单位公积金账号			
	 */			
	public void setTsounitaccnum(String tsounitaccnum) {			
	    this.tsounitaccnum = tsounitaccnum;			
	}			
				
	/**			
	 *<pre> 执行获取终止年月处理 </pre>			
	 * @return endym 终止年月			
	 */			
	public String getEndym() {			
	    return endym;			
	}			
				
	/**			
	 *<pre> 执行设定终止年月处理 </pre>			
	 * @param endym 终止年月			
	 */			
	public void setEndym(String endym) {			
	    this.endym = endym;			
	}			
				
			
				
	/**			
	 *<pre> 执行获取自筹财政标志处理 </pre>			
	 * @return selfintype 自筹财政标志			
	 */			
	public String getSelfintype() {			
	    return selfintype;			
	}			
				
	/**			
	 *<pre> 执行设定自筹财政标志处理 </pre>			
	 * @param selfintype 自筹财政标志			
	 */			
	public void setSelfintype(String selfintype) {			
	    this.selfintype = selfintype;			
	}			
				
	/**			
	 *<pre> 执行获取本次补缴金额处理 </pre>			
	 * @return payamt 本次补缴金额			
	 */			
	public String getPayamt() {			
	    return payamt;			
	}			
				
	/**			
	 *<pre> 执行设定本次补缴金额处理 </pre>			
	 * @param payamt 本次补缴金额			
	 */			
	public void setPayamt(String payamt) {			
	    this.payamt = payamt;			
	}			
				
	/**			
	 *<pre> 执行获取支付方式处理 </pre>			
	 * @return paymode 支付方式			
	 */			
	public String getPaymode() {			
	    return paymode;			
	}			
				
	/**			
	 *<pre> 执行设定支付方式处理 </pre>			
	 * @param paymode 支付方式			
	 */			
	public void setPaymode(String paymode) {			
	    this.paymode = paymode;			
	}			
				
	/**			
	 *<pre> 执行获取本次补缴人数处理 </pre>			
	 * @return paynum 本次补缴人数			
	 */			
	public String getPaynum() {			
	    return paynum;			
	}			
				
	/**			
	 *<pre> 执行设定本次补缴人数处理 </pre>			
	 * @param paynum 本次补缴人数			
	 */			
	public void setPaynum(String paynum) {			
	    this.paynum = paynum;			
	}			
				
	/**			
	 *<pre> 执行获取补缴类型处理 </pre>			
	 * @return spaytype 补缴类型			
	 */			
	public String getSpaytype() {			
	    return spaytype;			
	}			
				
	/**			
	 *<pre> 执行设定补缴类型处理 </pre>			
	 * @param spaytype 补缴类型			
	 */			
	public void setSpaytype(String spaytype) {			
	    this.spaytype = spaytype;			
	}

	public String getPagenum() {
		return pagenum;
	}

	public String getPagerows() {
		return pagerows;
	}

	public String getStartdate() {
		return startdate;
	}

	public String getIspaging() {
		return ispaging;
	}

	public void setPagenum(String pagenum) {
		this.pagenum = pagenum;
	}

	public void setPagerows(String pagerows) {
		this.pagerows = pagerows;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public void setIspaging(String ispaging) {
		this.ispaging = ispaging;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getRegnum() {
		return regnum;
	}

	public void setRegnum(String regnum) {
		this.regnum = regnum;
	}

	public String getAcceptreason() {
		return acceptreason;
	}

	public void setAcceptreason(String acceptreason) {
		this.acceptreason = acceptreason;
	}

	public String getAccinstcode() {
		return accinstcode;
	}

	public void setAccinstcode(String accinstcode) {
		this.accinstcode = accinstcode;
	}

	public String getAgentinstcode() {
		return agentinstcode;
	}

	public void setAgentinstcode(String agentinstcode) {
		this.agentinstcode = agentinstcode;
	}

	public String getAgentop() {
		return agentop;
	}

	public void setAgentop(String agentop) {
		this.agentop = agentop;
	}

	public String getApproveop() {
		return approveop;
	}

	public void setApproveop(String approveop) {
		this.approveop = approveop;
	}

	public String getAuthop() {
		return authop;
	}

	public void setAuthop(String authop) {
		this.authop = authop;
	}

	public String getBaseuppflag() {
		return baseuppflag;
	}

	public void setBaseuppflag(String baseuppflag) {
		this.baseuppflag = baseuppflag;
	}

	public String getCheckid() {
		return checkid;
	}

	public void setCheckid(String checkid) {
		this.checkid = checkid;
	}

	public String getChkop() {
		return chkop;
	}

	public void setChkop(String chkop) {
		this.chkop = chkop;
	}

	public String getCocietycode() {
		return cocietycode;
	}

	public void setCocietycode(String cocietycode) {
		this.cocietycode = cocietycode;
	}

	public String getComflag() {
		return comflag;
	}

	public void setComflag(String comflag) {
		this.comflag = comflag;
	}

	public String getCrefilnum() {
		return crefilnum;
	}

	public void setCrefilnum(String crefilnum) {
		this.crefilnum = crefilnum;
	}

	public String getDwdz() {
		return dwdz;
	}

	public void setDwdz(String dwdz) {
		this.dwdz = dwdz;
	}

	public String getDwdzxx() {
		return dwdzxx;
	}

	public void setDwdzxx(String dwdzxx) {
		this.dwdzxx = dwdzxx;
	}

	public String getDwfrdbxm() {
		return dwfrdbxm;
	}

	public void setDwfrdbxm(String dwfrdbxm) {
		this.dwfrdbxm = dwfrdbxm;
	}

	public String getDwfrdbzjhm() {
		return dwfrdbzjhm;
	}

	public void setDwfrdbzjhm(String dwfrdbzjhm) {
		this.dwfrdbzjhm = dwfrdbzjhm;
	}

	public String getDwfrdbzjlx() {
		return dwfrdbzjlx;
	}

	public void setDwfrdbzjlx(String dwfrdbzjlx) {
		this.dwfrdbzjlx = dwfrdbzjlx;
	}

	public String getDwfxr() {
		return dwfxr;
	}

	public void setDwfxr(String dwfxr) {
		this.dwfxr = dwfxr;
	}

	public String getDwjjlx() {
		return dwjjlx;
	}

	public void setDwjjlx(String dwjjlx) {
		this.dwjjlx = dwjjlx;
	}

	public String getDwlsgx() {
		return dwlsgx;
	}

	public void setDwlsgx(String dwlsgx) {
		this.dwlsgx = dwlsgx;
	}

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getBasebankaccname() {
		return basebankaccname;
	}

	public void setBasebankaccname(String basebankaccname) {
		this.basebankaccname = basebankaccname;
	}

	public String getBasebankaccnum() {
		return basebankaccnum;
	}

	public void setBasebankaccnum(String basebankaccnum) {
		this.basebankaccnum = basebankaccnum;
	}

	public String getDwslrq() {
		return dwslrq;
	}

	public void setDwslrq(String dwslrq) {
		this.dwslrq = dwslrq;
	}

	public String getDwsshy() {
		return dwsshy;
	}

	public void setDwsshy(String dwsshy) {
		this.dwsshy = dwsshy;
	}

	public String getDwyb() {
		return dwyb;
	}

	public void setDwyb(String dwyb) {
		this.dwyb = dwyb;
	}

	public String getDwzh() {
		return dwzh;
	}

	public void setDwzh(String dwzh) {
		this.dwzh = dwzh;
	}

	public String getFinalflag() {
		return finalflag;
	}

	public void setFinalflag(String finalflag) {
		this.finalflag = finalflag;
	}

	public String getInsurancenum() {
		return insurancenum;
	}

	public void setInsurancenum(String insurancenum) {
		this.insurancenum = insurancenum;
	}

	public String getIsserdispach() {
		return isserdispach;
	}

	public void setIsserdispach(String isserdispach) {
		this.isserdispach = isserdispach;
	}

	public String getJbrgddhhm() {
		return jbrgddhhm;
	}

	public void setJbrgddhhm(String jbrgddhhm) {
		this.jbrgddhhm = jbrgddhhm;
	}

	public String getResuflag() {
		return resuflag;
	}

	public void setResuflag(String resuflag) {
		this.resuflag = resuflag;
	}

	public String getUnitacctype() {
		return unitacctype;
	}

	public void setUnitacctype(String unitacctype) {
		this.unitacctype = unitacctype;
	}

	public String getJbrqq() {
		return jbrqq;
	}

	public void setJbrqq(String jbrqq) {
		this.jbrqq = jbrqq;
	}

	public String getJbrrzsj() {
		return jbrrzsj;
	}

	public void setJbrrzsj(String jbrrzsj) {
		this.jbrrzsj = jbrrzsj;
	}

	public String getJbrsfpx() {
		return jbrsfpx;
	}

	public void setJbrsfpx(String jbrsfpx) {
		this.jbrsfpx = jbrsfpx;
	}

	public String getJbrsjhm() {
		return jbrsjhm;
	}

	public void setJbrsjhm(String jbrsjhm) {
		this.jbrsjhm = jbrsjhm;
	}

	public String getJbrxm() {
		return jbrxm;
	}

	public void setJbrxm(String jbrxm) {
		this.jbrxm = jbrxm;
	}

	public String getJbrzjhm() {
		return jbrzjhm;
	}

	public void setJbrzjhm(String jbrzjhm) {
		this.jbrzjhm = jbrzjhm;
	}

	public String getJbrzjlx() {
		return jbrzjlx;
	}

	public void setJbrzjlx(String jbrzjlx) {
		this.jbrzjlx = jbrzjlx;
	}

	public String getMngdept() {
		return mngdept;
	}

	public void setMngdept(String mngdept) {
		this.mngdept = mngdept;
	}

	public String getMngdepter() {
		return mngdepter;
	}

	public void setMngdepter(String mngdepter) {
		this.mngdepter = mngdepter;
	}

	public String getMngdepterphone() {
		return mngdepterphone;
	}

	public void setMngdepterphone(String mngdepterphone) {
		this.mngdepterphone = mngdepterphone;
	}

	public String getOrgtype() {
		return orgtype;
	}

	public void setOrgtype(String orgtype) {
		this.orgtype = orgtype;
	}

	public String getOwnershipkind() {
		return ownershipkind;
	}

	public void setOwnershipkind(String ownershipkind) {
		this.ownershipkind = ownershipkind;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUnitcustid() {
		return unitcustid;
	}

	public void setUnitcustid(String unitcustid) {
		this.unitcustid = unitcustid;
	}

	public String getUnitkind() {
		return unitkind;
	}

	public void setUnitkind(String unitkind) {
		this.unitkind = unitkind;
	}

	public String getUseflag() {
		return useflag;
	}

	public void setUseflag(String useflag) {
		this.useflag = useflag;
	}

	public String getWorkernum() {
		return workernum;
	}

	public void setWorkernum(String workernum) {
		this.workernum = workernum;
	}

	public String getZzjgdm() {
		return zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}

	public String getDwfrdbsjhm() {
		return dwfrdbsjhm;
	}

	public void setDwfrdbsjhm(String dwfrdbsjhm) {
		this.dwfrdbsjhm = dwfrdbsjhm;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	
	public String getBasebankname() {
		return basebankname;
	}

	public void setBasebankname(String basebankname) {
		this.basebankname = basebankname;
	}

	public String getCreatefileregnum() {
		return createfileregnum;
	}

	public void setCreatefileregnum(String createfileregnum) {
		this.createfileregnum = createfileregnum;
	}

	public String getLeglphone() {
		return leglphone;
	}

	public void setLeglphone(String leglphone) {
		this.leglphone = leglphone;
	}

	public String getLicensenum() {
		return licensenum;
	}

	public void setLicensenum(String licensenum) {
		this.licensenum = licensenum;
	}

	public String getLinkmanmsn() {
		return linkmanmsn;
	}

	public void setLinkmanmsn(String linkmanmsn) {
		this.linkmanmsn = linkmanmsn;
	}

	public String getMsumsalry() {
		return msumsalry;
	}

	public void setMsumsalry(String msumsalry) {
		this.msumsalry = msumsalry;
	}

	public String getTradetype() {
		return tradetype;
	}

	public void setTradetype(String tradetype) {
		this.tradetype = tradetype;
	}

	public String getCreatefile() {
		return createfile;
	}

	public void setCreatefile(String createfile) {
		this.createfile = createfile;
	}

	public String getIndihigprop() {
		return indihigprop;
	}

	public void setIndihigprop(String indihigprop) {
		this.indihigprop = indihigprop;
	}

	public String getIndispeprop() {
		return indispeprop;
	}

	public void setIndispeprop(String indispeprop) {
		this.indispeprop = indispeprop;
	}

	public String getLinkmancertinum() {
		return linkmancertinum;
	}

	public void setLinkmancertinum(String linkmancertinum) {
		this.linkmancertinum = linkmancertinum;
	}

	public String getOrgcode() {
		return orgcode;
	}

	public void setOrgcode(String orgcode) {
		this.orgcode = orgcode;
	}

	public String getRelpelnum() {
		return relpelnum;
	}

	public void setRelpelnum(String relpelnum) {
		this.relpelnum = relpelnum;
	}

	public String getSalbankaccnum() {
		return salbankaccnum;
	}

	public void setSalbankaccnum(String salbankaccnum) {
		this.salbankaccnum = salbankaccnum;
	}

	public String getSalday() {
		return salday;
	}

	public void setSalday(String salday) {
		this.salday = salday;
	}

	public String getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}

	public String getNewpubcustid1() {
		return newpubcustid1;
	}

	public void setNewpubcustid1(String newpubcustid1) {
		this.newpubcustid1 = newpubcustid1;
	}

	public String getUnitauth2() {
		return unitauth2;
	}

	public void setUnitauth2(String unitauth2) {
		this.unitauth2 = unitauth2;
	}

	public String getApprnum() {
		return apprnum;
	}

	public void setApprnum(String apprnum) {
		this.apprnum = apprnum;
	}

	public String getFuncno() {
		return funcno;
	}

	public void setFuncno(String funcno) {
		this.funcno = funcno;
	}

	public String getLeglcertinum() {
		return leglcertinum;
	}

	public void setLeglcertinum(String leglcertinum) {
		this.leglcertinum = leglcertinum;
	}

	public String getUnithigprop() {
		return unithigprop;
	}

	public void setUnithigprop(String unithigprop) {
		this.unithigprop = unithigprop;
	}

	public String getCmfundsouflag() {
		return cmfundsouflag;
	}

	public void setCmfundsouflag(String cmfundsouflag) {
		this.cmfundsouflag = cmfundsouflag;
	}

	public String getLinkmanqq() {
		return linkmanqq;
	}

	public void setLinkmanqq(String linkmanqq) {
		this.linkmanqq = linkmanqq;
	}

	public String getSalbankcode() {
		return salbankcode;
	}

	public void setSalbankcode(String salbankcode) {
		this.salbankcode = salbankcode;
	}

	public String getSpeflag() {
		return speflag;
	}

	public void setSpeflag(String speflag) {
		this.speflag = speflag;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getLeglcertitype() {
		return leglcertitype;
	}

	public void setLeglcertitype(String leglcertitype) {
		this.leglcertitype = leglcertitype;
	}

	public String getLinkmancertitype() {
		return linkmancertitype;
	}

	public void setLinkmancertitype(String linkmancertitype) {
		this.linkmancertitype = linkmancertitype;
	}

	public String getLinkmanemail() {
		return linkmanemail;
	}

	public void setLinkmanemail(String linkmanemail) {
		this.linkmanemail = linkmanemail;
	}

	public String getUnitareacode() {
		return unitareacode;
	}

	public void setUnitareacode(String unitareacode) {
		this.unitareacode = unitareacode;
	}

	public String getUnitauth1() {
		return unitauth1;
	}

	public void setUnitauth1(String unitauth1) {
		this.unitauth1 = unitauth1;
	}

	public String getUnitspeprop() {
		return unitspeprop;
	}

	public void setUnitspeprop(String unitspeprop) {
		this.unitspeprop = unitspeprop;
	}

	public String getUnitycode() {
		return unitycode;
	}

	public void setUnitycode(String unitycode) {
		this.unitycode = unitycode;
	}

	public String getLeglaccname() {
		return leglaccname;
	}

	public void setLeglaccname(String leglaccname) {
		this.leglaccname = leglaccname;
	}

	public String getNewpubcustid2() {
		return newpubcustid2;
	}

	public void setNewpubcustid2(String newpubcustid2) {
		this.newpubcustid2 = newpubcustid2;
	}

	public String getSalbankaccnm() {
		return salbankaccnm;
	}

	public void setSalbankaccnm(String salbankaccnm) {
		this.salbankaccnm = salbankaccnm;
	}

	public String getUnitsoicode() {
		return unitsoicode;
	}

	public void setUnitsoicode(String unitsoicode) {
		this.unitsoicode = unitsoicode;
	}

	public String getAccbankcode() {
		return accbankcode;
	}

	public void setAccbankcode(String accbankcode) {
		this.accbankcode = accbankcode;
	}

	public String getEconomytype() {
		return economytype;
	}

	public void setEconomytype(String economytype) {
		this.economytype = economytype;
	}

	public String getIndinorprop() {
		return indinorprop;
	}

	public void setIndinorprop(String indinorprop) {
		this.indinorprop = indinorprop;
	}

	public String getSupsubrelation() {
		return supsubrelation;
	}

	public void setSupsubrelation(String supsubrelation) {
		this.supsubrelation = supsubrelation;
	}

	public String getUnitlicaddr() {
		return unitlicaddr;
	}

	public void setUnitlicaddr(String unitlicaddr) {
		this.unitlicaddr = unitlicaddr;
	}

	public String getUnitnorprop() {
		return unitnorprop;
	}

	public void setUnitnorprop(String unitnorprop) {
		this.unitnorprop = unitnorprop;
	}

	public String getWebbusmaget() {
		return webbusmaget;
	}

	public void setWebbusmaget(String webbusmaget) {
		this.webbusmaget = webbusmaget;
	}
	
	public String getBfchgunitprop() {
		return bfchgunitprop;
	}

	public void setBfchgunitprop(String bfchgunitprop) {
		this.bfchgunitprop = bfchgunitprop;
	}

	public String getAfchgunitprop() {
		return afchgunitprop;
	}

	public void setAfchgunitprop(String afchgunitprop) {
		this.afchgunitprop = afchgunitprop;
	}
	
	public String getDpsubsidytype() {
		return dpsubsidytype;
	}
	public void setDpsubsidytype(String dpsubsidytype) {
		this.dpsubsidytype = dpsubsidytype;
	}
	
	public String getTsoinstcode() {
		return tsoinstcode;
	}

	public void setTsoinstcode(String tsoinstcode) {
		this.tsoinstcode = tsoinstcode;
	}

	public String getHandset() {
		return handset;
	}

	public void setHandset(String handset) {
		this.handset = handset;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public String getMannum() {
		return mannum;
	}

	public void setMannum(String mannum) {
		this.mannum = mannum;
	}

	public String getPayeebankcode() {
		return payeebankcode;
	}

	public void setPayeebankcode(String payeebankcode) {
		this.payeebankcode = payeebankcode;
	}

	public String getFinancialDate() {
		return FinancialDate;
	}

	public void setFinancialDate(String financialDate) {
		FinancialDate = financialDate;
	}

	public String getMonthrepayamt() {
		return monthrepayamt;
	}

	public void setMonthrepayamt(String monthrepayamt) {
		this.monthrepayamt = monthrepayamt;
	}

	public String getBuyhouseamt() {
		return buyhouseamt;
	}

	public void setBuyhouseamt(String buyhouseamt) {
		this.buyhouseamt = buyhouseamt;
	}

	public String getCommonthrepayamt() {
		return commonthrepayamt;
	}

	public void setCommonthrepayamt(String commonthrepayamt) {
		this.commonthrepayamt = commonthrepayamt;
	}

	public String getRentnum3() {
		return rentnum3;
	}

	public void setRentnum3(String rentnum3) {
		this.rentnum3 = rentnum3;
	}

	public String getRentname() {
		return rentname;
	}

	public void setRentname(String rentname) {
		this.rentname = rentname;
	}

	public String getRentcertinum() {
		return rentcertinum;
	}

	public void setRentcertinum(String rentcertinum) {
		this.rentcertinum = rentcertinum;
	}

	public String getRentdate() {
		return rentdate;
	}

	public void setRentdate(String rentdate) {
		this.rentdate = rentdate;
	}

	public String getRentenddate() {
		return rentenddate;
	}

	public void setRentenddate(String rentenddate) {
		this.rentenddate = rentenddate;
	}

	public String getRentamt() {
		return rentamt;
	}

	public void setRentamt(String rentamt) {
		this.rentamt = rentamt;
	}

	public String getBuyhousename() {
		return buyhousename;
	}

	public void setBuyhousename(String buyhousename) {
		this.buyhousename = buyhousename;
	}

	public String getBuyhousecerid() {
		return buyhousecerid;
	}

	public void setBuyhousecerid(String buyhousecerid) {
		this.buyhousecerid = buyhousecerid;
	}

	public String getBuyhousedate() {
		return buyhousedate;
	}

	public void setBuyhousedate(String buyhousedate) {
		this.buyhousedate = buyhousedate;
	}

	public String getLasttrsdate() {
		return lasttrsdate;
	}

	public void setLasttrsdate(String lasttrsdate) {
		this.lasttrsdate = lasttrsdate;
	}

	public String getLoansum() {
		return loansum;
	}

	public void setLoansum(String loansum) {
		this.loansum = loansum;
	}

	public String getLoanterm() {
		return loanterm;
	}

	public void setLoanterm(String loanterm) {
		this.loanterm = loanterm;
	}

	public String getCertinum() {
		return certinum;
	}

	public void setCertinum(String certinum) {
		this.certinum = certinum;
	}

	public String getCertitype() {
		return certitype;
	}

	public void setCertitype(String certitype) {
		this.certitype = certitype;
	}

	public String getCommloansum() {
		return commloansum;
	}

	public void setCommloansum(String commloansum) {
		this.commloansum = commloansum;
	}

	public String getRepaylntype() {
		return repaylntype;
	}

	public void setRepaylntype(String repaylntype) {
		this.repaylntype = repaylntype;
	}

	public String getContrsigndate() {
		return contrsigndate;
	}

	public void setContrsigndate(String contrsigndate) {
		this.contrsigndate = contrsigndate;
	}

	public String getDrawreasoncode1() {
		return drawreasoncode1;
	}

	public void setDrawreasoncode1(String drawreasoncode1) {
		this.drawreasoncode1 = drawreasoncode1;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getHouseaddr() {
		return houseaddr;
	}

	public void setHouseaddr(String houseaddr) {
		this.houseaddr = houseaddr;
	}

	public String getInputamt() {
		return inputamt;
	}

	public void setInputamt(String inputamt) {
		this.inputamt = inputamt;
	}

	public String getDrawreason() {
		return drawreason;
	}

	public void setDrawreason(String drawreason) {
		this.drawreason = drawreason;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getPayeebankaccnum() {
		return payeebankaccnum;
	}

	public void setPayeebankaccnum(String payeebankaccnum) {
		this.payeebankaccnum = payeebankaccnum;
	}

	public String getBal() {
		return bal;
	}

	public void setBal(String bal) {
		this.bal = bal;
	}

	public String getMonbal() {
		return monbal;
	}

	public void setMonbal(String monbal) {
		this.monbal = monbal;
	}

	public String getSupbal() {
		return supbal;
	}

	public void setSupbal(String supbal) {
		this.supbal = supbal;
	}

	public String getSubbal() {
		return subbal;
	}

	public void setSubbal(String subbal) {
		this.subbal = subbal;
	}

	public String getFrzflag() {
		return frzflag;
	}

	public void setFrzflag(String frzflag) {
		this.frzflag = frzflag;
	}

	public String getBuyhousetype() {
		return buyhousetype;
	}

	public void setBuyhousetype(String buyhousetype) {
		this.buyhousetype = buyhousetype;
	}

	public String getAccloantype() {
		return accloantype;
	}

	public void setAccloantype(String accloantype) {
		this.accloantype = accloantype;
	}

	public String getRenttype() {
		return renttype;
	}

	public void setRenttype(String renttype) {
		this.renttype = renttype;
	}

	public String getClearamt() {
		return clearamt;
	}

	public void setClearamt(String clearamt) {
		this.clearamt = clearamt;
	}

	public String getCleardate() {
		return cleardate;
	}

	public void setCleardate(String cleardate) {
		this.cleardate = cleardate;
	}

	public String getAhdrepayamt() {
		return ahdrepayamt;
	}

	public void setAhdrepayamt(String ahdrepayamt) {
		this.ahdrepayamt = ahdrepayamt;
	}

	public String getConamt() {
		return conamt;
	}

	public void setConamt(String conamt) {
		this.conamt = conamt;
	}

	public String getCurbal() {
		return curbal;
	}

	public void setCurbal(String curbal) {
		this.curbal = curbal;
	}

	public String getLoanrate() {
		return loanrate;
	}

	public void setLoanrate(String loanrate) {
		this.loanrate = loanrate;
	}

	public String getRepaymode() {
		return repaymode;
	}

	public void setRepaymode(String repaymode) {
		this.repaymode = repaymode;
	}

	public String getRepaycycle() {
		return repaycycle;
	}

	public void setRepaycycle(String repaycycle) {
		this.repaycycle = repaycycle;
	}

	public String getRemainterm() {
		return remainterm;
	}

	public void setRemainterm(String remainterm) {
		this.remainterm = remainterm;
	}

	public String getShttermflag() {
		return shttermflag;
	}

	public void setShttermflag(String shttermflag) {
		this.shttermflag = shttermflag;
	}

	public String getTransdate() {
		return transdate;
	}

	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}

	public String getLoancontrcode() {
		return loancontrcode;
	}

	public void setLoancontrcode(String loancontrcode) {
		this.loancontrcode = loancontrcode;
	}

	public String getPlanrepaydate() {
		return planrepaydate;
	}

	public void setPlanrepaydate(String planrepaydate) {
		this.planrepaydate = planrepaydate;
	}

	public String getLoaneecertinum() {
		return loaneecertinum;
	}

	public void setLoaneecertinum(String loaneecertinum) {
		this.loaneecertinum = loaneecertinum;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getInstcode() {
		return instcode;
	}

	public void setInstcode(String instcode) {
		this.instcode = instcode;
	}

	public String getLnaccnum() {
		return lnaccnum;
	}

	public void setLnaccnum(String lnaccnum) {
		this.lnaccnum = lnaccnum;
	}

	public String getBasenum() {
		return basenum;
	}

	public void setBasenum(String basenum) {
		this.basenum = basenum;
	}

	public String getConpaymonth() {
		return conpaymonth;
	}

	public void setConpaymonth(String conpaymonth) {
		this.conpaymonth = conpaymonth;
	}

	public String getLoantimes() {
		return loantimes;
	}

	public void setLoantimes(String loantimes) {
		this.loantimes = loantimes;
	}

	public String getBusinName() {
		return this.businName;
	}

	public void setBusinName(String businName) {
		this.businName = businName;
	}

	public String getCentername() {
		return this.centername;
	}

	public void setCentername(String centername) {
		this.centername = centername;
	}

	public String getUsebal() {
		return usebal;
	}

	public void setUsebal(String usebal) {
		this.usebal = usebal;
	}

	public String getHousetype() {
		return housetype;
	}

	public void setHousetype(String housetype) {
		this.housetype = housetype;
	}

	public String getRangeyear() {
		return rangeyear;
	}

	public void setRangeyear(String rangeyear) {
		this.rangeyear = rangeyear;
	}

	public String getLoanhousenum() {
		return loanhousenum;
	}

	public void setLoanhousenum(String loanhousenum) {
		this.loanhousenum = loanhousenum;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getLnundtkbcode() {
		return lnundtkbcode;
	}

	public void setLnundtkbcode(String lnundtkbcode) {
		this.lnundtkbcode = lnundtkbcode;
	}

	public String getLnundtksubbcode() {
		return lnundtksubbcode;
	}

	public void setLnundtksubbcode(String lnundtksubbcode) {
		this.lnundtksubbcode = lnundtksubbcode;
	}

	public String getLinkphone() {
		return linkphone;
	}

	public void setLinkphone(String linkphone) {
		this.linkphone = linkphone;
	}

	public String getPubaccnum() {
		return pubaccnum;
	}

	public void setPubaccnum(String pubaccnum) {
		this.pubaccnum = pubaccnum;
	}

	public String getComcialflag() {
		return comcialflag;
	}

	public void setComcialflag(String comcialflag) {
		this.comcialflag = comcialflag;
	}

	public String getLoanbal() {
		return loanbal;
	}

	public void setLoanbal(String loanbal) {
		this.loanbal = loanbal;
	}

	public String getLoancontrstate() {
		return loancontrstate;
	}

	public void setLoancontrstate(String loancontrstate) {
		this.loancontrstate = loancontrstate;
	}

	public String getShisuantype() {
		return shisuantype;
	}

	public void setShisuantype(String shisuantype) {
		this.shisuantype = shisuantype;
	}

	public String getApploanterm() {
		return apploanterm;
	}

	public void setApploanterm(String apploanterm) {
		this.apploanterm = apploanterm;
	}

	public String getApploanamt() {
		return apploanamt;
	}

	public void setApploanamt(String apploanamt) {
		this.apploanamt = apploanamt;
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

	public String getUkeynum() {
		return ukeynum;
	}

	public void setUkeynum(String ukeynum) {
		this.ukeynum = ukeynum;
	}

	public String getRealdpayamt() {
		return realdpayamt;
	}

	public void setRealdpayamt(String realdpayamt) {
		this.realdpayamt = realdpayamt;
	}

	public String getBuslicnum() {
		return buslicnum;
	}

	public void setBuslicnum(String buslicnum) {
		this.buslicnum = buslicnum;
	}

	public String getTysocialxydm() {
		return tysocialxydm;
	}

	public void setTysocialxydm(String tysocialxydm) {
		this.tysocialxydm = tysocialxydm;
	}

	public String getQualevel() {
		return qualevel;
	}

	public void setQualevel(String qualevel) {
		this.qualevel = qualevel;
	}

	public String getSaleprojectname() {
		return saleprojectname;
	}

	public void setSaleprojectname(String saleprojectname) {
		this.saleprojectname = saleprojectname;
	}

	public String getProjarea() {
		return projarea;
	}

	public void setProjarea(String projarea) {
		this.projarea = projarea;
	}

	public String getLinkman() {
		return linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getCheckcode() {
		return checkcode;
	}

	public void setCheckcode(String checkcode) {
		this.checkcode = checkcode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getCrtflag() {
		return crtflag;
	}

	public void setCrtflag(String crtflag) {
		this.crtflag = crtflag;
	}

	public String getLoancontrnum() {
		return loancontrnum;
	}

	public void setLoancontrnum(String loancontrnum) {
		this.loancontrnum = loancontrnum;
	}

	public String getNewloanterm() {
		return newloanterm;
	}

	public void setNewloanterm(String newloanterm) {
		this.newloanterm = newloanterm;
	}

	public String getNewrepaymode() {
		return newrepaymode;
	}

	public void setNewrepaymode(String newrepaymode) {
		this.newrepaymode = newrepaymode;
	}

	public String getPayerbankacc() {
		return payerbankacc;
	}

	public void setPayerbankacc(String payerbankacc) {
		this.payerbankacc = payerbankacc;
	}

	public String getPayerbankaccnm() {
		return payerbankaccnm;
	}

	public void setPayerbankaccnm(String payerbankaccnm) {
		this.payerbankaccnm = payerbankaccnm;
	}

	public String getPayerbankcode() {
		return payerbankcode;
	}

	public void setPayerbankcode(String payerbankcode) {
		this.payerbankcode = payerbankcode;
	}

	public String getPayercertinum() {
		return payercertinum;
	}

	public void setPayercertinum(String payercertinum) {
		this.payercertinum = payercertinum;
	}

	public String getPayercertitype() {
		return payercertitype;
	}

	public void setPayercertitype(String payercertitype) {
		this.payercertitype = payercertitype;
	}

	public String getPayertype() {
		return payertype;
	}

	public void setPayertype(String payertype) {
		this.payertype = payertype;
	}

	public String getSettlemode() {
		return settlemode;
	}

	public void setSettlemode(String settlemode) {
		this.settlemode = settlemode;
	}

	public String getRepaytype() {
		return repaytype;
	}

	public void setRepaytype(String repaytype) {
		this.repaytype = repaytype;
	}

	public String getRepaytolamt() {
		return repaytolamt;
	}

	public void setRepaytolamt(String repaytolamt) {
		this.repaytolamt = repaytolamt;
	}

	public String getSuperbankcode() {
		return superbankcode;
	}

	public void setSuperbankcode(String superbankcode) {
		this.superbankcode = superbankcode;
	}

	public String getIsgetearnest() {
		return isgetearnest;
	}

	public void setIsgetearnest(String isgetearnest) {
		this.isgetearnest = isgetearnest;
	}

	public String getEarnestprop() {
		return earnestprop;
	}

	public void setEarnestprop(String earnestprop) {
		this.earnestprop = earnestprop;
	}

	public String getCocustname() {
		return cocustname;
	}

	public void setCocustname(String cocustname) {
		this.cocustname = cocustname;
	}

	public String getRegaddr() {
		return regaddr;
	}

	public void setRegaddr(String regaddr) {
		this.regaddr = regaddr;
	}

	public String getLeglhandset() {
		return leglhandset;
	}

	public void setLeglhandset(String leglhandset) {
		this.leglhandset = leglhandset;
	}

	public String getCertitype1() {
		return certitype1;
	}

	public void setCertitype1(String certitype1) {
		this.certitype1 = certitype1;
	}

	public String getCertinum1() {
		return certinum1;
	}

	public void setCertinum1(String certinum1) {
		this.certinum1 = certinum1;
	}

	public String getLinkmanphone() {
		return linkmanphone;
	}

	public void setLinkmanphone(String linkmanphone) {
		this.linkmanphone = linkmanphone;
	}

	public String getLinkmanphone1() {
		return linkmanphone1;
	}

	public void setLinkmanphone1(String linkmanphone1) {
		this.linkmanphone1 = linkmanphone1;
	}

	public String getFounddate() {
		return founddate;
	}

	public void setFounddate(String founddate) {
		this.founddate = founddate;
	}

	public String getPleunitkind() {
		return pleunitkind;
	}

	public void setPleunitkind(String pleunitkind) {
		this.pleunitkind = pleunitkind;
	}

	public String getRegfundtype() {
		return regfundtype;
	}

	public void setRegfundtype(String regfundtype) {
		this.regfundtype = regfundtype;
	}

	public String getRegfund() {
		return regfund;
	}

	public void setRegfund(String regfund) {
		this.regfund = regfund;
	}

	public String getIncfund() {
		return incfund;
	}

	public void setIncfund(String incfund) {
		this.incfund = incfund;
	}

	public String getEvaldate() {
		return evaldate;
	}

	public void setEvaldate(String evaldate) {
		this.evaldate = evaldate;
	}

	public String getCertificatenum() {
		return certificatenum;
	}

	public void setCertificatenum(String certificatenum) {
		this.certificatenum = certificatenum;
	}

	public String getWorksterm() {
		return worksterm;
	}

	public void setWorksterm(String worksterm) {
		this.worksterm = worksterm;
	}

	public String getDepostsite() {
		return depostsite;
	}

	public void setDepostsite(String depostsite) {
		this.depostsite = depostsite;
	}

	public String getLncrelevel() {
		return lncrelevel;
	}

	public void setLncrelevel(String lncrelevel) {
		this.lncrelevel = lncrelevel;
	}

	public String getLnunitaccnum() {
		return lnunitaccnum;
	}

	public void setLnunitaccnum(String lnunitaccnum) {
		this.lnunitaccnum = lnunitaccnum;
	}

	public String getDepositnum() {
		return depositnum;
	}

	public void setDepositnum(String depositnum) {
		this.depositnum = depositnum;
	}

	public String getOpenbankname() {
		return openbankname;
	}

	public void setOpenbankname(String openbankname) {
		this.openbankname = openbankname;
	}

	public String getOpenbankaccnum() {
		return openbankaccnum;
	}

	public void setOpenbankaccnum(String openbankaccnum) {
		this.openbankaccnum = openbankaccnum;
	}

	public String getPaybankcode() {
		return paybankcode;
	}

	public void setPaybankcode(String paybankcode) {
		this.paybankcode = paybankcode;
	}

	public String getPaybankname() {
		return paybankname;
	}

	public void setPaybankname(String paybankname) {
		this.paybankname = paybankname;
	}

	public String getPaybankaccnm() {
		return paybankaccnm;
	}

	public void setPaybankaccnm(String paybankaccnm) {
		this.paybankaccnm = paybankaccnm;
	}

	public String getPaybankaccnum() {
		return paybankaccnum;
	}

	public void setPaybankaccnum(String paybankaccnum) {
		this.paybankaccnum = paybankaccnum;
	}

	public String getCityswapno() {
		return cityswapno;
	}

	public void setCityswapno(String cityswapno) {
		this.cityswapno = cityswapno;
	}

	public String getBankcorrno() {
		return bankcorrno;
	}

	public void setBankcorrno(String bankcorrno) {
		this.bankcorrno = bankcorrno;
	}

	public String getEarnestaccname() {
		return earnestaccname;
	}

	public void setEarnestaccname(String earnestaccname) {
		this.earnestaccname = earnestaccname;
	}

	public String getEarnstbankaccnum() {
		return earnstbankaccnum;
	}

	public void setEarnstbankaccnum(String earnstbankaccnum) {
		this.earnstbankaccnum = earnstbankaccnum;
	}

	public String getHousesit() {
		return housesit;
	}

	public void setHousesit(String housesit) {
		this.housesit = housesit;
	}

	public String getGlebelevel() {
		return glebelevel;
	}

	public void setGlebelevel(String glebelevel) {
		this.glebelevel = glebelevel;
	}

	public String getLandkind() {
		return landkind;
	}

	public void setLandkind(String landkind) {
		this.landkind = landkind;
	}

	public String getGuarmode() {
		return guarmode;
	}

	public void setGuarmode(String guarmode) {
		this.guarmode = guarmode;
	}

	public String getBuildarea() {
		return buildarea;
	}

	public void setBuildarea(String buildarea) {
		this.buildarea = buildarea;
	}

	public String getSalbuildarea() {
		return salbuildarea;
	}

	public void setSalbuildarea(String salbuildarea) {
		this.salbuildarea = salbuildarea;
	}

	public String getSalresconarea() {
		return salresconarea;
	}

	public void setSalresconarea(String salresconarea) {
		this.salresconarea = salresconarea;
	}

	public String getSalhounum() {
		return salhounum;
	}

	public void setSalhounum(String salhounum) {
		this.salhounum = salhounum;
	}

	public String getBuildtype() {
		return buildtype;
	}

	public void setBuildtype(String buildtype) {
		this.buildtype = buildtype;
	}

	public String getPolecounts() {
		return polecounts;
	}

	public void setPolecounts(String polecounts) {
		this.polecounts = polecounts;
	}

	public String getAmttype() {
		return amttype;
	}

	public void setAmttype(String amttype) {
		this.amttype = amttype;
	}

	public String getPrototint() {
		return prototint;
	}

	public void setPrototint(String prototint) {
		this.prototint = prototint;
	}

	public String getProhasint() {
		return prohasint;
	}

	public void setProhasint(String prohasint) {
		this.prohasint = prohasint;
	}

	public String getPlandevarea() {
		return plandevarea;
	}

	public void setPlandevarea(String plandevarea) {
		this.plandevarea = plandevarea;
	}

	public String getRealdevarea() {
		return realdevarea;
	}

	public void setRealdevarea(String realdevarea) {
		this.realdevarea = realdevarea;
	}

	public String getSalehouseint() {
		return salehouseint;
	}

	public void setSalehouseint(String salehouseint) {
		this.salehouseint = salehouseint;
	}

	public String getSalehouseprice() {
		return salehouseprice;
	}

	public void setSalehouseprice(String salehouseprice) {
		this.salehouseprice = salehouseprice;
	}

	public String getPlandelidate() {
		return plandelidate;
	}

	public void setPlandelidate(String plandelidate) {
		this.plandelidate = plandelidate;
	}

	public String getProfundsales() {
		return profundsales;
	}

	public void setProfundsales(String profundsales) {
		this.profundsales = profundsales;
	}

	public String getProjapploanamt() {
		return projapploanamt;
	}

	public void setProjapploanamt(String projapploanamt) {
		this.projapploanamt = projapploanamt;
	}

	public String getHousenum1() {
		return housenum1;
	}

	public void setHousenum1(String housenum1) {
		this.housenum1 = housenum1;
	}

	public String getHousearea1() {
		return housearea1;
	}

	public void setHousearea1(String housearea1) {
		this.housearea1 = housearea1;
	}

	public String getHousenum2() {
		return housenum2;
	}

	public void setHousenum2(String housenum2) {
		this.housenum2 = housenum2;
	}

	public String getHousearea2() {
		return housearea2;
	}

	public void setHousearea2(String housearea2) {
		this.housearea2 = housearea2;
	}

	public String getHousenum3() {
		return housenum3;
	}

	public void setHousenum3(String housenum3) {
		this.housenum3 = housenum3;
	}

	public String getHousearea3() {
		return housearea3;
	}

	public void setHousearea3(String housearea3) {
		this.housearea3 = housearea3;
	}

	public String getLowhousenum() {
		return lowhousenum;
	}

	public void setLowhousenum(String lowhousenum) {
		this.lowhousenum = lowhousenum;
	}

	public String getLowhousearea() {
		return lowhousearea;
	}

	public void setLowhousearea(String lowhousearea) {
		this.lowhousearea = lowhousearea;
	}

	public String getMelonhousenum() {
		return melonhousenum;
	}

	public void setMelonhousenum(String melonhousenum) {
		this.melonhousenum = melonhousenum;
	}

	public String getMelonhousearea() {
		return melonhousearea;
	}

	public void setMelonhousearea(String melonhousearea) {
		this.melonhousearea = melonhousearea;
	}

	public String getMiduphousenum() {
		return miduphousenum;
	}

	public void setMiduphousenum(String miduphousenum) {
		this.miduphousenum = miduphousenum;
	}

	public String getMiduphousearea() {
		return miduphousearea;
	}

	public void setMiduphousearea(String miduphousearea) {
		this.miduphousearea = miduphousearea;
	}

	public String getHighhousenum() {
		return highhousenum;
	}

	public void setHighhousenum(String highhousenum) {
		this.highhousenum = highhousenum;
	}

	public String getHighhousearea() {
		return highhousearea;
	}

	public void setHighhousearea(String highhousearea) {
		this.highhousearea = highhousearea;
	}

	public String getIsgetall() {
		return isgetall;
	}

	public void setIsgetall(String isgetall) {
		this.isgetall = isgetall;
	}

	public String getAvaloansum() {
		return avaloansum;
	}

	public void setAvaloansum(String avaloansum) {
		this.avaloansum = avaloansum;
	}

	public String getLoanbegdate() {
		return loanbegdate;
	}

	public void setLoanbegdate(String loanbegdate) {
		this.loanbegdate = loanbegdate;
	}

	public String getAgrtoffdate() {
		return agrtoffdate;
	}

	public void setAgrtoffdate(String agrtoffdate) {
		this.agrtoffdate = agrtoffdate;
	}

	public String getLoanenddate() {
		return loanenddate;
	}

	public void setLoanenddate(String loanenddate) {
		this.loanenddate = loanenddate;
	}

	public String getInfotype() {
		return infotype;
	}

	public void setInfotype(String infotype) {
		this.infotype = infotype;
	}

	public String getIndiacctype() {
		return indiacctype;
	}

	public void setIndiacctype(String indiacctype) {
		this.indiacctype = indiacctype;
	}

	public String getIsyzr() {
		return isyzr;
	}

	public void setIsyzr(String isyzr) {
		this.isyzr = isyzr;
	}

	public String getIndemhouse() {
		return indemhouse;
	}

	public void setIndemhouse(String indemhouse) {
		this.indemhouse = indemhouse;
	}

	public String getLpstate() {
		return lpstate;
	}

	public void setLpstate(String lpstate) {
		this.lpstate = lpstate;
	}

	public String getHousecontrnum() {
		return housecontrnum;
	}

	public void setHousecontrnum(String housecontrnum) {
		this.housecontrnum = housecontrnum;
	}

	public String getCocustname_wb() {
		return cocustname_wb;
	}

	public void setCocustname_wb(String cocustname_wb) {
		this.cocustname_wb = cocustname_wb;
	}

	public String getProjectname_wb() {
		return projectname_wb;
	}

	public void setProjectname_wb(String projectname_wb) {
		this.projectname_wb = projectname_wb;
	}

	public String getNum_web1() {
		return num_web1;
	}

	public void setNum_web1(String num_web1) {
		this.num_web1 = num_web1;
	}

	public String getNum_web2() {
		return num_web2;
	}

	public void setNum_web2(String num_web2) {
		this.num_web2 = num_web2;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getSeqno() {
		return seqno;
	}

	public void setSeqno(String seqno) {
		this.seqno = seqno;
	}

	public String getIsfinished() {
		return isfinished;
	}

	public void setIsfinished(String isfinished) {
		this.isfinished = isfinished;
	}

	public String getPeoplenum() {
		return peoplenum;
	}

	public void setPeoplenum(String peoplenum) {
		this.peoplenum = peoplenum;
	}

	public String getBaseInfoXml() {
		return baseInfoXml;
	}

	public void setBaseInfoXml(String baseInfoXml) {
		this.baseInfoXml = baseInfoXml;
	}

	public String getAttrXml() {
		return attrXml;
	}

	public void setAttrXml(String attrXml) {
		this.attrXml = attrXml;
	}

	public String getFormXml() {
		return formXml;
	}

	public void setFormXml(String formXml) {
		this.formXml = formXml;
	}

	public String getProjid() {
		return projid;
	}

	public void setProjid(String projid) {
		this.projid = projid;
	}

	public String getServicecode() {
		return servicecode;
	}

	public void setServicecode(String servicecode) {
		this.servicecode = servicecode;
	}

	public String getApplyname() {
		return applyname;
	}

	public void setApplyname(String applyname) {
		this.applyname = applyname;
	}

	public String getApply_cardnumber() {
		return apply_cardnumber;
	}

	public void setApply_cardnumber(String apply_cardnumber) {
		this.apply_cardnumber = apply_cardnumber;
	}

	public String getApply_cardtype() {
		return apply_cardtype;
	}

	public void setApply_cardtype(String apply_cardtype) {
		this.apply_cardtype = apply_cardtype;
	}

	public String getTelphone() {
		return telphone;
	}

	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}

	public String getReceivetime() {
		return receivetime;
	}

	public void setReceivetime(String receivetime) {
		this.receivetime = receivetime;
	}

	public String getBegym() {
		return begym;
	}

	public void setBegym(String begym) {
		this.begym = begym;
	}

	public String getJgh() {
		return jgh;
	}

	public void setJgh(String jgh) {
		this.jgh = jgh;
	}

	public String getSfzh() {
		return sfzh;
	}

	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}

	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public String getYwlx() {
		return ywlx;
	}

	public void setYwlx(String ywlx) {
		this.ywlx = ywlx;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getYwtype() {
		return this.ywtype;
	}

	public void setYwtype(final String ywtype) {
		this.ywtype = ywtype;
	}

	public String getSpt_tyxyydm() {
		return this.spt_tyxyydm;
	}

	public void setSpt_tyxyydm(final String spt_tyxyydm) {
		this.spt_tyxyydm = spt_tyxyydm;
	}

	public String getSpt_dwmc() {
		return this.spt_dwmc;
	}

	public void setSpt_dwmc(final String spt_dwmc) {
		this.spt_dwmc = spt_dwmc;
	}
}
