package com.icoom;

public class Hero {
	public int age;
	public String name;

	public Hero(String name) {
		this.name = name;
	}

	public void attack() {
		System.out.println("Hero被攻击了！");
	}

	public Hero() {
		System.out.println("这个英雄正在初始化");
	}

	public void finalize() {
		System.out.println("这个英雄正在回收");
	}

	public static void intToString() {
		// String类强制转换
		int i = 4;
		String j = String.valueOf(i);
		System.out.println(j);
		// 自动装箱
		Integer it = i;
		String k = it.toString();
		System.out.println(k);
	};

	public static void main(String[] arg) {
		Hero.intToString();
		Hero hero = new ADHero();
		hero.attack();
		double d1 = 1.02;
		double d2 = 4.444;
		System.out.println(Math.round(d1));
		System.out.println(Math.round(d2));
	}
}

class ADHero extends Hero {
	public void attack() {
		System.out.println("AdHero被攻击了");
	};
}