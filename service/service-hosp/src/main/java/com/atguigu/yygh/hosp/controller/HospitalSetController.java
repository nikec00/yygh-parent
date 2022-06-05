package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nkc
 * @date 22/6/1
 */
@RestController
@RequestMapping("/admin/hosp/hospitalSet")
public class HospitalSetController {

    @Autowired
    private HospitalSetService hospitalSetService;

    /**
     * 查询医院设置表所有信息
     *
     * @return
     */
    @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet() {
        return hospitalSetService.list();
    }

    /**
     * 删除医院设置
     * @param id
     * @return
     */
    @DeleteMapping("{id}")
    public Boolean removeHospitalSet(@PathVariable Long id) {
        return hospitalSetService.removeById(id);
    }
}
