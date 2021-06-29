package com.car.service.impl;

import com.car.entity.CarDistrict;
import com.car.dao.CarDistrictDao;
import com.car.service.CarDistrictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (CarDistrict)表服务实现类
 *
 * @author makejava
 * @since 2021-06-13 21:23:47
 */
@Service("carDistrictService")
public class CarDistrictServiceImpl implements CarDistrictService {
    @Resource
    private CarDistrictDao carDistrictDao;

    /**
     * 通过ID查询单条数据
     *
     * @param districtid 主键
     * @return 实例对象
     */
    @Override
    public CarDistrict queryById(Long districtid) {
        return this.carDistrictDao.queryById(districtid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CarDistrict> queryAllByLimit(int offset, int limit) {
        return this.carDistrictDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carDistrict 实例对象
     * @return 实例对象
     */
    @Override
    public CarDistrict insert(CarDistrict carDistrict) {
        this.carDistrictDao.insert(carDistrict);
        return carDistrict;
    }

    /**
     * 修改数据
     *
     * @param carDistrict 实例对象
     * @return 实例对象
     */
    @Override
    public CarDistrict update(CarDistrict carDistrict) {
        this.carDistrictDao.update(carDistrict);
        return this.queryById(carDistrict.getDistrictid());
    }

    /**
     * 通过主键删除数据
     *
     * @param districtid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long districtid) {
        return this.carDistrictDao.deleteById(districtid) > 0;
    }
}