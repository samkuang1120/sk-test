package com.sk.sktest.controller;


import com.sk.sktest.service.TransactionsService;
import com.sk.sktest.util.JsonData;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author samkuang
 * @since 2021-11-05
 */
@RestController
@RequestMapping("/api/transactions/v1")
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;

    @GetMapping("page")
    public JsonData pageTransList(
            @ApiParam(value = "当前页")  @RequestParam(value = "page", defaultValue = "1") int page,
            @ApiParam(value = "每页显示多少条") @RequestParam(value = "size", defaultValue = "10") int size,
            @ApiParam(value = "产品名字") @RequestParam(value = "prod_name",required = false) String  productName
    ){

        Map<String,Object> pageResult = transactionsService.page(page,size,productName);

        return JsonData.buildSuccess(pageResult);


    }


}

