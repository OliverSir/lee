package com.car.service.impl;

import com.car.entity.CarDriverInfo;
import com.car.dao.CarDriverInfoDao;
import com.car.entity.CarUserInfo;
import com.car.service.CarDriverInfoService;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 司机表(CarDriverInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-06-13 22:55:52
 */
@Service("carDriverInfoService")
public class CarDriverInfoServiceImpl implements CarDriverInfoService {
    @Resource
    private CarDriverInfoDao carDriverInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CarDriverInfo queryById(Long id) {
        return this.carDriverInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CarDriverInfo> queryAllByLimit(int offset, int limit) {
        return this.carDriverInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carDriverInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CarDriverInfo insert(CarDriverInfo carDriverInfo) {
        this.carDriverInfoDao.insert(carDriverInfo);
        return carDriverInfo;
    }

    /**
     * 修改数据
     *
     * @param carDriverInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CarDriverInfo update(CarDriverInfo carDriverInfo) {
        this.carDriverInfoDao.update(carDriverInfo);
        return this.queryById(carDriverInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.carDriverInfoDao.deleteById(id) > 0;
    }

    /**
     * 司机登录
     *
     * @param condition 登录参数
     * @return 登录返回结果
     */
    @Override
    public Map<String, Object> login(Map<String, Object> condition) {
        Map<String, Object> result = new HashMap<>();
        String pwd = condition.get("password").toString();
        String encode = MD5Encoder.encode(pwd.getBytes(StandardCharsets.UTF_8));
        CarDriverInfo carDriverInfo = carDriverInfoDao.getDriver(condition);
        if (carDriverInfo.getPassward().equals(encode)) {
            result.put("code", "000000");
        } else {
            result.put("code", "999999");
        }
        return result;
    }

    /**
     * 司机注册
     *
     * @param condition 注册参数
     * @return 注册返回结果
     */
    @Override
    public Map<String, Object> register(Map<String, Object> condition) {
        return null;
    }
}