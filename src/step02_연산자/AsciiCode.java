package step02_������;

/* ascii �ڵ�
 * A : 65
 * a : 97
 *  
 * 
 */

public class AsciiCode {

	public static void main(String[] args) {
		System.out.println('A'+" : "+(int)'A'); //������ȯ
		System.out.println('a'+" : "+(int)'a');
		
		System.out.println(65+" : "+(char)65); //���ں�ȯ
		System.out.println(97+" : "+(char)97);
		
		System.out.println("---------------------------");
		
		System.out.println('A'+1); //char+int-->int
		System.out.println((char)('A'+1)); //��ȣ ���°� �߿�
		
		System.out.println('a'-32); //char+int-->int
		System.out.println((char)('a'-32));
		
		System.out.println('a'+'b'); // char+char --> int, char�ڸ��� �ݵ�� ���� �Ѱ���
		System.out.println("a"+"b"); // ���ڿ�+���ڿ� --> ���ڿ����ڿ�

	}

}
