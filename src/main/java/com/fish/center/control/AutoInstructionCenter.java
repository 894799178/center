package com.fish.center.control;

import com.fish.center.bean.BaseBusinessDataBean;
import com.fish.center.service.ServiceCenter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ProjectName: center
 * @Package: com.fish.center.control
 * @ClassName: AutoInstructionCenter
 * @Author: 一条小咸鱼
 * @Description: 自动化指令中心,响应自动化的指令.
 * @Date: 2019/1/31 18:08
 * @Version: 1.0
 */
@Controller
public class AutoInstructionCenter {

    @Resource
    ServiceCenter serviceCenter;

    @RequestMapping("/getAutoMessage")
    @ResponseBody
    public String getAutoMessage(@RequestBody BaseBusinessDataBean baseBusinessDataBean){
        //BaseBusinessDataBean
        String token = baseBusinessDataBean.getToken();
        return  serviceCenter.getAutoClickMessage(token);
    }


}
