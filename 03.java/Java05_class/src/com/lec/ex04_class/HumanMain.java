package com.lec.ex04_class;

public class HumanMain {

	public static void main(String[] args) {
		
		// 메서드오버라이딩(2)
		Adam adam = new Adam();
		Eve eve = new Eve();
		
		System.out.println(adam.name + ", ");
		System.out.println(adam.gender + ", ");
		System.out.println(adam.age);
		adam.speak();
		String msg = adam.move();
		System.out.println(msg);
		System.out.println(adam.toString());
		System.out.println();
		
		eve.speak();
		msg = eve.move();
		System.out.println(msg);
		System.out.println(eve.toString());
		System.out.println();

	}

}
