package com.car.service;

import com.car.entity.CarTask;
import java.util.List;

/**
 * 任务发布表(CarTask)表服务接口
 *
 * @author makejava
 * @since 2021-06-13 22:56:58
 */
public interface CarTaskService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarTask queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarTask> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carTask 实例对象
     * @return 实例对象
     */
    CarTask insert(CarTask carTask);

    /**
     * 修改数据
     *
     * @param carTask 实例对象
     * @return 实例对象
     */
    CarTask update(CarTask carTask);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}