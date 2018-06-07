package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSample {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("インド");
		al.add("マレーシア");
		al.add("バルセロナ");
		al.add("バチカン");
		
		String place = (String) al.get(2);
		System.out.println(place);
		
		int listcount = al.size();
		System.out.println(listcount);
		
		al.remove(2);
		place = (String) al.get(2);
		System.out.println(place);
		
		System.out.println("ここからループです。");
		for(int i=0; i< al.size(); i++){
			place = (String) al.get(i);
			System.out.println(place);
		}
		
		al.sort(null); //名前でソート
		
		System.out.println("名前でソート後");
		for(String j : al){
			System.out.println(j);
		}
		
		System.out.println("Iteratorです。");
		Iterator<String> it = al.iterator();
		while(it.hasNext()){
			place = it.next();
			System.out.println(place);
		}
	}
}
