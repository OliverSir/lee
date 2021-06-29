package com.car.dao;

import com.car.entity.CarUserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 乘客表(CarUserInfo)表数据库访问层
 *
 * @author makejava
 * @since 2021-06-13 22:57:13
 */
public interface CarUserInfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    CarUserInfo queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<CarUserInfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param carUserInfo 实例对象
     * @return 对象列表
     */
    List<CarUserInfo> queryAll(CarUserInfo carUserInfo);

    /**
     * 新增数据
     *
     * @param carUserInfo 实例对象
     * @return 影响行数
     */
    int insert(CarUserInfo carUserInfo);

    /**
     * 修改数据
     *
     * @param carUserInfo 实例对象
     * @return 影响行数
     */
    int update(CarUserInfo carUserInfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 通过ID查询单条数据
     *
     * @param condition 用户信息(用户手机号登录，用户名登录)
     * @return 实例对象
     */
    CarUserInfo getPassword(Map<String, Object> condition);
}