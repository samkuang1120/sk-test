package com.sk.sktest.service;

import com.sk.sktest.enums.SendCodeEnum;
import com.sk.sktest.util.JsonData;

/**
* @Author Sam Kuang
* @Description //TODO 
* @Date 11:25 2021-11-08
**/
public interface NotifyService {

    /**
     * 发送验证码
     * @param sendCodeEnum
     * @param to
     * @return
     */
    JsonData sendCode(SendCodeEnum sendCodeEnum, String to );


    /**
     * 判断验证码是否一样
     * @param sendCodeEnum
     * @param to
     * @param code
     * @return
     */
    boolean checkCode(SendCodeEnum sendCodeEnum,String to, String code);




}
