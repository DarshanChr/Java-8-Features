package org.java8.feature;

@FunctionalInterface
public interface FunctionTest1 {

String getName();
	
	default String getPlace(){
		System.out.println("::::::");
		return "sachin";
	}
}
