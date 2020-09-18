package com.gjxsoft.controllor;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
@RequestMapping("/depart")
public class DepartmentControllor {
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

    @RequestMapping(value = "/Departmentconstantitem",method = RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> getDepartmentconstantitem(@RequestParam(required = true,defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum, 8);
        HashMap<String,Object> map =new HashMap<>();
        List<Departmentconstantitem> orderDescList = departmentService.findDepartmentconstantitem();
        PageInfo<Departmentconstantitem> pageInfo = new PageInfo<>(orderDescList);
        map.put("pageInfo",pageInfo);
        map.put("pageNum",pageNum);
        map.put("size",8);
        return map;
    }

    @RequestMapping(value = "/updateDepart",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> updateDepart(Department department){
        departmentService.updateDepartment(department);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> deleteDepart(Integer id){
        departmentService.deleteDepart(id);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> insertDepart(Department department){
        departmentService.insertDepart(department);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/SearchByidOrName",method = RequestMethod.POST)
    public @ResponseBody List<Departmentconstantitem> findByidOrName(String idOrName){
        List<Departmentconstantitem> departmentconstantitems =departmentService.findByIdRrName(idOrName);
        System.out.println(departmentconstantitems);
        return departmentconstantitems;
    }



}
