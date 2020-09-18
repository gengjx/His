package com.gjxsoft.controllor;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gjxsoft.domain.Department;
import com.gjxsoft.domain.Departmentconstantitem;
import com.gjxsoft.domain.Registlevel;
import com.gjxsoft.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/RegisterLevel")
public class RegistLevelControllor {
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

    @RequestMapping(value = "/getRegisterLevel",method = RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> getDepartmentconstantitem(@RequestParam(required = true,defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum, 8);
        HashMap<String,Object> map =new HashMap<>();
        List<Registlevel> orderDescList = registlevelService.findAll();
        PageInfo<Registlevel> pageInfo = new PageInfo<>(orderDescList);
        map.put("pageInfo",pageInfo);
        map.put("pageNum",pageNum);
        map.put("size",8);
        return map;
    }

    @RequestMapping(value = "/updateRegistLevel",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> updateRegistLevel(Registlevel registlevel){
       registlevelService.updateRegistLevel(registlevel);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> deleteRegistLevel(Integer id){
        registlevelService.deleteRegistLevel(id);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> insertDepart(Registlevel registlevel){
        registlevelService.insertDepart(registlevel);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/SearchByidOrName",method = RequestMethod.POST)
    public @ResponseBody List<Registlevel> findByidOrName(String idOrName){
        List<Registlevel> registlevelList =registlevelService.findByIdOrName(idOrName);
        System.out.println(registlevelList);
        return registlevelList;
    }



}
