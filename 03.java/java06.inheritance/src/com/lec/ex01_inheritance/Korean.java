package com.lec.ex01_inheritance;

public class Korean extends Adam{

	@Override
	public String toString() {
		return "나는 한국사람입니다! 나의 이름은 = " + this.name + "입니다!";
	}

	@Override
	public void move() {
		System.out.println("프로그램을 개발합니다!");
	}
	
	@Override
	public void speak() {
		System.out.println("한국어로 말을 합니다!");
	}
}
