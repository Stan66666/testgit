package SeverDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerDemo {

	public static void main(String[] args) {
		
		System.out.println("sever");
		BufferedReader in = null;
		ServerSocket ss = null;
		PrintWriter out = null;
		try {
			ss = new ServerSocket(8888);
			Socket s = ss.accept();//服务器与客户端建立链接
			System.out.println("有客户端链接  IP地址" + s.getInetAddress().getHostAddress());
			System.out.println("有客户端链接  端口号" + s.getPort());
			

			//s.getInputStream():获得socket输入流
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str = in.readLine();
			System.out.println("客户端发送的信息：" + str);
			
			//服务器接收到数据后，再向客户端发送消息
			System.out.println("服务器输入数据，向客户端发送");
			Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			//s.getOutputStream():获得socket的输出流
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			out.write(str1);
			out.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ss != null) {
				try {
					ss.accept();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
