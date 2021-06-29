package com.car.controller;

import com.car.service.CarCityService;
import com.car.service.CarDriverInfoService;
import com.car.service.CarUserInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

/**
 * (CarCity)表控制层
 *
 * @author makejava
 * @since 2021-06-13 21:23:20
 */
@RestController
@RequestMapping("user")
public class UserController {

    /**
     * 乘客
     */
    @Resource
    private CarUserInfoService carUserInfoService;
    /**
     * 司机
     */
    @Resource
    private CarDriverInfoService carDriverInfoService;

    /**
     * 乘客注册
     *
     * @param condition 用户信息
     * @return 登录成功
     */
    @PostMapping("userRegister")
    public Map<String, Object> userRegister(@RequestBody Map<String, Object> condition) {
        return carUserInfoService.register(condition);
    }

    /**
     * 司机登录注册
     *
     * @param condition 司机信息
     * @return 登录成功
     */
    @GetMapping("driverRegister")
    public Map<String, Object> driverRegister(@RequestBody Map<String, Object> condition) {
        return carDriverInfoService.register(condition);
    }

    /**
     * 乘客登录
     *
     * @param condition 主键
     * @return 登录成功
     */
    @PostMapping("userLogin")
    public Map<String, Object> userLogin(@RequestBody Map<String, Object> condition) {
        return carUserInfoService.login(condition);
    }

    /**
     * 司机登录登录
     *
     * @param condition 主键
     * @return 登录成功
     */
    @GetMapping("driverLogin")
    public Map<String, Object> driverLogin(@RequestBody Map<String, Object> condition) {
        return carDriverInfoService.login(condition);
    }
}
