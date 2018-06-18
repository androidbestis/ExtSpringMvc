package com.extspringmvc.controller;

import com.extspringmvc.extannotation.ExtController;
import com.extspringmvc.extannotation.ExtRequestMapping;

@ExtController
@ExtRequestMapping("/ext")
public class IndexController {

	@ExtRequestMapping("/index")
	public String index() {
		System.out.println("first springmvc Ext");
		return "index";
	}
	
}
