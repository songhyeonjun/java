package fourth_project;

public class ArrayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java","Python","C++"};
		String[] newStrArray = new String[5];
		
		//(�����迭,���� �ε���,������ �迭, ���� ������ �ε���, ������ ����)
		System.arraycopy(oldStrArray, 0, newStrArray, 1, oldStrArray.length);
		String result = "";
		result += "(";
		for(int i=0;i<newStrArray.length;i++) {
			if(i == newStrArray.length-1) {
				result +=newStrArray[i];
			}else {
				result +=newStrArray[i]+",";
			}
		}
		result +=")";
		System.out.print(result);
	}

}
