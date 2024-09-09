package com.hexagonal.HexagonalQuote.aplication.core.service;

import com.hexagonal.HexagonalQuote.aplication.core.domain.Cotation;
import com.hexagonal.HexagonalQuote.aplication.ports.in.SearchCotationPortIn;
import com.hexagonal.HexagonalQuote.aplication.ports.out.SearchCotationPortOut;

public class SearchCotationService implements SearchCotationPortIn {

	private final SearchCotationPortOut cotationPortOut;
	
	public SearchCotationService(SearchCotationPortOut portOut) {
		this.cotationPortOut = portOut;
	}
	
	@Override
	public Cotation search() {
		
		return cotationPortOut.searchCotation();
		
	}

	
	
}
