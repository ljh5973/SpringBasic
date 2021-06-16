package com.simple.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVO;

@Controller
@RequestMapping("request")	//클래스의 requestMapping은 메서드의 요청경로를 묶어서 사용합니다.		
public class RequestController {

//	@RequestMapping("req_ex01")
//	public String req_ex01() {
//		System.out.println("실행됨");
//		return "request/req_ex01";
//	}
	
	
	// void형 메서드는 들어오는 경로자체가 뷰 리졸버로 돌아가게 됩니다.
//	@RequestMapping("/req_ex01")
//	public void req_ex01() {
//		
//	}
	
//	//basic01에 대한 요청
//	@RequestMapping(value = "/basic01", method= RequestMethod.GET)
//	public void basic01() {
//		
//		System.out.println("basic01실행");
//		
//	}
//	@RequestMapping(value="/basic02", method= RequestMethod.POST)
//	public void basic02() {
//		System.out.println("basic02실행");
//		
//	}
//	@RequestMapping(value="/basic03")
//	public void basic03() {
//		System.out.println("basic03실행");
//	}
	
	//basic01, 02, 03을 하나의 메서드로 받아서 처리.
	@RequestMapping({"/basic01", "/basic02","/basic03"})
	public void basic() {
		System.out.println("basic1,2,3");
	}
	
	//=========================요청파라미터값 받기==============================
	
	//req_ex02의 화면처리
	@RequestMapping("/req_ex02")
	public String req_ex02() {
		
		return "request/req_ex02";
		
	}
	
	//param 요청처리
	//1st- request객체 이용하기
	
	
//	@RequestMapping("/param")
//	public String param(HttpServletRequest request) {
//		
//		
//		System.out.println(request.getParameter("id"));
//		
//		System.out.println(request.getParameter("inter"));
//		return "request/req_ex02_result";
//	}
//	@RequestMapping("/param")
//	public String param(@RequestParam("id") String id,
//						@RequestParam("pw") String pw,
//						@RequestParam("name") String name,
//						@RequestParam(value="inter", required = false, defaultValue="")ArrayList<String> inter
//			) {
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(name);
//		System.out.println(inter.toString());
//		return "request/req_ex02_result";
//	}
	@RequestMapping("/param")
	public String param(ReqVO vo) {
		
		
		System.out.println(vo.toString());
		return "request/req_ex02_result";
	}
	@RequestMapping("/req_quiz01")
	public String req_quiz01() {
		return "request/req_quiz01";
	}
	
	@RequestMapping("/login")
	public String login(ReqVO vo) {
		
		if(vo.getId().equals("abc123") && vo.getPw().equals("xxx123")) {
		
			
				return "request/req_quiz01_ok";
			
		}		return "request/req_quiz01_no";
		
	}
}
