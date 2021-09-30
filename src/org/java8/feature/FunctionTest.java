package org.java8.feature;

@FunctionalInterface
public interface FunctionTest extends FunctionTest1 {
	
	String getName();
	
	default String getPlace(){
		return "sachin";
	}
	
	@Override
	int hashCode();
}
