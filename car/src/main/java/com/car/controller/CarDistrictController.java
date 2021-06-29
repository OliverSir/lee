package com.car.controller;

import com.car.entity.CarDistrict;
import com.car.service.CarDistrictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (CarDistrict)表控制层
 *
 * @author makejava
 * @since 2021-06-13 21:23:47
 */
@RestController
@RequestMapping("carDistrict")
public class CarDistrictController {
    /**
     * 服务对象
     */
    @Resource
    private CarDistrictService carDistrictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CarDistrict selectOne(Long id) {
        return this.carDistrictService.queryById(id);
    }

}