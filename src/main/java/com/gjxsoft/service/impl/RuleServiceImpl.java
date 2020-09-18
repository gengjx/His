package com.gjxsoft.service.impl;

import com.gjxsoft.dao.RuleDao;
import com.gjxsoft.domain.Rule;
import com.gjxsoft.domain.User;
import com.gjxsoft.service.RuleService;
import com.gjxsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service("ruleService")
public class RuleServiceImpl implements RuleService {
    @Autowired
    private RuleDao ruleDao;

    @Override
    @Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
    public List<Rule> findAll() {

        return ruleDao.findAll();
    }

    @Override
    public void insertRule(Rule rule) {
        ruleDao.insertRule(rule);
    }

    @Override
    public List<Rule> selectRuleAndUser() {
        return ruleDao.selectRuleAndUser();
    }


}
