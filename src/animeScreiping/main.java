package animeScreiping;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://anime.eiga.com/program/";
		try {
			Document d = Jsoup.connect(url).get();
			Elements ele = d.select("div.seasonBoxImg");
			for(int i=0; i< ele.size(); i++ ){
				System.out.println(ele.get(i).text());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
