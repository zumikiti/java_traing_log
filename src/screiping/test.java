package screiping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> elelist = new ArrayList<>();
		String url ="https://stocks.finance.yahoo.co.jp/stocks/detail/?code=7643.T";
		
		try {
			Document doc = Jsoup.connect(url).get();
			Elements ele = doc.select("dd.mar0 strong");
			//System.out.println(ele.text());
			
			String price = ele.get(0).text();
			String rimawari = ele.get(9).text();
			String per = ele.get(11).text();
			String pbr = ele.get(12).text();
			
//			for(Element e : ele) {
//				System.out.print(e.select("herf"));
//				elelist.add(e.text());
//			}
			
//			for(Object a : elelist){
//				System.out.println(a);
//			}
			
			System.out.println("前日株価" + price);
			System.out.println("配当利回り" + rimawari);
			System.out.println("PER" + per);
			System.out.println("PBR" + pbr);
			
			//System.out.println("i live");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error");
		}
		

	}

}
