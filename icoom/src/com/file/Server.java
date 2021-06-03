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
			System.out.println("监听在8888端口号：8888");
			Socket socket = serverSocket.accept();
			
			//打开输入流
            InputStream is = socket.getInputStream();
            DataInputStream doStream = new DataInputStream(is);
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            // 发送数字110到服务端
            dos.writeUTF(string);
            System.out.println("服务端发送到消息：" + string);
            dos.close();
            //读取客户端发送的数据
            String msg = doStream.readUTF();
            //打印出来
            System.out.println("服务端接受到消息：" + msg);
            is.close();
            
            socket.close();
            serverSocket.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
