package com.lut.keshe.controller;

import com.lut.keshe.pojo.Timu;
import com.lut.keshe.service.TimuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by ASUS on 2021/7/5.
 */
//@RequestMapping("Timu")
@Controller
public class TimuController {
    @Autowired
    TimuService timuService;

    @RequestMapping("insertTimu")
    public String addTimu(Timu timu){
        boolean b=timuService.addTimu(timu);
        return "";
    }

    @RequestMapping("findAllTimu")
    public String findAllTimu(HttpSession session){
        List<Timu> list = timuService.findAllTimu();
        session.setAttribute("AllTimu",list);
        return "StudentSelectTimu";
    }

    @RequestMapping("selectByIDTimu")
    public String selectTimuByName(HttpSession session,String name){
        Timu timu = timuService.selectTimuByID(name);
        session.setAttribute("Timu",timu);
        return "";
    }

    @RequestMapping("deleteTimu")
    public String DeleteTimu(String name){
        timuService.deleteTimu(name);
        return "";
    }

    @RequestMapping("updateTimu")
    public String updateTimu(Timu timu){
        timuService.updateTimuByID(timu);
        return "";
    }
}
