package TCPProblem;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int n;
			String temp="";
			String upper;
			ServerSocket s1 = new ServerSocket(2717);
			System.out.println("Waiting for Client.class.");
			Socket ss = s1.accept();
			Scanner sc = new Scanner(ss.getInputStream());
			String str = sc.nextLine();
			n=str.length();
			for(int i=n-1;i>=0;i--) {
				temp=temp+str.charAt(i);
			}
			upper=temp.toUpperCase();
			PrintStream p = new PrintStream(ss.getOutputStream());
			p.println(temp);
			p.println(upper);	
			ss.close();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
