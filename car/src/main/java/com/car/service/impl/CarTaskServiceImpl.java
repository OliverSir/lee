package com.car.service.impl;

import com.car.entity.CarTask;
import com.car.dao.CarTaskDao;
import com.car.service.CarTaskService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 任务发布表(CarTask)表服务实现类
 *
 * @author makejava
 * @since 2021-06-13 22:56:58
 */
@Service("carTaskService")
public class CarTaskServiceImpl implements CarTaskService {
    @Resource
    private CarTaskDao carTaskDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public CarTask queryById(Long id) {
        return this.carTaskDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<CarTask> queryAllByLimit(int offset, int limit) {
        return this.carTaskDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param carTask 实例对象
     * @return 实例对象
     */
    @Override
    public CarTask insert(CarTask carTask) {
        this.carTaskDao.insert(carTask);
        return carTask;
    }

    /**
     * 修改数据
     *
     * @param carTask 实例对象
     * @return 实例对象
     */
    @Override
    public CarTask update(CarTask carTask) {
        this.carTaskDao.update(carTask);
        return this.queryById(carTask.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.carTaskDao.deleteById(id) > 0;
    }
}