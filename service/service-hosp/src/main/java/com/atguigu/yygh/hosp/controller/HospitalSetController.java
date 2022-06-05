package com.atguigu.yygh.hosp.controller;

import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.atguigu.yygh.model.hosp.HospitalSet;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nkc
 * @date 22/6/1
 */
@Api(tags = "医院设置管理")
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
    @ApiOperation(value = "获取所有医院设置信息")
    @GetMapping("findAll")
    public List<HospitalSet> findAllHospitalSet() {
        return hospitalSetService.list();
    }

    /**
     * 删除医院设置
     * @param id
     * @return
     */
    @ApiOperation(value = "逻辑删除医院信息")
    @DeleteMapping("{id}")
    public Boolean removeHospitalSet(@PathVariable Long id) {
        return hospitalSetService.removeById(id);
    }
}
