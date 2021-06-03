package com.file;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * 二叉树
 * @author baxin
 *
 */

public class Node {
	public Node leftNode;
	
	public Node rightNode;
	
	public Object value;
	
	public void add(Object number) {
		if(null == this.value) {//如果当前node值为空
			this.value = number;
		}else {
			if((Integer)this.value >= (Integer)number) {
				if(null == this.leftNode)
					this.leftNode = new Node();
				this.leftNode.add(number);
			}else {
				if(null ==this.rightNode)
					this.rightNode = new Node();
				this.rightNode.add(number);
			}
		}
	}
	public List<Object> values(){
		List<Object> values = new ArrayList<>();
		if(null != this.leftNode)
			values.addAll(this.leftNode.values());
		values.add(this.value);
		if(null != this.rightNode)
			values.addAll(this.rightNode.values());
		return values;
	}
	public static void main(String[] arg) {
		int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74 };
		  
        Node roots = new Node();
        for (int number : randoms) {
            roots.add(number);
        }
        List values = roots.values();
        System.out.println(values);
        Iterator lt= values.iterator();
        while(lt.hasNext()) {
        	int	item = (int)lt.next();
        	System.out.println(item);
        }
	}
}
