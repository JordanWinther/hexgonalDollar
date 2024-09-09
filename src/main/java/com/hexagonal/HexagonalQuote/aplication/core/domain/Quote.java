package com.hexagonal.HexagonalQuote.aplication.core.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



public class Quote {

	
	private String simbol;
	private BigDecimal openPrice;
	private BigDecimal closePrice;
	private LocalDate date;
	
	public Quote( String simbol, BigDecimal openPrice, BigDecimal closePrice) {
		super();
		
		this.simbol = simbol;
		this.openPrice = openPrice;
		this.closePrice = closePrice;
		this.date = LocalDate.now();
	}

	
	public void setDate(LocalDate date) {
		this.date = LocalDate.now();

	}


	public String getSimbol() {
		return simbol;
	}



	public void setSimbol(String simbol) {
		this.simbol = simbol;
	}



	public BigDecimal getOpenPrice() {
		return openPrice;
	}



	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}



	public BigDecimal getClosePrice() {
		return closePrice;
	}



	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}



	public LocalDate getDate() {
		return date;
	}
	
	
	
	
}
