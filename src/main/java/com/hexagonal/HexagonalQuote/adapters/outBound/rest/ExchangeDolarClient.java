package com.hexagonal.HexagonalQuote.adapters.outBound.rest;

import java.util.HashMap;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.hexagonal.HexagonalQuote.aplication.core.domain.Cotation;

@FeignClient(name = "SearchCotation", url = "http://www.floatrates.com")
public interface ExchangeDolarClient {

	@GetMapping("/daily/usd.json")
	public  HashMap<String, Cotation>  searchCotation();
	
}