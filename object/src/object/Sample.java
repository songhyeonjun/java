package object;

class Calculator{
	
	//���� : 641��, ������� �¿��,
	//���������� ���������� �ٽ� �������� ���� ��ȯ���
	//���� ���� Ÿ���ϴ� 641�� ������ ���������� ����ؼ�
	//������ ���� �������� �ٽ� ���ƿ��� ��ȯ�����̴�.
	int result = 0;
	int add(int num) {
		result += num;
		return result;
	}
}

public class Sample {

	public static void main(String[] args) {
		//----static�� �ƴѰ��
//		Calculator cal = new Calculator();		
//		System.out.println(cal.add(10));
//		System.out.println(cal.add(20));
		//----static�� ���
		//System.out.println(Calculator.add(10));
		//System.out.println(Calculator.add(20));
		Calculator cal1 = new Calculator();
		Calculator cal2 = new Calculator();
		
		System.out.println(cal1.add(10));
		System.out.println(cal1.add(20));
		
		System.out.println(cal2.add(30));
		System.out.println(cal2.add(50));
	}
}




