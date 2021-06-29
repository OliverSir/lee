package com.car.service;

import com.car.entity.CarOrder;
import java.util.List;

/**
 * 订单表(CarOrder)表服务接口
 *
 * @author makejava
 * @since 2021-06-13 22:56:21
 */
public interface CarOrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarOrder queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarOrder> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carOrder 实例对象
     * @return 实例对象
     */
    CarOrder insert(CarOrder carOrder);

    /**
     * 修改数据
     *
     * @param carOrder 实例对象
     * @return 实例对象
     */
    CarOrder update(CarOrder carOrder);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}