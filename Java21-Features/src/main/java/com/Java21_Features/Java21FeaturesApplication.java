package com.Java21_Features;

public class Java21FeaturesApplication {

	public static void main(String[] args) {
		//============================ Pattern Matching ====================================
		Object obj =  "Hello World";

		switch (obj){
			case String s -> System.out.println("C'est une chaine de caracterers : "+s);
			case Integer i -> System.out.println("C'est un entier : "+i);

            default -> throw new IllegalStateException("Unexpected value: " + obj);
        }
	}

}
