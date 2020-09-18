package com.gjxsoft.controllor;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gjxsoft.domain.Rule;
import com.gjxsoft.domain.Scheduling;
import com.gjxsoft.service.RuleService;
import com.gjxsoft.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/scheduling")
public class schedulingControllor {
    @Autowired
    private SchedulingService schedulingService;
    @Autowired
    private RuleService ruleService;
    @RequestMapping("/findschedulingList")
    public @ResponseBody HashMap<String,Object> findschedulingList(@RequestParam(required = true,defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum, 8);
        HashMap<String,Object> map =new HashMap<>();
        List<Scheduling> list =schedulingService.findAll();
        PageInfo<Scheduling> pageInfo =new PageInfo<>(list);
        map.put("pageInfo",pageInfo);
        map.put("pageNum",pageNum);
        map.put("size",8);
        return map;

    }


    @RequestMapping("/findschedulingUserList")
    public @ResponseBody HashMap<String,Object> findschedulingListAndUser(@RequestParam(required = true,defaultValue = "1")Integer pageNum){
        PageHelper.startPage(pageNum, 8);
        HashMap<String,Object> map =new HashMap<>();
        List<Scheduling> list =schedulingService.findScheduling();
        PageInfo<Scheduling> pageInfo =new PageInfo<>(list);
        map.put("pageInfo",pageInfo);
        map.put("pageNum",pageNum);
        map.put("size",8);
        return map;

    }

    @RequestMapping("/insertRule")
    public @ResponseBody HashMap<String,Object> insertRule(Rule rule){
        System.out.println(rule);
        HashMap<String,Object> map =new HashMap<>();
        ruleService.insertRule(rule);
        map.put("msg","success");
        return map;

    }

    @RequestMapping(value = "/selectRuleAndUser",method = RequestMethod.POST)
    public @ResponseBody
    List<Rule> getRule(){
        List<Rule> rules=ruleService.selectRuleAndUser();

        return rules;
    }


    @RequestMapping("/insertScheduling")
    public @ResponseBody HashMap<String,Object> insertScheduling(Scheduling scheduling, HttpServletRequest request){
        System.out.println(scheduling);
        HashMap<String,Object> map =new HashMap<>();

        if (request.getSession().getAttribute(""+scheduling.getUserId()) ==null){
            request.getSession().setAttribute(""+scheduling.getUserId(),"true");
            schedulingService.deleteByID((int)scheduling.getUserId());
        }
        schedulingService.insertScheduling(scheduling);
        map.put("msg","success");
        return map;

    }

    @RequestMapping("/clear")
    public @ResponseBody HashMap<String,Object> clear(String userId,HttpServletRequest request){
        System.out.println(userId+"清空");
        HashMap<String,Object> map =new HashMap<>();
        request.getSession().setAttribute(userId,null);

        map.put("msg","success");
        return map;

    }

}
