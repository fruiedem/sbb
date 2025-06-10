package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;

@SpringBootTest
class SbbApplicationTests {

	@Autowired
	private AnswerRepository answerRepository;

	@Test
	void contextLoads() {
		List<Answer> all = this.answerRepository.findAll();
		assertEquals(3, all.size());
	}

}
