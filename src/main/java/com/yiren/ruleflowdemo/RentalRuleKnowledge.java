package com.yiren.ruleflowdemo;
import com.yiren.ruleengine.anno.KnowledgeNameAndSource;
import com.yiren.ruleengine.knowledge.Knowledge;

/**
 * 在规则引擎中使用到的可变参数
 * 封装所有公式中用到的变量
 * 如：月销售额，累计销售额等
 * @author  tianjie
 * @date 2018-11-30
 */
public class RentalRuleKnowledge implements Knowledge {


    @KnowledgeNameAndSource(name="单日不含税销售额",method = "getTheMonthSales",clz = KnowledgeSupplier.class)
    private Double incomeWithoutTaxOfDay;


    public Double getIncomeWithoutTaxOfDay() {
        return incomeWithoutTaxOfDay;
    }

    public void setIncomeWithoutTaxOfDay(Double incomeWithoutTaxOfDay) {
        this.incomeWithoutTaxOfDay = incomeWithoutTaxOfDay;
    }

}
