package com.guotl.dao;

import com.guotl.model.TemplateInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by guotianlin on 2018/4/8.
 */
@Mapper
@Repository
public interface TemplateInfoDao {

    public List<TemplateInfo> findAll();

}
