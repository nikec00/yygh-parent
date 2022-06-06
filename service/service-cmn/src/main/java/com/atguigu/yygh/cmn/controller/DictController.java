package com.atguigu.yygh.cmn.controller;

import com.atguigu.yygh.cmn.service.DictService;
import com.atguigu.yygh.common.result.Result;
import com.atguigu.yygh.model.cmn.Dict;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author nkc
 * @date 22/6/6
 */
@Api(value = "数据字典接口")
@RestController
@RequestMapping("/admin/cmn/dict")
@CrossOrigin
public class DictController {
    @Autowired
    private DictService dictService;

    @ApiOperation(value = "根据数据id查询子数据列表")
    @GetMapping("findChildData/{id}")
    public Result findChildData(@PathVariable Long id) {
        List<Dict> list = dictService.findChildData(id);
        return Result.ok(list);
    }

    /**
     * 导出文件
     *
     * @param response
     * @throws IOException
     */
    @GetMapping("exportData")
    public void exportDict(HttpServletResponse response) throws IOException {
        dictService.exportDictData(response);
    }

    /**
     * 导入文件保存数据库
     * @param file
     */
    @PostMapping("importDict")
    public void importDict(MultipartFile file) {
        dictService.importDict(file);
    }

}
