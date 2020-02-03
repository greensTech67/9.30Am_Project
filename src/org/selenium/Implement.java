package org.selenium;

public class Implement implements I2 {
	
	private void clsMethod() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Method1() {
		System.out.println("Kumar");
		
	}

	@Override
	public void Method2() {
		System.out.println("Mohamed");
		
	}

	public static void main(String[] args) {
		
		I2 im=new Implement();
		
		im.clsMethod();
		
		im.Method1();
		im.Method2();
	}
}
