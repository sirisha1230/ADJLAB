package TCPProblem;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			Socket s = new Socket("localhost",2717);
			Scanner sc1 = new Scanner(s.getInputStream());
			System.out.println("Enter any string");
			String str = sc.nextLine();
			PrintStream p = new PrintStream(s.getOutputStream());
			p.println(str);
			String temp = sc1.nextLine();
			String upper = sc1.nextLine();
			System.out.println("Reverse of string is : "+temp);
			System.out.println("Reversed String in Uppercase : "+upper);	
			s.close();
			}
			
			 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    }

}
