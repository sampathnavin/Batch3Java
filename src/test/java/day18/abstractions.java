package day18;

public abstract class abstractions {
	
	// Abstraction - Set of rules your applications needs to be followed 
	
	//  Why abstraction ??
	
	//  Java will not support multiple inheritance 
	
	// To support multiple inheritance the initial try was abstraction 
	// Where 100 % abstarction is not achieved hence new concept came into picture
	// interface 
	
	// it will allow non abtract methods 
	
	// we cant create object for abstarct class 
	// we can get the methods by creating new class and extending it 
	
	
	// ur abstarct class should have atleast one abstarct methods
	
	
	//  absatrcation - we will have only method name will not have implementaion part 
	//  to achieve this abstarction abstarct keyword is needed
	
	public abstract void sum();
	
	public void sub() {
		System.out.println("*******");
	}
	
	

}
