package com.hexagonal.HexagonalQuote;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hexagonal.HexagonalQuote.adapters.outBound.QuouteServiceAdapter;
import com.hexagonal.HexagonalQuote.adapters.outBound.SearchCotationAdapter;
import com.hexagonal.HexagonalQuote.aplication.core.service.QuoteService;
import com.hexagonal.HexagonalQuote.aplication.core.service.SearchCotationService;
import com.hexagonal.HexagonalQuote.aplication.ports.out.SearchCotationPortOut;

@Configuration
public class ConfigBeanQuote {

	@Bean
	public QuoteService quoteService(QuouteServiceAdapter quouteServiceAdapter, SearchCotationAdapter cotationAdapter) {
		return new QuoteService(quouteServiceAdapter, cotationAdapter);
		
		
	}
	
	@Bean
	public SearchCotationService searchCotationService( SearchCotationPortOut cotationPortOut) {
		return new SearchCotationService(cotationPortOut);
		
		
	}
	
	
}
