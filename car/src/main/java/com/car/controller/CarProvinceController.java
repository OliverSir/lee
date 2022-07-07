package com.car.controller;

import com.car.entity.CarProvince;
import com.car.service.CarProvinceService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CarProvince)表控制层
 *
 * @author makejava
 * @since 2021-06-13 21:24:00
 */
@RestController
@RequestMapping("carProvince")
public class CarProvinceController {
    /**
     * 服务对象
     */
    @Resource
    private CarProvinceService carProvinceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CarProvince selectOne(Long id) {
        return this.carProvinceService.queryById(id);
    }

}