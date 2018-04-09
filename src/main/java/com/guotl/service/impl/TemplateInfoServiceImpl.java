package com.guotl.service.impl;

import com.guotl.dao.TemplateInfoDao;
import com.guotl.model.TemplateInfo;
import com.guotl.service.TemplateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by guotianlin on 2018/4/8.
 */
@Service("templateInfoService")
@Transactional
public class TemplateInfoServiceImpl implements TemplateInfoService {

    @Autowired
    private TemplateInfoDao templateInfoDao;

    @Override
    public List<TemplateInfo> findAll() {
        return templateInfoDao.findAll();
    }
}
