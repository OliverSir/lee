package com.car.controller;

import com.alibaba.fastjson.JSONObject;
import com.car.entity.CarCity;
import com.car.entity.CarDistrict;
import com.car.entity.CarProvince;
import com.car.service.CarCityService;
import com.car.service.CarDistrictService;
import com.car.service.CarProvinceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (CarProvince)表控制层
 *
 * @author makejava
 * @since 2021-06-13 21:24:00
 */
@RestController
@RequestMapping("carProvince")
@CrossOrigin
@Slf4j
public class CarProvinceController {
    /**
     * 服务对象
     */
    @Resource
    private CarProvinceService carProvinceService;
    /**
     * 服务对象
     */
    @Resource
    private CarCityService carCityService;
    /**
     * 服务对象
     */
    @Resource
    private CarDistrictService carDistrictService;
    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public CarProvince selectOne(Long id) {
        return this.carProvinceService.queryById(id);
    }
    /**
     * 查询全部省
     *
     * @return 单条数据
     */
    @GetMapping("queryAll")
    public Map<String, Object> queryAll() {
        Map<String, Object> result = new HashMap<>();
        List<CarProvince> carProvinces = carProvinceService.queryAll();
        JSONObject jo = new JSONObject();
        JSONObject provinceList = new JSONObject();
        JSONObject cityList = new JSONObject();
        JSONObject countyList = new JSONObject();

        carProvinces.forEach(value -> {
            int pIndex = carProvinces.indexOf(value) + 1;
            String pidIndex = pIndex < 10 ? "0" + pIndex : pIndex + "";
            String pid = pidIndex + "0000";
            provinceList.put(pid, value.getProvincename());
            List<CarCity> carCities = carCityService.selectByPid(value.getProvinceid());
            carCities.forEach(v -> {
                int cIndex = carCities.indexOf(v) + 1;
                String cidIndex = cIndex < 10 ? "0" + cIndex : cIndex + "";
                String cid = pidIndex + cidIndex + "00";
                cityList.put(cid, v.getCityname());
                List<CarDistrict> district = carDistrictService.queryAllByCId(v.getCityid());
                district.forEach(v1 -> {
                    int dIndex = district.indexOf(v1) + 1;
                    String didIndex = dIndex < 10 ? "0" + dIndex : dIndex + "";
                    String did = pidIndex + cidIndex + didIndex;
                    countyList.put(did, v1.getDistrictname());
                });
            });
        });
        jo.put("province_list", provinceList);
        jo.put("city_list", cityList);
        jo.put("county_list", countyList);
        log.info("列表{}", jo);
        result.put("list", carProvinces);
        result.put("code", "00");
        return result;
    }
}
