package com.car.service;

import com.car.entity.CarProvince;
import java.util.List;

/**
 * (CarProvince)表服务接口
 *
 * @author makejava
 * @since 2021-06-13 21:24:00
 */
public interface CarProvinceService {

    /**
     * 通过ID查询单条数据
     *
     * @param provinceid 主键
     * @return 实例对象
     */
    CarProvince queryById(Long provinceid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarProvince> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carProvince 实例对象
     * @return 实例对象
     */
    CarProvince insert(CarProvince carProvince);

    /**
     * 修改数据
     *
     * @param carProvince 实例对象
     * @return 实例对象
     */
    CarProvince update(CarProvince carProvince);

    /**
     * 通过主键删除数据
     *
     * @param provinceid 主键
     * @return 是否成功
     */
    boolean deleteById(Long provinceid);

}