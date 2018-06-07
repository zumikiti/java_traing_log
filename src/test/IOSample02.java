package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IOSample02 {

	public static void main(String[] args) throws IOException{
		
		File filepath = new File("test01.txt");
		FileReader fr = new FileReader(filepath);
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		
		while(str != null){
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
	}

}
