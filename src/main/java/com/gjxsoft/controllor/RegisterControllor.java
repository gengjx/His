package com.gjxsoft.controllor;

import com.gjxsoft.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("/Register")
public class RegisterControllor {
    @Autowired
    private RegisterService registerService;
    @RequestMapping("/getCaseNumber")
    public @ResponseBody HashMap getCaseNumber(){
        HashMap<String,String> map =new HashMap<>();
        int CaseNumber =registerService.getCaseNumber();
        map.put("CaseNumber",CaseNumber+"");
        return map;
    }

}
