package com.javalec.base;

public class APhone implements SmartPhone {

	@Override
	public void cellSenderReciver() {
		// TODO Auto-generated method stub
		System.out.println("A phone : Possible");
	}

	@Override
	public void tellMethod() {
		// TODO Auto-generated method stub
		System.out.println("A phone : 3G");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("A phone : Not Applied");
	}

}
