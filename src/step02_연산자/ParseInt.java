package step02_������;
//�Ľ�(parsing) : ���� �м� 
public class ParseInt {

	public static void main(String[] args) {
	String a="100"; //���ڿ� 100
	String b="200";
//	int a=100; // ���� 100
	
	int a1=Integer.parseInt(a);  //"100"-->100���� ��ȯ
	int b1=Integer.parseInt(b);
	
	float a2=Float.parseFloat(a); // ���� f ���� �ʿ� ����
	float b2=Float.parseFloat(b);
	
	double a3=Double.parseDouble(a); 
	double b3=Double.parseDouble(b);
	
	System.out.println(a+b); //������ �ǹ�
	System.out.println(a1+b1); //���ϱ�
	System.out.println(a2+b2);
	System.out.println(a3+b3);

	
	}

}
