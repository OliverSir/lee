package com.car.service;

import com.car.entity.CarDriverInfo;
import java.util.List;
import java.util.Map;

/**
 * 司机表(CarDriverInfo)表服务接口
 *
 * @author makejava
 * @since 2021-06-13 22:55:52
 */
public interface CarDriverInfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarDriverInfo queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<CarDriverInfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carDriverInfo 实例对象
     * @return 实例对象
     */
    CarDriverInfo insert(CarDriverInfo carDriverInfo);

    /**
     * 修改数据
     *
     * @param carDriverInfo 实例对象
     * @return 实例对象
     */
    CarDriverInfo update(CarDriverInfo carDriverInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);
    /**
     * 司机登录
     *
     * @param condition 登录参数
     * @return 登录返回结果
     */
    Map<String, Object> login(Map<String, Object> condition);

    /**
     * 司机注册
     *
     * @param condition 注册参数
     * @return 注册返回结果
     */
    Map<String, Object> register(Map<String, Object> condition);
}