package step02_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputTest1 {

	public static void main(String[] args) throws IOException  {
		InputStreamReader isr=new InputStreamReader(System.in); //�Է½�Ʈ��ó��
		BufferedReader br=new BufferedReader(isr);
		//ǥ���Է���ġ : Ű����, ǥ�������ġ : �����, �Է���ġ : ���콺, �����ġ : ����Ʈ
		//System.in : �ܼ� --> Ű����
		//System.out : �ܼ� --> �����
		
		String name;
		char gender;
		int age;
		float tall;
		double weight;
		
		System.out.print("�̸��� �Է��ϼ��� : ");    name=br.readLine();
		System.out.print("������ �Է��ϼ��� : ");    gender=br.readLine().charAt(0); //"��\r\n
		/* charAt(index) �ε����� �־��� ��ġ���� �ش��ϴ� ���ڸ� ����
		 * �ε����� 0���� ����, ���� ū���� ���ڿ�-1
		 * . �� �ǹ�
		 * 1. ���� : Ư�� ��ü ������ �Լ��� ȣ�� �Ҷ� ��ü��, �Լ���()
		 * 2. �Է� : charAt() ����� 
		 */
		System.out.println("���̸� �Է��ϼ��� : ");  
		age=Integer.parseInt(br.readLine());  //"23"--->23
		
		System.out.println("������ �Է��ϼ��� : ");  
		tall=Float.parseFloat(br.readLine());   //"175.5"--->175.5
		
		System.out.println("ü���� �Է��ϼ��� : ");  
		weight=Double.parseDouble(br.readLine()); //"63"--->63
		
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+gender+"��ϴ�");
		System.out.println("���� : "+age+"���Դϴ�");
		System.out.println("���� : "+tall+"cm");
		System.out.println("ü�� : "+weight);

		
		
		

	}

}
