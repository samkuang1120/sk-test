package com.sk.sktest.model;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author samkuang
 * @since 2021-11-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("monthly_income")
public class MonthlyIncomeDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "income_id", type = IdType.AUTO)
    private Integer incomeId;

    private String location;

    private String txnTime;

    private BigDecimal totalBuyAmt;

    private BigDecimal totalSellAmt;

    private BigDecimal incomeAmt;


}
