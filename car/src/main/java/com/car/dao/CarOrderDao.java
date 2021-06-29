package com.car.dao;

import com.car.entity.CarOrder;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 订单表(CarOrder)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-13 22:56:21
 */
public interface CarOrderDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarOrder queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarOrder> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carOrder 实例对象
     * @return 对象列表
     */
    List<CarOrder> queryAll(CarOrder carOrder);

    /**
     * 新增数据
     *
     * @param carOrder 实例对象
     * @return 影响行数
     */
    int insert(CarOrder carOrder);

    /**
     * 修改数据
     *
     * @param carOrder 实例对象
     * @return 影响行数
     */
    int update(CarOrder carOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}