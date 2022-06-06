package com.atguigu.easyExcel;

import com.alibaba.excel.EasyExcel;

import java.io.File;

/**
 * @author nkc
 * @date 22/6/6
 */
public class TestRead {
    public static void main(String[] args) {
        String fileName = "/Users/nkc/Documents/excel/01.xlsx";
        EasyExcel.read(fileName,UserData.class,new EasyExcelListener()).sheet().doRead();
    }
}
