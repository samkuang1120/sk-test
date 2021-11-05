package com.sk.sktest.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sk.sktest.mapper.TransactionsMapper;
import com.sk.sktest.model.TransactionsDO;
import com.sk.sktest.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author samkuang
 * @since 2021-11-05
 */
@Service
public class TransactionsServiceImpl extends ServiceImpl<TransactionsMapper, TransactionsDO> implements TransactionsService {

    @Autowired
    private TransactionsMapper transMapper;

    @Override
    public Map<String, Object> page(int page, int size, String productName) {

        Page<TransactionsDO> pageInfo = new Page<>(page,size);

        IPage<TransactionsDO> transDOPage = transMapper.selectPage(pageInfo,new QueryWrapper<TransactionsDO>().like("product_name", productName));

        List<TransactionsDO> transDOList =  transDOPage.getRecords();

        Map<String,Object> pageMap = new HashMap<>(3);
        pageMap.put("total_record",transDOPage.getTotal());
        pageMap.put("total_page",transDOPage.getPages());
        pageMap.put("current_data",transDOList);

        return pageMap;
    }
}
