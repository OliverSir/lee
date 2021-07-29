package com.car.dao;

import com.car.entity.CarCity;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (CarCity)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-13 21:23:19
 */
public interface CarCityDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cityid 主键
     * @return 实例对象
     */
    CarCity queryById(Long cityid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarCity> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carCity 实例对象
     * @return 对象列表
     */
    List<CarCity> queryAll(CarCity carCity);

    /**
     * 新增数据
     *
     * @param carCity 实例对象
     * @return 影响行数
     */
    int insert(CarCity carCity);

    /**
     * 修改数据
     *
     * @param carCity 实例对象
     * @return 影响行数
     */
    int update(CarCity carCity);

    /**
     * 通过主键删除数据
     *
     * @param cityid 主键
     * @return 影响行数
     */
    int deleteById(Long cityid);
    /**
     * 通过省id查询批量数据
     *
     * @param id 主键
     * @return 单条数据
     */
    List<CarCity> selectByPid(Long id);
}
