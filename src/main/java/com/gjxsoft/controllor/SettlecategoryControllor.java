package com.gjxsoft.controllor;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gjxsoft.domain.Registlevel;
import com.gjxsoft.domain.Settlecategory;
import com.gjxsoft.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Settlecategory")
public class SettlecategoryControllor {
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

    @Autowired
    private settlecategoryService settlecategoryService;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> getDepartmentconstantitem(@RequestParam(required = true,defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum, 8);
        HashMap<String,Object> map =new HashMap<>();
        List<Settlecategory> orderDescList = settlecategoryService.findAll();
        PageInfo<Settlecategory> pageInfo = new PageInfo<>(orderDescList);
        map.put("pageInfo",pageInfo);
        map.put("pageNum",pageNum);
        map.put("size",8);
        return map;
    }

    @RequestMapping(value = "/updateSettlecategory",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> updateRegistLevel(Settlecategory settlecategory){
       settlecategoryService.updateSettlecategory(settlecategory);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> deleteRegistLevel(Integer id){
        settlecategoryService.deleteSettlecategory(id);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> insertDepart(Settlecategory settlecategory){
        settlecategoryService.insertSettlecategory(settlecategory);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/SearchByidOrName",method = RequestMethod.POST)
    public @ResponseBody List<Settlecategory> findByidOrName(String idOrName){
        List<Settlecategory> registlevelList =settlecategoryService.findByIdOrName(idOrName);
        System.out.println(registlevelList);
        return registlevelList;
    }



}
