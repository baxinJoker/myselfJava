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
            //连接到本机的8888端口
            Socket s = new Socket("127.0.0.1",8888);
            // 打开输出流
            OutputStream os = s.getOutputStream();
            InputStream is = s.getInputStream(); 
            DataOutputStream dos = new DataOutputStream(os);
            DataInputStream ios = new DataInputStream(is);
            Scanner scanner = new Scanner(System.in);
            String string = scanner.next();
            // 发送数字110到服务端
            dos.writeUTF(string);
            System.out.println("客户端发送到消息：" + string);
            dos.close();
            String str = ios.readUTF();
            System.out.println("客户端接受到消息：" + str);
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