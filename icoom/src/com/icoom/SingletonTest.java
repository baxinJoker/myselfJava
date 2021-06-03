package com.icoom;
public class SingletonTest{
    public static void main(String[] args){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1==s2);
        Singleton1Hungry s3 = Singleton1Hungry.getInstance();
        Singleton1Hungry s4 = Singleton1Hungry.getInstance();
        System.out.println(s3==s4);
    }
}
//懒汉单例模式
class Singleton{
    private static Singleton instance;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
//饿汉单例模式
class Singleton1Hungry{
	private static Singleton1Hungry instance = new Singleton1Hungry();
	private Singleton1Hungry(){};
	public static Singleton1Hungry getInstance() {
		return Singleton1Hungry.instance;
	}
}