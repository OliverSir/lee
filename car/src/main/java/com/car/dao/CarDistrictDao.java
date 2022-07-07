package com.car.dao;

import com.car.entity.CarDistrict;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CarDistrict)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-13 21:23:47
 */
public interface CarDistrictDao {

    /**
     * 通过ID查询单条数据
     *
     * @param districtid 主键
     * @return 实例对象
     */
    CarDistrict queryById(Long districtid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarDistrict> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carDistrict 实例对象
     * @return 对象列表
     */
    List<CarDistrict> queryAll(CarDistrict carDistrict);

    /**
     * 新增数据
     *
     * @param carDistrict 实例对象
     * @return 影响行数
     */
    int insert(CarDistrict carDistrict);

    /**
     * 修改数据
     *
     * @param carDistrict 实例对象
     * @return 影响行数
     */
    int update(CarDistrict carDistrict);

    /**
     * 通过主键删除数据
     *
     * @param districtid 主键
     * @return 影响行数
     */
    int deleteById(Long districtid);

}