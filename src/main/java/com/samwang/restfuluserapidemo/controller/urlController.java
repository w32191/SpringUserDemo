package com.samwang.restfuluserapidemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class urlController {

  public String getIndex(Model model){

    return "index";
  }
}
