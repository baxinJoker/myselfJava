package com.file;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LambdaTest {
	public static void filter(List<Hero> heros,HeroChecker checker) {
		for (Hero hero : heros) {
            if(checker.test(hero))
                System.out.print(hero);
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		List<Hero> l = new ArrayList<Hero>();
		for(int i=0;i<10;i++) {
			l.add(new Hero("гЂал" + i, r.nextInt(100), r.nextInt(100)));
		}
		
		System.out.println(l);
		filter(l,h->h.hp>100 && h.damage<50);
	}

}
