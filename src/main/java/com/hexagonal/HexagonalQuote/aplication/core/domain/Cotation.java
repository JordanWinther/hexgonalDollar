package com.hexagonal.HexagonalQuote.aplication.core.domain;



public class Cotation {
	private String code;
    private String alphaCode;
    private String numericCode;
    private String name;
    private Double rate;
    private String date;
    private Double inverseRate;
    
    
    public Cotation() {
    	
    }
    
	public Cotation(String code, String alphaCode, String numericCode, String name, Double rate, String date,
			Double inverseRate) {
		super();
		this.code = code;
		this.alphaCode = alphaCode;
		this.numericCode = numericCode;
		this.name = name;
		this.rate = rate;
		this.date = date;
		this.inverseRate = inverseRate;
	}
	
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getAlphaCode() {
		return alphaCode;
	}
	public void setAlphaCode(String alphaCode) {
		this.alphaCode = alphaCode;
	}
	public String getNumericCode() {
		return numericCode;
	}
	public void setNumericCode(String numericCode) {
		this.numericCode = numericCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Double getInverseRate() {
		return inverseRate;
	}
	public void setInverseRate(Double inverseRate) {
		this.inverseRate = inverseRate;
	}
    
    
    
    
}
