package com.atguigu.yygh.cmn.service;

import com.atguigu.yygh.model.cmn.Dict;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author nkc
 * @date 22/6/6
 */
public interface DictService {
    List<Dict> findChildData(Long id);

    void exportDictData(HttpServletResponse response) throws IOException;

    void importDict(MultipartFile file);
}
