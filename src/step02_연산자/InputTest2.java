package step02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* A���� �Է��ϼ��� : 15
 * B���� �Է��ϼ��� : 7
 * 
 * 15 + 7 = 22
 * 
 */
public class InputTest2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int a;
		int b;
		
		System.out.print("A���� �Է��ϼ��� : ");  
		a=Integer.parseInt(br.readLine());
		System.out.print("B���� �Է��ϼ��� : ");  
		b=Integer.parseInt(br.readLine());
		System.out.println();
		System.out.println(a+" + "+b+" = "+(a+b));
				

	}

} 
