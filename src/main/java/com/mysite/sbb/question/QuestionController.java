package com.mysite.sbb.question;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;

@RequiredArgsConstructor	// questionRepository 객체 주입 -> final이 붙은 속성을 포함하는 생성자를 자동으로 만들어주는 역할
@Controller
public class QuestionController {
	private final QuestionService questionService;	// repository -> service
	@GetMapping("/question/list")
	public String list(Model model) {	// 따로 객체 생성 필요 없이 컨트롤러의 메서드에 매개변수로 지정하기만 하면 스프링 부트가 자동으로 Model 객체를 생성
		List<Question> questionList = questionService.getList();	// service 사용
		model.addAttribute("questionList", questionList);	// Model 객체는 자바 클래스와 템플릿 간의 연결 고리 역할. Model 객체에 값을 담아 두면 템플릿에서 그 값을 사용 가능
		return "question_list";
	}
}
