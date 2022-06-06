package com.atguigu.easyExcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.Map;

/**
 * @author nkc
 * @date 22/6/6
 */
public class EasyExcelListener extends AnalysisEventListener<UserData> {
    /**
     * 一行一行的执行,从第二行开始读取
     * @param userData
     * @param analysisContext
     */
    @Override
    public void invoke(UserData userData, AnalysisContext analysisContext) {
        System.out.println(userData);
    }

    /**
     * 读取表头信息
     * @param headMap
     * @param context
     */
    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        super.invokeHeadMap(headMap, context);
        System.out.println("表头信息:" + headMap);
    }

    /**
     * 读取完后执行
     * @param analysisContext
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println(analysisContext);
    }
}
