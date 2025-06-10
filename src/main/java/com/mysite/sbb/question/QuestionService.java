package com.mysite.sbb.question;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor	
@Service
public class QuestionService {
	public final QuestionRepository questionRepository; // 여기서 questionRepository 객체는 @RequiredArgsConstructor에 의해 생성자 방식으로 주입된다.
	public List<Question> getList(){
		return this.questionRepository.findAll();
	}

}
