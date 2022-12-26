package com.lec.basic.poly2;

import com.lec.basic.poly1.TV;
import com.lec.basic.poly2.SonySpeaker;

public class SamsungTV implements TV{
	
	// 생성자인젝션이용하기
	// XML설정파일에 등록된 클래스로 객체를 생성할 때는 기본생성자를 호출한다.
	// 하지만 컨테이너가 매개변수를 가지는 생성자를 호출할 수 있도록 설정할
	// 수 있다. 생성자인젝션을 이용하면 생성자의 매개변수로 의존관계에 있는
	// 객체를 주입할 수 있다.
	
	private SonySpeaker speaker;
	public SamsungTV(SonySpeaker speaker) { System.out.println(
			"==> SamsungTV() 생성자호출!!");
			this.speaker = speaker;
	}
	public void powerOn() { System.out.println("Samsung TV - pwerOn!!");}
	public void powerOff() { System.out.println("Samsung TV - pwerOff!!");}
	public void volumnUp() {speaker.volumnUp();}
	public void volumnDown() {speaker.volumnDown();}
}
