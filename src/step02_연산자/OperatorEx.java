package step02_������;

public class OperatorEx {

	public static void main(String[] args) {

		//������ �ʱ�ȭ
		int a=0;
		float b=0.0f; // b=0f;
//		String c="";
		String c=null; //�Ϲ������� ���ǲ����� �� ���� ���
		char d='\0';
		
		System.out.println(a+" "+b+" "+c+" "+d);

		
		
		
		
//		============================================
		char code='��';
		String gender;
		int x=0;

		//3�׿����� ? :
		gender=(code=='M' || code=='��')?"man":"woman";
		x=(x>=4 || x<2)?5:9;
		System.out.println("���� : "+gender);
		
		boolean ck=true;
		System.out.println(!ck);
		
//		--------------------------------------------
//		���Կ�����
//		int p=7; //�캯�� �ִ� ���� �º��� �����ִ� ��, type mismatch�Ͼ�� �캯 �������ִ� �� ����
//		p+=2;    //p=p+2  --> p+2 --> 9
//		p*=6;    //9*6  --> 54
//		p-=4;    //50
//		p%=8;    //50%8 --> 2 (50�� 8�� ���� ������)
//		System.out.println(p);
//		
		
		
		
//		���׿����� ++ --
//		int k=7;
////		                            ȭ��    �޸�
//		System.out.println(k++); //  7      8      ����ϰ� ����
//		System.out.println(++k); //  9      9      �����ϰ� ���  <�� �𸣰����� �̰� ���
//		System.out.println(k);   //  9      9
//		System.out.println(--k); //  8      8
//		System.out.println(k--); //  8      7
//		System.out.println(k);   //  7      7
		
//		----------------------------------------------------
//		//���������
//		System.out.println(5/3); // �� ����
//		System.out.println(5/3.0); // ������ ����
//		System.out.println(5%3); // ������ ���� 
//	 	
//		//���迬����
//		int a=5;
//		System.out.println(a==5); // a�� 5�� ������?
//		System.out.println(a>=5); // a�� 5���� ũ�ų� ������?
//		System.out.println(a<=5); // a�� 5���� �۰ų� ������?
//		System.out.println(a!=5); // a�� 5�� ���� ������?
//		
//		//�������� ||  &&
////		String str="korea";
////		System.out.println(str=="korea" || str=="KOREA");  //OR����
////		
////		int score=77;
////		System.out.println(score>=70 && score<90); //AND����
////		
//		//���ڷ���
//		System.out.println("-----------------");
//		int score=77;
//		boolean sw=(score>=70 && score<90); //���ǰ˻�, �� �Ǵ� �������θ� ǥ��
//		System.out.println(sw);
		

	}

}
