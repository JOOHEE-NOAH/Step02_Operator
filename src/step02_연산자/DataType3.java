package step02_������;

/* �� ������ ����� ���� �����Ͽ� ����ϼ���
 * -------
 * �̸� : �̼���    <---printIn
 * ���� : 25��     <---print()
 * �μ� : ���ߺ�    <---printf() �μ� ���� �Բ� ���
 * ���� : 87.5��
 * 
 */



public class DataType3 {

	public static void main(String[] args) {
		String name="�̼���";
		int age=25;
		String dept="���ߺ�";
		double score=87.5;

//		System.out.println("�̸� : "+name);
//		System.out.print("���� : "+age+"��");
//		System.out.printf("\n�μ� : %s\n",dept+"\n���� : "+score+"��");
		
		System.out.println("�̸� : "+name);
		System.out.print("���� : "+age+"��\n");
		System.out.printf("�μ� : %s\n���� : %.1f��", dept, score);

	}

}
