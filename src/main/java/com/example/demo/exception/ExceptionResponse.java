package com.example.demo.exception;

import java.util.Date;

public class ExceptionResponse {

	private String message;
	private Date date;
	private String errorCode;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	@Override
	public String toString() {
		return "ExceptionResponse [message=" + message + ", date=" + date + ", errorCode=" + errorCode + "]";
	}
	public ExceptionResponse(String message, Date date, String errorCode) {
		super();
		this.message = message;
		this.date = date;
		this.errorCode = errorCode;
	}
	
}
