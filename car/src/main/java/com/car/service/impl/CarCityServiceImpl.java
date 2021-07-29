package com.car.service.impl;

import com.car.entity.CarCity;
import com.car.dao.CarCityDao;
import com.car.service.CarCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CarCity)表服务实现类
 *
 * @author makejava
 * @since 2021-06-13 21:23:20
 */
@Service("carCityService")
public class CarCityServiceImpl implements CarCityService {
    @Resource
    private CarCityDao carCityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cityid 主键
     * @return 实例对象
     */
    @Override
    public CarCity queryById(Long cityid) {
        return this.carCityDao.queryById(cityid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CarCity> queryAllByLimit(int offset, int limit) {
        return this.carCityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carCity 实例对象
     * @return 实例对象
     */
    @Override
    public CarCity insert(CarCity carCity) {
        this.carCityDao.insert(carCity);
        return carCity;
    }

    /**
     * 修改数据
     *
     * @param carCity 实例对象
     * @return 实例对象
     */
    @Override
    public CarCity update(CarCity carCity) {
        this.carCityDao.update(carCity);
        return this.queryById(carCity.getCityid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cityid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long cityid) {
        return this.carCityDao.deleteById(cityid) > 0;
    }

    /**
     * 通过省id查询批量数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @Override
    public List<CarCity> selectByPid(Long id) {
        return carCityDao.selectByPid(id);
    }

}
