package com.hexagonal.HexagonalQuote.aplication.ports.out;

import com.hexagonal.HexagonalQuote.adapters.inBound.Entity.QuoteEntity;
import com.hexagonal.HexagonalQuote.aplication.core.domain.Quote;

public interface QuoteServicePortOut {

	QuoteEntity salvarQuote(Quote quote);
}
