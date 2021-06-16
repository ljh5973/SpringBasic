package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.JoinVO;
import com.simple.command.QuizVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	@RequestMapping("/quiz01")
	public String quiz01() {
		return "quiz/quiz01";
	}
	
//	@RequestMapping("/sendBirth")
//	public String quiz01(@ModelAttribute("birth") QuizVO vo) {
//		
//		System.out.println(vo.toString());
//		
//		return "quiz/quiz01_ok";
//	}
//	
//	@RequestMapping("/sendBirth")
//	public ModelAndView quiz01(@ModelAttribute("birth") QuizVO vo) {
//		
//		ModelAndView mv= new ModelAndView();
//		
//		mv.addObject("date", new Date());
//		
//		
//		mv.setViewName("quiz/quiz01_ok");
//		
//		return mv;
//	}
	
	@RequestMapping("/sendBirth")
	public String sendBirth(QuizVO vo, Model model) {
		model.addAttribute("year" , vo.getYear());
		model.addAttribute("month", vo.getMonth());
		model.addAttribute("day", vo.getDay());
		return "quiz/quiz01_ok";
	}
	
	@RequestMapping("/quiz02")
	public String quiz02() {
		return "quiz/quiz02";
	}
	
	@RequestMapping("/join")
	public String quiz02(@ModelAttribute("signup") QuizVO vo) {
		
		return "quiz/quiz02_ok";
	}
	
	@RequestMapping("/quiz03")
	public String quiz03() {
		return "quiz/quiz03";
	}
	
	@RequestMapping("/join2")
	public String quiz03(@ModelAttribute("check") JoinVO vo,
			RedirectAttributes RA) {
		
		if(vo.getId().equals("")) {
			RA.addFlashAttribute("idck", "아이디를 확인하세요.");
		}else {
			if(vo.getPw().equals(vo.getPw_check())) {
				return "quiz/quiz03_ok";
			}else {
				RA.addFlashAttribute("pwcheck", "비밀번호를 확인하세요.");
				
			}
			
		}
		return "redirect:/quiz/quiz03";
	}

}
