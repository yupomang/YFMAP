package com.yondervision.yfmap.controller;

import com.yondervision.yfmap.common.Constants;
import com.yondervision.yfmap.form.AppApi030Form;
import com.yondervision.yfmap.handle.CtrlHandleInter;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WebApi815Contorller {
    Logger log = Logger.getLogger("YFMAP");
    /**
     *  住房公积金异地缴存证明参数查询(省平台)
     * @param form
     * @param modelMap
     * @throws Exception
     */
    @RequestMapping("/webapi80015.{ext}")
    public String webapi80015(AppApi030Form form, ModelMap modelMap) throws Exception{
        log.info(Constants.LOG_HEAD+"webapi80015 begin.");
        log.info(form.getSeqno());
        CtrlHandleInter business = (CtrlHandleInter) Class.forName("com.yondervision.yfmap.handle.handleImpl.handle"+form.getCenterId()+".Handle03824_"+form.getCenterId()).newInstance();
        business.action(form, modelMap);
        log.info(Constants.LOG_HEAD+"appApi03824 end.");
        return "/index";
    }
}
