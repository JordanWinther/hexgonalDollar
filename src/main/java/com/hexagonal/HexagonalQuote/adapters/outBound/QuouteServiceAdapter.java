package com.hexagonal.HexagonalQuote.adapters.outBound;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.hexagonal.HexagonalQuote.adapters.inBound.Entity.QuoteEntity;
import com.hexagonal.HexagonalQuote.adapters.outBound.repository.QuoteRepository;
import com.hexagonal.HexagonalQuote.aplication.core.domain.Quote;
import com.hexagonal.HexagonalQuote.aplication.ports.out.QuoteServicePortOut;

import jakarta.transaction.Transactional;

@Service
public class QuouteServiceAdapter implements QuoteServicePortOut {

	private final QuoteRepository quoteRepository;
	
	public QuouteServiceAdapter(QuoteRepository repository) {
		this.quoteRepository = repository;
	}
	
	
	@Override
	@Transactional
	public QuoteEntity salvarQuote(Quote quote) {
		 var entity = new QuoteEntity();
		 BeanUtils.copyProperties(quote, entity);
		return quoteRepository.save(entity);
	}


	

}
