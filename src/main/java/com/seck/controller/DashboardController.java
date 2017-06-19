package com.seck.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by elias on 19/06/17.
 */
@Controller
public class DashboardController {

    @RequestMapping("/")
    public String index(ModelMap map, HttpServletRequest request ) {

        return "views/index";
    }
}
