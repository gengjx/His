package com.gjxsoft.dao;

import com.gjxsoft.domain.Rule;
import com.gjxsoft.service.UserService;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("RuleDao")
public interface RuleDao {

    List<Rule> findAll();

    void insertRule(Rule rule);


    List<Rule> selectRuleAndUser();
}
