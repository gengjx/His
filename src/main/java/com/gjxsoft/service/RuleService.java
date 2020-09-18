package com.gjxsoft.service;

import com.gjxsoft.domain.Rule;

import java.util.List;

public interface RuleService {
    List<Rule> findAll();

    void insertRule(Rule rule);

    List<Rule> selectRuleAndUser();
}
