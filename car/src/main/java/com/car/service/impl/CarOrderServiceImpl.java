package com.car.service.impl;

import com.car.entity.CarOrder;
import com.car.dao.CarOrderDao;
import com.car.service.CarOrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单表(CarOrder)表服务实现类
 *
 * @author makejava
 * @since 2021-06-13 22:56:21
 */
@Service("carOrderService")
public class CarOrderServiceImpl implements CarOrderService {
    @Resource
    private CarOrderDao carOrderDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CarOrder queryById(Long id) {
        return this.carOrderDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CarOrder> queryAllByLimit(int offset, int limit) {
        return this.carOrderDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carOrder 实例对象
     * @return 实例对象
     */
    @Override
    public CarOrder insert(CarOrder carOrder) {
        this.carOrderDao.insert(carOrder);
        return carOrder;
    }

    /**
     * 修改数据
     *
     * @param carOrder 实例对象
     * @return 实例对象
     */
    @Override
    public CarOrder update(CarOrder carOrder) {
        this.carOrderDao.update(carOrder);
        return this.queryById(carOrder.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.carOrderDao.deleteById(id) > 0;
    }
}