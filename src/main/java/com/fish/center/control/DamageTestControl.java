package com.fish.center.control;

import com.fish.center.model.DamageBean;
import com.fish.center.model.DamageData;
import com.fish.center.service.DamageTestService;
import com.fish.center.service.ServiceCenter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @ProjectName: center
 * @Package: com.fish.center.control
 * @ClassName: DamageTestControl
 * @Author: 一条小咸鱼
 * @Description: ${description}
 * @Date: 2019/2/12 15:05
 * @Version: 1.0
 */
@Controller
@RequestMapping(value = "/damageTestControl")
public class DamageTestControl {
    @Resource
    ServiceCenter serviceCenter;

    @Resource
    DamageTestService damageTestService;

    @RequestMapping("/getDamageData")
    @ResponseBody
    public String getDamageData(HttpSession session){
        String token = (String) session.getAttribute("token");
        return  serviceCenter.getDamageMessage(token);
    }
    @PostMapping(value = "/updateData")
    @ResponseBody
    public void updateData(@RequestBody List<DamageBean> datas){
        damageTestService.batchCover(datas);
    }

    @RequestMapping(value="/getDamageDataByTypeId")
    @ResponseBody
    public List<DamageBean> getDamageDataByTypeId(String typeId){
        List<DamageBean> list =  damageTestService.getDamageDataByTypeId(typeId);
//        for (DamageBean dd:list) {
//            System.out.println(dd);
//        }
        return list;
    }

}
