package com.robot.v3_abstract;

public class RobotMain {

	public static void main(String[] args) {

		System.out.println("=== Robot V3.0 (추상화) ===");
		System.out.println();
		
		CheapRobot cheapRobot = new CheapRobot("CheapRobot", 5);
		cheapRobot.shape();
		cheapRobot.actionWalk();
		cheapRobot.actionRun();
		cheapRobot.actionFly();
		cheapRobot.actionMissile();
		cheapRobot.actionSword();
		System.out.println(cheapRobot.name + "의 재고수량은 = " + cheapRobot.qty);
		System.out.println();
		
		StandardRobot standardRobot = new StandardRobot("StandardRobot", 10);
		standardRobot.shape();
		standardRobot.actionWalk();
		standardRobot.actionRun();
		standardRobot.actionFly();
		standardRobot.actionMissile();
		standardRobot.actionSword();
		System.out.println(standardRobot.name + "의 재고수량은 = " + standardRobot.qty);
		System.out.println();
		
		SuperRobot superRobot = new SuperRobot("SuperRobot", 5);
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.actionFly();
		superRobot.actionMissile();
		superRobot.actionSword();
		System.out.println(superRobot.name + "의 재고수량은 = " + superRobot.qty);
		System.out.println();
				

	}

}
