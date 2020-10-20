package com.dlm.fmp.bam_basemanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dlm.fmp.bam_basemanagement.vo.ResponseEntity;
import com.dlm.fmp.constant.CommonConstant;



//告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class BasicController {

//	@RequestMapping("/")
//	public ModelAndView welcome1(){
//		ModelAndView mav = new ModelAndView("redirect:navigatebar");
//		return mav;
//	}
	
	@RequestMapping("/")
	public ModelAndView  indexCore(){
	    ModelAndView mv = new ModelAndView("/index");
	    return mv;  
	}
	
	@RequestMapping("")
	public ModelAndView welcome2(){
		ModelAndView mav = new ModelAndView("navigatebar");
		return mav;
	}
}
