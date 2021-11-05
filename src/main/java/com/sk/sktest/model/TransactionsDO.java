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
@TableName("transactions")
public class TransactionsDO implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "txn_id", type = IdType.AUTO)
    private Integer txnId;

    private String productName;

    private BigDecimal buyPrice;

    private BigDecimal qty;

    private BigDecimal sellPrice;

    private String txnTime;

    private String location;


}
