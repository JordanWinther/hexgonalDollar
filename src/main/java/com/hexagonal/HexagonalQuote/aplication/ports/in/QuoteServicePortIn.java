package com.hexagonal.HexagonalQuote.aplication.ports.in;

import com.hexagonal.HexagonalQuote.adapters.inBound.Entity.QuoteEntity;
import com.hexagonal.HexagonalQuote.aplication.core.domain.Quote;

public interface QuoteServicePortIn {

	QuoteEntity salvarQuote(Quote quote);
}
