package second_project;

public class PrintfEx {

	public static void main(String[] args) {
		int value = 12300;
		System.out.printf("��ǰ�� ����:%d��\n", value);//������ ���
		System.out.printf("��ǰ�� ����:%6d��\n", value);//6�ڸ�����
		System.out.printf("��ǰ�� ����:%-6d��\n", value);//�ڷ�6�ڸ�����
		System.out.printf("��ǰ�� ����:%06d��\n", value);//������� 0���� ä���
		
		double area = 3.14159 * 10 * 10; 
		//double area = 3.14159;
		System.out.printf("�������� %d�� ���� ����:%10s\n",10,area);
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
