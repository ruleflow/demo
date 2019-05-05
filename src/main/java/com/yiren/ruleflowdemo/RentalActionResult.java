package com.yiren.ruleflowdemo;

import com.yiren.ruleengine.actionresult.ActionResult;
import com.yiren.ruleengine.anno.RuleResult;

/**
 * 租金计算结果接受类
 * 类型统一为String
 * @author tianjie
 */
public class RentalActionResult implements ActionResult {

    @RuleResult("日费用")
    private String feeOfDay;
    @RuleResult("月费用")
    private String feeOfMonth;
    @RuleResult("年费用")
    private String feeOfyear;

    public String getFeeOfDay() {
        return feeOfDay;
    }

    public void setFeeOfDay(String feeOfDay) {
        this.feeOfDay = feeOfDay;
    }

    public String getFeeOfMonth() {
        return feeOfMonth;
    }

    public void setFeeOfMonth(String feeOfMonth) {
        this.feeOfMonth = feeOfMonth;
    }

    public String getFeeOfyear() {
        return feeOfyear;
    }

    public void setFeeOfyear(String feeOfyear) {
        this.feeOfyear = feeOfyear;
    }
}
