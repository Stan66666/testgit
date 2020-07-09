package SeverDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) {
		
		System.out.println("client");
		Socket s = null;
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			//建立链接
			s = new Socket("127.0.0.1",8888);
			System.out.println("与服务器链接" + s.getInetAddress().getHostAddress());
			System.out.println("有客户端链接  端口号" + s.getPort());
			

			System.out.println("客户端输入数据，向服务器端发送");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			//s.getOutputStream():获得socket的输出流
			out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			out.write(str);
			out.flush();
			//====================================================
			//s.getInputStream():获得socket输入流
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String serverStr = in.readLine();
			System.out.println("服务器端发送的信息：" + serverStr);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(out != null) {
				out.close();
			}
			if(s != null) {
				try {
					s.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
