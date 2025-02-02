package com.lec.ex01_object.ex01_equals;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member1 = new Member("hong");
		Member member2 = new Member("hong");
		Member member3 = new Member("kim");
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
		System.out.println();
		
		System.out.println(member1.equals(member2)); // true를 기대하지만 false가 리턴
		System.out.println(member1.equals(member3)); // false
		System.out.println();
		
		if(member1.equals(member2)) {
			System.out.println("동일 객체입니다!");
		} else {
			System.out.println("다른 객체입니다!");
		}
		
		if(member1.equals(member3)) {
			System.out.println("동일 객체입니다!");
		} else {
			System.out.println("다른 객체입니다!");
		}
}

}
