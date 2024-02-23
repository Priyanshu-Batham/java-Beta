//program to print 
import java.io.*;
class Fibo{
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());

		int a = 0, b = 1;
		if(n == 1) System.out.print(a);	
		else if(n == 2) System.out.print(a+" "+b);	

		else{
			int i = 0;
			do{
				System.out.print(a+" ");	
				int c = a+b;
				a = b;
				b = c;
			}while(i++ < n);
		}
	}
}