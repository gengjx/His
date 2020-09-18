package com.gjxsoft.controllor;

import com.gjxsoft.domain.*;
import com.gjxsoft.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/user")
public class UserControllor {
    @Autowired
    private UserService userService;
    @Autowired
    private RuleService ruleService;
    @Autowired
    public DepartmentService departmentService;
    @Autowired
    public RegistlevelService registlevelService;
    @Autowired
    public RegisterService registerService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public @ResponseBody User Login(User loginUser) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(loginUser);
        User user =userService.LoginByUserNameandPass(loginUser);

        return user;
    }

    @RequestMapping(value = "/getRule",method = RequestMethod.POST)
    public @ResponseBody
    List<Rule> getRule(){
        List<Rule> rules=ruleService.findAll();

        return rules;
    }


    @RequestMapping(value = "/getDepart",method = RequestMethod.POST)
    public @ResponseBody
    List<Department> getDepart(){
        List<Department> rules=departmentService.findAllDepart();
        return rules;
    }


    @RequestMapping(value = "/getDoctorByDepart",method = RequestMethod.POST)
    public @ResponseBody
    List<User> getDoctors(Integer depart){
        List<User> users=userService.findUserByDepartID(depart);
        return users;
    }


    @RequestMapping(value = "/getregistLevel",method = RequestMethod.POST)
    public @ResponseBody
    Registlevel getregistLevel(Integer registLeId){
        Registlevel registlevel=registlevelService.findRegistlevelByid(registLeId);
        return registlevel;
    }

    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public @ResponseBody
    HashMap regist(Register form){
        HashMap<String,String> result =new HashMap<>();
        form.setRegistTime(new Date());
        System.out.println(form);
        registerService.insertRegister(form);
        result.put("msg","成功");
        return result;
    }

    @RequestMapping(value = "/getCaseNumber",method = RequestMethod.POST)
    public @ResponseBody
    HashMap regist(){
        HashMap<String,String> result =new HashMap<>();
        Integer CaseNumber = registerService.getCaseNumber();
        result.put("msg","成功");
        return result;
    }


    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public @ResponseBody
    List<User> getAll(){
        List<User> users=userService.findALL();
        return users;
    }


    @RequestMapping(value = "/updateUserRID",method =RequestMethod.POST )
    public @ResponseBody
    HashMap updateUserRID(Integer userID,String registLeId)
    {
        System.out.println(userID);
        System.out.println(registLeId);
        HashMap<String,String> map =new HashMap<>();
        userService.updateUserRID(userID,registLeId);
        map.put("msg","success");
        return map;
    }

}
