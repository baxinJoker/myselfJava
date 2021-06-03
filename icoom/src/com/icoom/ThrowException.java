package com.icoom;

import java.io.*;

public class ThrowException {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str;
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'end' to quit.");
		do {
			str = reader.readLine();
			System.out.println(str + "123");
		} while (!str.equals("end"));
	}
}
