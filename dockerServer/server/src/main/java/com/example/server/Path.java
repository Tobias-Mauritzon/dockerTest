package com.example.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Path {

	@RequestMapping("/")
	public String index() {
		return "<h1>Hello</h1>";//method11(); 
	}

    @RequestMapping("/*")
	public String all() {
		return "Everything";//method11(); 
	}

    @RequestMapping("/tob")
	public String tob() {
		return "Tobias";//method11(); 
	}

	@RequestMapping("/getData")
	public String api() {
		return getData();
	}

    public String getData(){

		return "Data";
	}

}
