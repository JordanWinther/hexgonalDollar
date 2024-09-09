package com.hexagonal.HexagonalQuote.adapters.outBound;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.hexagonal.HexagonalQuote.adapters.outBound.rest.ExchangeDolarClient;
import com.hexagonal.HexagonalQuote.aplication.core.domain.Cotation;
import com.hexagonal.HexagonalQuote.aplication.ports.out.SearchCotationPortOut;

@Component
public class SearchCotationAdapter implements SearchCotationPortOut{
	
	private final ExchangeDolarClient dolarClient;
	
	
	public SearchCotationAdapter( ExchangeDolarClient client) {
		this.dolarClient = client;
	}
	
	@Override
	public Cotation searchCotation() {
		var map = dolarClient.searchCotation();
		
		Cotation cotationOfMap = new Cotation();
		
		for ( Cotation cotation : map.values()) {
			
			if(cotation.getCode().equals("BRL")) {
				cotationOfMap = cotation;
				break;
			}
			
		}
		
		
		return cotationOfMap;
	}

}
