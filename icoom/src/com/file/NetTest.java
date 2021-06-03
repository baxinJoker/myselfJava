package com.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;

public class NetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress host;
		try {
			host = InetAddress.getLocalHost();
			String ip = host.getHostAddress();
			System.out.println("本机ip为：" + ip);
			Process process = Runtime.getRuntime().exec("ping " + ip);
			BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = null;
			StringBuilder s = new StringBuilder();
			while ((line = br.readLine()) != null) {
				s.append(line + "\r\n");
			}
			System.out.println("本次指令返回的消息是：");
			System.out.println(s.toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
