package step02_������;

public class CastingEx {

	public static void main(String[] args) {
		
		int pay=857650;
		double tax=0.033;  //3.3%
		//�޿�-(�޿�*����)
		int rPay=pay-(int)(pay*tax);  //�����ٶ� ������ �����ֱ� ���� ���������� �ٲ��ذ���
//		double rPay=pay-(pay*tax);
		
		System.out.println("�� ���ɾ� : "+rPay);
		
		
		
//		----------------------------------------
//		int k=87, e=88, m=75;
//		int tot=k+e+m;
////		double avg=tot/3.0;  //3.0 �ڵ�����ȯ ����  <������ ����
//		double avg=(double)tot/3; //��������ȯ �� �ڵ�����ȯ �߻� <�ǹ����� �� ���� ���
//		
//		System.out.println("���� : "+tot);
//		System.out.println("��� : "+avg); //��
//		System.out.printf("��� : %.2f", avg); //��
//		
//		byte a=100;
//		int b=a; //�ڵ�����ȯ
//		
//		double c=73.45;
//		int d=(int)c; //��������ȯ
//		
//		System.out.println(a + " " + b);
//		System.out.println(c + " " + d);

	}

}
