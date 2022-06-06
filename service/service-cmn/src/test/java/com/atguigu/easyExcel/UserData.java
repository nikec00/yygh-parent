package com.atguigu.easyExcel;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author nkc
 * @date 22/6/6
 */
@Data
public class UserData {

    @ExcelProperty(value = "用户编号", index = 0)
    private Integer uid;

    @ExcelProperty(value = "用户名称", index = 1)
    private String username;

}
