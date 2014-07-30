import java.net.*;
import java.io.*;

public class Server {
	public static void main(String [] s)
	{	try
	{
		ServerSocket server = new ServerSocket(1123);
		System.out.println("Server Created");
		while(true)
		{
			Socket ss= server.accept();
			new Rthread(ss).start();
			
		}
	}
	catch(Exception e)
	{
		System.out.println("Server Exception "+ e);
	}
	}
}
