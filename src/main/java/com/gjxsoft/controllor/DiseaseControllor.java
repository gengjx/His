package com.gjxsoft.controllor;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gjxsoft.domain.Disease;
import com.gjxsoft.domain.Settlecategory;
import com.gjxsoft.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/Disease")
public class DiseaseControllor {

    @Autowired
    private settlecategoryService settlecategoryService;
    @Autowired
    private DiseaseService diseaseServicee;

    @RequestMapping(value = "/getAll",method = RequestMethod.POST)
    public @ResponseBody HashMap<String, Object> getDepartmentconstantitem(@RequestParam(required = true,defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum, 8);
        HashMap<String,Object> map =new HashMap<>();
        List<Disease> orderDescList = diseaseServicee.findAll();
        PageInfo<Disease> pageInfo = new PageInfo<>(orderDescList);
        map.put("pageInfo",pageInfo);
        map.put("pageNum",pageNum);
        map.put("size",8);
        return map;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> updateRegistLevel(Disease disease){
       diseaseServicee.updateSettlecategory(disease);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> deleteRegistLevel(Integer id){
        diseaseServicee.deleteSettlecategory(id);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public @ResponseBody HashMap<String,String> insertDepart(Disease disease){
        diseaseServicee.insertSettlecategory(disease);
        HashMap<String,String> map =new HashMap<>();
        map.put("msg","成功");
        return map;
    }

    @RequestMapping(value = "/SearchByidOrName",method = RequestMethod.POST)
    public @ResponseBody List<Disease> findByidOrName(String idOrName){
        List<Disease> diseaseList =diseaseServicee.findByIdOrName(idOrName);
        System.out.println(diseaseList);
        return diseaseList;
    }



}
