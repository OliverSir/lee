package com.car.service.impl;

import com.car.entity.CarUserInfo;
import com.car.dao.CarUserInfoDao;
import com.car.service.CarUserInfoService;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 乘客表(CarUserInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-06-13 22:57:13
 */
@Service("carUserInfoService")
public class CarUserInfoServiceImpl implements CarUserInfoService {
    @Resource
    private CarUserInfoDao carUserInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CarUserInfo queryById(Long id) {
        return this.carUserInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<CarUserInfo> queryAllByLimit(int offset, int limit) {
        return this.carUserInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carUserInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CarUserInfo insert(CarUserInfo carUserInfo) {
        this.carUserInfoDao.insert(carUserInfo);
        return carUserInfo;
    }

    /**
     * 修改数据
     *
     * @param carUserInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CarUserInfo update(CarUserInfo carUserInfo) {
        this.carUserInfoDao.update(carUserInfo);
        return this.queryById(carUserInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.carUserInfoDao.deleteById(id) > 0;
    }

    /**
     * 乘客登录
     *
     * @param condition 登录参数
     * @return 登录返回结果
     */
    @Override
    public Map<String, Object> login(Map<String, Object> condition) {
        Map<String, Object> result = new HashMap<>();
        String pwd = condition.get("password").toString();
        String encode = MD5Encoder.encode(pwd.getBytes(StandardCharsets.UTF_8));
        CarUserInfo userInfo = carUserInfoDao.getPassword(condition);
        if (userInfo.getPassward().equals(encode)) {
            result.put("code", "000000");
        } else {
            result.put("code", "999999");
        }
        return result;
    }
    /**
     * 乘客注册
     *
     * @param condition 登录参数
     * @return 登录返回结果
     */
    @Override
    public Map<String, Object> register(Map<String, Object> condition) {
        Map<String, Object> result = new HashMap<>();
        CarUserInfo carUserInfo = new CarUserInfo();
        carUserInfo.setUserId(Long.parseLong(condition.get("userId").toString()));
        carUserInfo.setUserName(condition.get("userName").toString());
        carUserInfo.setPassward(MD5Encoder.encode(condition.get("password").toString().getBytes(StandardCharsets.UTF_8)));
        if (carUserInfoDao.insert(carUserInfo) > 0) {
            result.put("code", "000000");
        } else {
            result.put("code", "999999");
        }
        return result;
    }

}