package com.yiren.ruleflowdemo;

import com.yiren.ruleengine.util.RuleLocal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 知识提供类
 * 主要用于计算公式中各可变参数值
 * 类中所有方法以Map为参数返回为Double
 * @author tian.jie
 */
@Service
@Slf4j
public class KnowledgeSupplier {

    //单日不含税销售额
    public Object getTheMonthSales(Map<String,Object> map){
        log.info("local参数：{}",String.valueOf(map));
        if("1".equals(String.valueOf(map.get("id")))){
            return 9999;
        }else{
            return 10001;
        }
    }
}
