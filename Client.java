import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client {
	public static void main(String [] s)
	{
		try
		{
		Socket ss= new Socket("localhost",1123);
		DataOutputStream dos = new DataOutputStream(ss.getOutputStream());
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name= input.next();
		dos.writeUTF(name);
		String data= "";
		while(!data.equals("stop"))
		{
			data=input.next();
			dos.writeUTF(data);
		}
		}
		catch(Exception e)
		{
			
		}
		
	}
}
