package com.hexagonal.HexagonalQuote.adapters.inBound.Entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "COTACAO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class QuoteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String simbol;
	private BigDecimal openPrice;
	private BigDecimal closePrice;
	private LocalDate date;
	
	
	
	private void setDate(LocalDate date) {
		this.date = LocalDate.now();

	}
	
	
}
