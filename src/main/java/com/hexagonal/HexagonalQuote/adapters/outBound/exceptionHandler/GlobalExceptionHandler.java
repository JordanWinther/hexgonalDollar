package com.hexagonal.HexagonalQuote.adapters.outBound.exceptionHandler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import feign.FeignException;
import feign.FeignException.FeignClientException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({FeignException.class, FeignClientException.class})
	public @ResponseBody ResponseEntity<?> handleFeignException(final FeignException exception){
		log.info(exception.getMessage());
		return  ResponseEntity
				.status(exception.status())
				.body(new ErrorMessageException("Erro na conexção com a Api.", exception.getCause()));
	}
}
