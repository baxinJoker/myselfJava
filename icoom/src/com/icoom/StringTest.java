package com.icoom;

public class StringTest {
	public static void main(String[] args) {
		float floatVar = 1.11f;
		int intVar = 29;
		String stringVar = "helloword";
		System.out.printf("�����ͱ�����ֵΪ " +
                "%f, ���ͱ�����ֵΪ " +
                " %d, �ַ���������ֵΪ " +
                "is %s", floatVar, intVar, stringVar);
		String fs;
		fs = String.format("�����ͱ�����ֵΪ " +
                "%f, ���ͱ�����ֵΪ " +
                " %d, �ַ���������ֵΪ " +
                " %s", floatVar, intVar, stringVar);
		System.out.println(fs);
	}
}
