package com.atguigu.yygh.cmn.service;

import com.atguigu.yygh.model.cmn.Dict;

import java.util.List;

/**
 * @author nkc
 * @date 22/6/6
 */
public interface DictService {
    List<Dict> findChildData(Long id);
}
