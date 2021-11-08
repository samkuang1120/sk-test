package com.sk.sktest.controller;


import com.sk.sktest.request.UserLoginRequest;
import com.sk.sktest.request.UserRegisterRequest;
import com.sk.sktest.service.UserService;
import com.sk.sktest.util.JsonData;
import com.sk.sktest.vo.UserVO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author samkuang
 * @since 2021-11-08
 */
@RestController
@RequestMapping("/api/user/v1")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *  用户注册
     * @param registerRequest
     * @return
     */
    @ApiOperation("用户注册")
    @PostMapping("register")
    public JsonData register(@ApiParam("用户注册对象") @RequestBody UserRegisterRequest registerRequest){

        JsonData jsonData = userService.register(registerRequest);
        return jsonData;
    }

    /**
     * 用户登录
     * @return
     */
    @ApiOperation("用户登录")
    @PostMapping("login")
    public JsonData login(@ApiParam("用户登录对象") @RequestBody UserLoginRequest userLoginRequest){


        JsonData jsonData = userService.login(userLoginRequest);

        return jsonData;
    }


    /**
     * 用户个人信息查询
     * @return
     */
    @ApiOperation("个人信息查询")
    @GetMapping("detail")
    public JsonData detail(){

        UserVO userVO = userService.findUserDetail();

        return JsonData.buildSuccess(userVO);
    }

}

