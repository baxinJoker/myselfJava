package com.file;

public class Hero {
	private String name;
	public int hp;
	public int damage;
	public Hero() {}
	public Hero(String name) {
		this.name = name;
	}
	public Hero(String name,int hp,int damage) {
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
}
