package com.atguigu.yygh.hosp.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.atguigu.yygh.hosp.repository.HospitalRepository;
import com.atguigu.yygh.hosp.service.HospitalService;
import com.atguigu.yygh.model.hosp.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;

/**
 * @author nkc
 * @date 22/6/8
 */
@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public void save(Map<String, Object> map) {
        String mapString = JSONObject.toJSONString(map);
        Hospital hospital = JSONObject.parseObject(mapString, Hospital.class);
        // 判断是否存在数据
        String hoscode = hospital.getHoscode();
        Hospital hosExist = hospitalRepository.getHospitalByHoscode(hoscode);
        if (null == hosExist) {
            hospital.setStatus(0);
            hospital.setCreateTime(new Date());
        } else {
            hospital.setStatus(hosExist.getStatus());
            hospital.setCreateTime(hosExist.getCreateTime());
        }
        hospital.setUpdateTime(new Date());
        hospital.setIsDeleted(0);
        hospitalRepository.save(hospital);
    }
}
