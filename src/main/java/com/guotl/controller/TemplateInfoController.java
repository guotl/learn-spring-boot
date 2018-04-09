package com.guotl.controller;

/**
 * Created by guotianlin on 2018/4/8.
 */

import com.guotl.model.TemplateInfo;
import com.guotl.service.TemplateInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/templateInfo")
public class TemplateInfoController {

    @Autowired
    private TemplateInfoService templateInfoService;

    @RequestMapping("")
    @ResponseBody
    public List findAll(){
        return templateInfoService.findAll();
    }

}
