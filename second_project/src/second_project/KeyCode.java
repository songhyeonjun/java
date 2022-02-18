package second_project;

import java.io.IOException;

public class KeyCode {

	public static void main(String[] args) throws IOException{
		int keyCode;
				
		keyCode = System.in.read();
		System.out.println("keyCode1: "+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode2: "+keyCode);
		
		keyCode = System.in.read();
		System.out.println("keyCode3: "+keyCode);
		
	}

}
