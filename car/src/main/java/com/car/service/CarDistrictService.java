package com.car.service;

import com.car.entity.CarDistrict;
import java.util.List;

/**
 * (CarDistrict)表服务接口
 *
 * @author makejava
 * @since 2021-06-13 21:23:47
 */
public interface CarDistrictService {

    /**
     * 通过ID查询单条数据
     *
     * @param districtid 主键
     * @return 实例对象
     */
    CarDistrict queryById(Long districtid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarDistrict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carDistrict 实例对象
     * @return 实例对象
     */
    CarDistrict insert(CarDistrict carDistrict);

    /**
     * 修改数据
     *
     * @param carDistrict 实例对象
     * @return 实例对象
     */
    CarDistrict update(CarDistrict carDistrict);

    /**
     * 通过主键删除数据
     *
     * @param districtid 主键
     * @return 是否成功
     */
    boolean deleteById(Long districtid);
    /**
     * 通过cityID查询数据
     *
     * @param cityId 主键
     * @return 是否成功
     */
    List<CarDistrict> queryAllByCId(Long cityId);
}
