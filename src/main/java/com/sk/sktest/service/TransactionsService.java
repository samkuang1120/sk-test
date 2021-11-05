package com.sk.sktest.service;

import com.sk.sktest.model.TransactionsDO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author samkuang
 * @since 2021-11-05
 */
public interface TransactionsService extends IService<TransactionsDO> {

    Map<String,Object> page(int page, int size, String productName);
}
