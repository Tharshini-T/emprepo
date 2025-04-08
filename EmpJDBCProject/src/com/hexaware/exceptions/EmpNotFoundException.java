package com.hexaware.exceptions;

public class EmpNotFoundException extends Exception{
	
	public EmpNotFoundException()
	{
		super();
	}
	
	public EmpNotFoundException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String toString()
	{
		return "EMployee Not Found...";
	}

}
