package com.sk.sktest.service;

import com.sk.sktest.model.UserDO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sk.sktest.request.UserLoginRequest;
import com.sk.sktest.request.UserRegisterRequest;
import com.sk.sktest.util.JsonData;
import com.sk.sktest.vo.UserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author samkuang
 * @since 2021-11-08
 */
public interface UserService extends IService<UserDO> {

    public JsonData register(UserRegisterRequest registerRequest);
    /**
     * 用户登录
     * @param userLoginRequest
     * @return
     */
    JsonData login(UserLoginRequest userLoginRequest);

    /**
     * 查询用户详情
     * @return
     */
    UserVO findUserDetail();
}
