package fourth_project;

public class ArrayCopy {

	public static void main(String[] args) {
		String[] oldStrArray = {"Java","Python","C++"};
		String[] newStrArray = new String[5];
		
		//(원본배열,시작 인덱스,복사할 배열, 복사 시작할 인덱스, 복사할 개수)
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
