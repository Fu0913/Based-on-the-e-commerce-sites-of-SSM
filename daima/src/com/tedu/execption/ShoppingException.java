package com.tedu.execption;

import java.io.PrintStream;
import java.io.PrintWriter;

//自定义异常处理类
public class ShoppingException extends RuntimeException{

	public ShoppingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public ShoppingException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public ShoppingException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ShoppingException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
	

}
