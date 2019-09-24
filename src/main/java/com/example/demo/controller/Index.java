package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class Index {
    @Value("${soa-json}")
    private Resource areaRes;

    private Logger logger= LoggerFactory.getLogger(Index.class);

    @RequestMapping("index")
    public String index(){
        try {
            logger.info(areaRes.getFile().getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "index";
    }
}
