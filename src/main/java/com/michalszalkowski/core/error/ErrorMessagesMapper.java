package com.michalszalkowski.core.error;

import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;
import java.util.stream.Collectors;

public class ErrorMessagesMapper {

	public static List<String> map(MethodArgumentNotValidException ex) {
		return ex.getBindingResult()
				.getFieldErrors()
				.stream()
				.map(x -> x.getDefaultMessage())
				.collect(Collectors.toList());
	}

}

