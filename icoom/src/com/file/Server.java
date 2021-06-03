package com.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("������8888�˿ںţ�8888");
			Socket socket = serverSocket.accept();
			
			//��������
            InputStream is = socket.getInputStream();
            DataInputStream doStream = new DataInputStream(is);
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            // ��������110�������
            dos.writeUTF(string);
            System.out.println("����˷��͵���Ϣ��" + string);
            dos.close();
            //��ȡ�ͻ��˷��͵�����
            String msg = doStream.readUTF();
            //��ӡ����
            System.out.println("����˽��ܵ���Ϣ��" + msg);
            is.close();
            
            socket.close();
            serverSocket.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
