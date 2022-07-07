package com.car.service.impl;

import com.car.entity.CarProvince;
import com.car.dao.CarProvinceDao;
import com.car.service.CarProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CarProvince)表服务实现类
 *
 * @author makejava
 * @since 2021-06-13 21:24:00
 */
@Service("carProvinceService")
public class CarProvinceServiceImpl implements CarProvinceService {
    @Resource
    private CarProvinceDao carProvinceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param provinceid 主键
     * @return 实例对象
     */
    @Override
    public CarProvince queryById(Long provinceid) {
        return this.carProvinceDao.queryById(provinceid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CarProvince> queryAllByLimit(int offset, int limit) {
        return this.carProvinceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carProvince 实例对象
     * @return 实例对象
     */
    @Override
    public CarProvince insert(CarProvince carProvince) {
        this.carProvinceDao.insert(carProvince);
        return carProvince;
    }

    /**
     * 修改数据
     *
     * @param carProvince 实例对象
     * @return 实例对象
     */
    @Override
    public CarProvince update(CarProvince carProvince) {
        this.carProvinceDao.update(carProvince);
        return this.queryById(carProvince.getProvinceid());
    }

    /**
     * 通过主键删除数据
     *
     * @param provinceid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long provinceid) {
        return this.carProvinceDao.deleteById(provinceid) > 0;
    }
}