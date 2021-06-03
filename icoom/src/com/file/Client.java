package com.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
   
public class Client {
   
    public static void main(String[] args)  {
           
        try {
            //���ӵ�������8888�˿�
            Socket s = new Socket("127.0.0.1",8888);
            // �������
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream(); 
            DataOutputStream dos = new DataOutputStream(os);
            DataInputStream ios = new DataInputStream(is);
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            // ��������110�������
            dos.writeUTF(string);
            System.out.println("�ͻ��˷��͵���Ϣ��" + string);
            dos.close();
            String str = ios.readUTF();
            System.out.println("�ͻ��˽��ܵ���Ϣ��" + str);
            ios.close();
            s.close();
        } catch (UnknownHostException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}