package com.car.dao;

import com.car.entity.CarTask;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 任务发布表(CarTask)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-13 22:56:58
 */
public interface CarTaskDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarTask queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarTask> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carTask 实例对象
     * @return 对象列表
     */
    List<CarTask> queryAll(CarTask carTask);

    /**
     * 新增数据
     *
     * @param carTask 实例对象
     * @return 影响行数
     */
    int insert(CarTask carTask);

    /**
     * 修改数据
     *
     * @param carTask 实例对象
     * @return 影响行数
     */
    int update(CarTask carTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}