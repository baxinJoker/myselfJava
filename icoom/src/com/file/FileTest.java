package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file1 = new File("C:/Users/baxin/Desktop/¼ò½é.txt");		
			System.out.println("fileµÄ¾ø¶ÔÂ·¾¶£º" + file1.getAbsolutePath());
			FileInputStream fileOperate1 = new FileInputStream(file1);
			byte[] bs = new byte[(int)file1.length()];
			fileOperate1.read(bs);
			for(byte b:bs) {
				System.out.println(b);
			}
			fileOperate1.close();
			File file2 = new File("C:/Users/baxin/Desktop/io.txt");
			FileOutputStream fileOperate2 = new FileOutputStream(file2);
			byte[] os = {66,98};
			fileOperate2.write(os);
			fileOperate2.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
