package com.car.controller;

import com.car.entity.CarCity;
import com.car.service.carPool.CarCityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * (CarCity)表控制层
 *
 * @author makejava
 * @since 2021-06-13 21:23:20
 */
@RestController
@RequestMapping("carCity")
@CrossOrigin
@Slf4j
public class CarCityController {
    //11
    /**
     * 服务对象
     */
    @Resource(name = "carCityServiceImpl")
    private CarCityService carCityServiceImpl;

    @Autowired
    HttpServletResponse httpServletResponse;

    @Autowired
    HttpSession httpSession;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CarCity selectOne(Long id) {
        return this.carCityServiceImpl.queryById(id);
    }

    /**
     * 通过省id查询批量数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectByPid")
    public Map<String, Object> selectByPid(Long id) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        atomicInteger.getAndIncrement();
        log.info("selectByPid-入参{}", id);
        Map<String, Object> result = new HashMap<>();
        result.put("list", carCityServiceImpl.selectByPid(id));
        result.put("code", "00");
        log.info("selectByPid-反参{}", result);
        return result;
    }
}
