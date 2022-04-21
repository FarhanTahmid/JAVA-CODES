import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.text.CollationKey;

public class Client {
	Socket socket;
	
	BufferedReader reader;
	PrintWriter writer;
	
	public Client() {
		try {
			System.out.println("Sending request to server");
			socket=new Socket("192.168.0.107",8000);
			System.out.println("Connection Done");
			
			reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer=new PrintWriter(socket.getOutputStream());
			
			startReading();
			startWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void startWriter() {
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

	public void startReading() {
		Runnable r1=()->{
			System.out.println("Reader Started");
			try {
			while(true) {
				
					String message=reader.readLine();
					if(message.equals("exit")) {
						System.out.println("Server Left");
						socket.close();
						break;
					}
					System.out.println("Server: "+message);
				} 
				}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				
			}
		};
		new Thread(r1).start();
	}

	public static void main(String[] args) {
		System.out.println("Client Running");
		new Client();

	}

}
