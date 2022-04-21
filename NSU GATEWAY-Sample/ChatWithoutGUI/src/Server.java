
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.security.MessageDigest;


public class Server {
	ServerSocket server;
	Socket socket;
	BufferedReader reader;
	PrintWriter writer;
	
	public Server() {
		try {
			server=new ServerSocket(8000);
			System.out.println("Server Ready");
			System.out.println("Waiting....");
			socket=server.accept();
			
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer=new PrintWriter(socket.getOutputStream());
			startReadeing();
			startWriting();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	public void startReadeing() {
		
		Runnable r1=()->{
			System.out.println("Reader Started");
			try {
			while(true) {
				
					String message=reader.readLine();
					if(message.equals("exit")) {
						System.out.println("Client Left");
						socket.close();
						break;
					}
					System.out.println("Client: +"+message);
				} 
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		};
		new Thread(r1).start();
		
	}
	public void startWriting() {
		Runnable r2=()->{
			try {
			while(true && !socket.isClosed()) {
				BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
				
					String content=br1.readLine();
					
					writer.println(content);
					writer.flush();
					if(content.equals("exit")) {
						socket.close();
						break;
					}
				
				} 
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		};
		new Thread(r2).start();
	}
	public static void main(String[] args) {
		System.out.println("Server Running");
		new Server();
	}
}
