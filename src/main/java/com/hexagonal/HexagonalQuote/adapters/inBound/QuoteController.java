package com.hexagonal.HexagonalQuote.adapters.inBound;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexagonal.HexagonalQuote.adapters.inBound.Entity.QuoteEntity;
import com.hexagonal.HexagonalQuote.adapters.inBound.request.QuoteDto;
import com.hexagonal.HexagonalQuote.aplication.core.domain.Cotation;
import com.hexagonal.HexagonalQuote.aplication.ports.in.QuoteServicePortIn;
import com.hexagonal.HexagonalQuote.aplication.ports.in.SearchCotationPortIn;

@RestController
@RequestMapping("/quote")
public class QuoteController {

	private QuoteServicePortIn quoteServicePort;//Controller -> InterfacePortIn - QuoteService
	private SearchCotationPortIn cotationPortIn;
	
	public QuoteController(QuoteServicePortIn quotePort, SearchCotationPortIn cotationPortIn) {
		this.quoteServicePort = quotePort;
		this.cotationPortIn = cotationPortIn;
	}
	
	@PostMapping
	public QuoteEntity salvarQuote(@RequestBody QuoteDto dto) {
		var quote = dto.dtoToQuote();
		var quoteResponse = quoteServicePort.salvarQuote(quote);
		return quoteResponse;
		
	}
	
	@GetMapping
	public Cotation CotationDolar() {
		
		return cotationPortIn.search();
		
		
		
	}
}
