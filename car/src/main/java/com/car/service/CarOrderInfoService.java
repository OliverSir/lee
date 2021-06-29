package com.car.service;

import com.car.entity.CarOrderInfo;
import java.util.List;

/**
 * 订单详情表(CarOrderInfo)表服务接口
 *
 * @author makejava
 * @since 2021-06-13 22:56:37
 */
public interface CarOrderInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarOrderInfo queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarOrderInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carOrderInfo 实例对象
     * @return 实例对象
     */
    CarOrderInfo insert(CarOrderInfo carOrderInfo);

    /**
     * 修改数据
     *
     * @param carOrderInfo 实例对象
     * @return 实例对象
     */
    CarOrderInfo update(CarOrderInfo carOrderInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}