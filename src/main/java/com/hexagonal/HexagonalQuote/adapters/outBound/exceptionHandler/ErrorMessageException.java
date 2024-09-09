package com.hexagonal.HexagonalQuote.adapters.outBound.exceptionHandler;

public class ErrorMessageException  extends RuntimeException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ErrorMessageException() {
		super();
	}
	
	public ErrorMessageException(String mesage) {
		super(mesage);
	}
	
	public ErrorMessageException(String mesage, Throwable cause) {
		super(mesage, cause);
	}

	public ErrorMessageException(Throwable cause) {
		// TODO Auto-generated constructor stub
	}
}
