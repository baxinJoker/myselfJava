package com.icoom;

public class StringTest {
	public static void main(String[] args) {
		float floatVar = 1.11f;
		int intVar = 29;
		String stringVar = "helloword";
		System.out.printf("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                "is %s", floatVar, intVar, stringVar);
		String fs;
		fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", floatVar, intVar, stringVar);
		System.out.println(fs);
	}
}
