package com.yiren.ruleflowdemo;

import com.yiren.ruleengine.rules.Rule;
import com.yiren.ruleengine.rules.RuleContainer;
import com.yiren.ruleengine.util.RuleDriverUtil;
import com.yiren.ruleengine.util.RuleLocal;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RuleflowdemoApplicationTests {

    @Test
    public void contextLoads() {
        RuleLocal.put("id",1);
        List<Rule> actionRules = new ArrayList<>();
        actionRules.add(new Rule("单日不含税销售额>10000","日费用=单日不含税销售额*0.1"));
        actionRules.add(new Rule("单日不含税销售额<10000","日费用=单日不含税销售额*0.2"));
        RentalActionResult rentalActionResult = new RentalActionResult();
        RuleContainer ruleContainer = new RuleContainer(actionRules,new RentalRuleKnowledge(),rentalActionResult);
        RuleDriverUtil.excute(ruleContainer);
        log.info("计算得到日费用={}",rentalActionResult.getFeeOfDay());
    }

}
