package second_project;

import java.io.IOException;

public class QStopEx {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode:"+keyCode);
			if(keyCode == 113) {
				break;
			}
		}
		
		System.out.println("Á¾·á");
	}

}
