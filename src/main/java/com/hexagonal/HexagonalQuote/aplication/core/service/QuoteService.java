package com.hexagonal.HexagonalQuote.aplication.core.service;

import com.hexagonal.HexagonalQuote.adapters.inBound.Entity.QuoteEntity;
import com.hexagonal.HexagonalQuote.aplication.core.domain.Quote;
import com.hexagonal.HexagonalQuote.aplication.ports.in.QuoteServicePortIn;
import com.hexagonal.HexagonalQuote.aplication.ports.out.QuoteServicePortOut;
import com.hexagonal.HexagonalQuote.aplication.ports.out.SearchCotationPortOut;


public class QuoteService implements QuoteServicePortIn {

	private QuoteServicePortOut quoteServicePortOut;
	private SearchCotationPortOut cotationPortOut;
	
	
	public QuoteService(QuoteServicePortOut port, SearchCotationPortOut cotation) {
		this.quoteServicePortOut = port;
		this.cotationPortOut = cotation;
	}
	
	@Override
	public QuoteEntity salvarQuote(Quote quote) {
		var restul = cotationPortOut.searchCotation();
		return quoteServicePortOut.salvarQuote(quote);
		
		
	}

}
