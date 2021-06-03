package com.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:/Users/baxin/Desktop/���.txt");
        try (FileInputStream fis = new FileInputStream(f);) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
   
            //�ļ��ж�������������
            System.out.println("�ļ��ж������������ǣ�");
            for (byte b : all)
            {
                int i = b&0x000000ff;  //ֻȡ16���Ƶĺ���λ
                System.out.println(Integer.toHexString(i));
            }
            String str = new String(all,"UTF-8");
            System.out.println(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
