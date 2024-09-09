package com.hexagonal.HexagonalQuote.adapters.inBound.request;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.hexagonal.HexagonalQuote.aplication.core.domain.Quote;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class QuoteDto {

		
		private String simbol;
		private BigDecimal openPrice;
		private BigDecimal closePrice;
		
		public Quote dtoToQuote(){
			var quote = new Quote(simbol, openPrice, closePrice);
			return quote;
		
	
		}
		
	
}
