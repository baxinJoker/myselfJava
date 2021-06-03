package com.imooc.arraytest;

import java.util.*;
import java.lang.*;

public class EqualTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		int b = 12;
		int c = 1000;
		int c1 = 1000;
		Integer a1 = new Integer(1000);
		Integer b2 = new Integer(1000);
		System.out.println(a==b);
		System.out.println(a1==a);
		System.out.println(b2==a1);
		System.out.println(c==c1);
		System.out.println(a1.equals(b2));
	}

}
