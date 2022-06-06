package com.atguigu.easyExcel;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nkc
 * @date 22/6/6
 */
public class TestWrite {
    public static void main(String[] args) {
        List<UserData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserData userData = new UserData();
            userData.setUid(i);
            userData.setUsername(i + ":倪克成");
            list.add(userData);
        }
        //1.设置excel文件路径和文件名称
        String fileName = "/Users/nkc/Documents/excel/01.xlsx";
        EasyExcel.write(fileName, UserData.class).sheet("用户信息").doWrite(list);
    }
}
