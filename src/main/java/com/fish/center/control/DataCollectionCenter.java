package com.fish.center.control;

import com.fish.center.bean.HttpRequestBean;
import com.fish.center.service.DataProcess;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @ProjectName: center
 * @Package: com.fish.center.control
 * @ClassName: DataCollectionCenter
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/1/30 19:23
 * @Version: 1.0
 */
@Controller
public class DataCollectionCenter {
    @Resource
    DataProcess dataProcess;
    @RequestMapping("/submitData")
    @ResponseBody
    public String submitData(@RequestBody HttpRequestBean httpRequestBean){
        //System.out.println("进入控制层");
      //  System.out.println("token --->"+httpRequestBean.getToken());
        dataProcess.storeData(httpRequestBean);
        return "200";
    }

}
