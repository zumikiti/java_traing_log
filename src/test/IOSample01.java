package test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class IOSample01 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String file = "test01.txt";
		//file = "/Users/teke/Documents/workspace/test02.txt";
		Writer out = new FileWriter(file);
		
		out.write("テスト02");
		out.write("だよ。");
		out.close();
		
		System.out.print("処理完了したよ〜");

	}

}
