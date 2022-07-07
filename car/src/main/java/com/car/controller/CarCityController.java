package com.car.controller;

import com.car.entity.CarCity;
import com.car.service.CarCityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CarCity)表控制层
 *
 * @author makejava
 * @since 2021-06-13 21:23:20
 */
@RestController
@RequestMapping("carCity")
public class CarCityController {
    /**
     * 服务对象
     */
    @Resource
    private CarCityService carCityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CarCity selectOne(Long id) {
        return this.carCityService.queryById(id);
    }

}
