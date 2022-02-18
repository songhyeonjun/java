package second_project;

import java.io.IOException;

public class ContinueKey {

	public static void main(String[] args) throws IOException {

		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode:"+keyCode);
		}
	}

}
