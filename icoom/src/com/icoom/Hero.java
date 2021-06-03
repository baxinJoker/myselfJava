package com.icoom;

public class Hero {
	public int age;
	public String name;

	public Hero(String name) {
		this.name = name;
	}

	public void attack() {
		System.out.println("Hero�������ˣ�");
	}

	public Hero() {
		System.out.println("���Ӣ�����ڳ�ʼ��");
	}

	public void finalize() {
		System.out.println("���Ӣ�����ڻ���");
	}

	public static void intToString() {
		// String��ǿ��ת��
		int i = 4;
		String j = String.valueOf(i);
		System.out.println(j);
		// �Զ�װ��
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
		System.out.println("AdHero��������");
	};
}