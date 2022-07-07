package com.car.service;

import com.car.entity.CarCity;
import java.util.List;

/**
 * (CarCity)表服务接口
 *
 * @author makejava
 * @since 2021-06-13 21:23:19
 */
public interface CarCityService {

    /**
     * 通过ID查询单条数据
     *
     * @param cityid 主键
     * @return 实例对象
     */
    CarCity queryById(Long cityid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarCity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carCity 实例对象
     * @return 实例对象
     */
    CarCity insert(CarCity carCity);

    /**
     * 修改数据
     *
     * @param carCity 实例对象
     * @return 实例对象
     */
    CarCity update(CarCity carCity);

    /**
     * 通过主键删除数据
     *
     * @param cityid 主键
     * @return 是否成功
     */
    boolean deleteById(Long cityid);

}