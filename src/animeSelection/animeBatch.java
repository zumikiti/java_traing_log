package animeSelection;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class animeBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = args[0]; //引数を格納
		String title = null;
		System.out.println(filename);
		
		int i = filename.indexOf("　"); //全角空白の位置取得
		if(i == 0){
			System.out.println("該当の文字は見つかりません。");
		} else {
			System.out.println("終了位置は" + i + "です。");
			
			title = filename.substring(0, i); //空白より前を切り取り
			System.out.println(title);
		}
		
		
		File dir = new File("c://Users/izumi/Videos/アニメ");
		File[] list = dir.listFiles();
		System.out.println(list.length);
		
		int ll = list.length;
		
		//フォルダ内のファイルを確認
		for (int j = 0; j < ll; j++){
			if(list[j].isFile()){
				//System.out.println("[F] " + fn.getName());
			} else if(list[j].isDirectory()){
				//System.out.println("[D] " + fn.getName());
				String dname = list[j].getName();
				System.out.println("dname: " + dname);
				System.out.println("title: " + title);
				if(dname.equals(title)){
					System.out.println(title + "がありました。");
					moveDir(title, dir, filename); //フォルダがあればmoveDirでファイルを格納
					break;
				}
			}
			if(j == ll-1){
				makeDir(title, dir);
				moveDir(title, dir, filename);
			}
		}
	}


	private static void makeDir(String title, File dir) {
		// フォルダを生成
		File newdir = new File(dir + "/" + title);
		if(newdir.mkdir()){
			System.out.println("oooooフォルダ作成成功ooooo");
		} else {
			System.out.println("xxxxxフォルダ作成失敗xxxxx");
		}
	}

	private static void moveDir(String title, File dir, String filename) {
		// ファイルを該当のフォルダに格納
		System.out.println("ファイルを移動するよ。");
		try{
			Path sourcePath =Paths.get(dir + "/" + filename);
			Path tergetPath = Paths.get(dir + "/" + title + "/" + filename);
			System.out.println(sourcePath + "を" + tergetPath + "に移動します。");
			Files.move(sourcePath, tergetPath);
			System.out.println("移動成功");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("移動失敗");
		}
	}

}
