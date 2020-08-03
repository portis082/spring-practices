package com.bit2020.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 
 * @RequestMapping
 * 메소드 단독매핑
 *
 */
@Controller
public class BoardController {
	@ResponseBody
	@RequestMapping("/board/write")
	public String write() {
		
		return "BoardController:write";
	}
	
	@ResponseBody
	@RequestMapping("/board/view")
	public String view(Long no) {
		return "BoardController:view";
	}
}
