package com.car.service.impl;

import com.car.entity.CarOrderInfo;
import com.car.dao.CarOrderInfoDao;
import com.car.service.CarOrderInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单详情表(CarOrderInfo)表服务实现类
 *
 * @author makejava
 * @since 2021-06-13 22:56:37
 */
@Service("carOrderInfoService")
public class CarOrderInfoServiceImpl implements CarOrderInfoService {
    @Resource
    private CarOrderInfoDao carOrderInfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CarOrderInfo queryById(Long id) {
        return this.carOrderInfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CarOrderInfo> queryAllByLimit(int offset, int limit) {
        return this.carOrderInfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carOrderInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CarOrderInfo insert(CarOrderInfo carOrderInfo) {
        this.carOrderInfoDao.insert(carOrderInfo);
        return carOrderInfo;
    }

    /**
     * 修改数据
     *
     * @param carOrderInfo 实例对象
     * @return 实例对象
     */
    @Override
    public CarOrderInfo update(CarOrderInfo carOrderInfo) {
        this.carOrderInfoDao.update(carOrderInfo);
        return this.queryById(carOrderInfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.carOrderInfoDao.deleteById(id) > 0;
    }
}