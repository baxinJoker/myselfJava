package com.icoom;

public class Ostrich extends Bird{
    public void fly(){
        System.out.println("���...");
    }
    public static void main(String[] args){
        Ostrich o = new Ostrich();
        o.fly();
    }
}