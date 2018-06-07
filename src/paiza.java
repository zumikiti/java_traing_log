import java.util.*;


public class paiza {
    public static void main(String[] args) {
    	//paiza2();
    	paizeB_1();
    }

    public void paiza0(){
    	//標準入力に「1 2」など数値を入れて、a,bをかけた結果が9999以内ならその結果。10000以上なら「NG」とだす。
    	//条件：a,bの整数判断。1 <= a*b <= 9999。
    	Scanner sc = new Scanner(System.in);
        int a;
        int b;
        
        while(true){
            String line = sc.nextLine();
            line.equals(line);
            String[] arrayline = line.split(" ");
            line = arrayline[0];
            try {
                a = Integer.parseInt(line);
                if(a < 0 ){
                    throw new IllegalArgumentException("引数の値が不正です");
                }
                line = arrayline[1];
                b = Integer.parseInt(line);
                if(b < 0 ){
                    throw new IllegalArgumentException("引数の値が不正です");
                }
                break;
            } catch (Exception e){
                sc.nextLine();
            }
        }
        
        a = a * b;
        
        if(a <= 9999){
            System.out.println(a);
        } else {
            System.out.println("NG");
        }
    }
    
    public static void paiza2(){
    	Scanner sc = new Scanner(System.in);
        
        	String line = sc.nextLine();
        	//System.out.println(line);
        int i = line.length(); 
        //System.out.println(i);
        if(i > 2){
            char c0 = line.charAt(0);
            char ci; 
            //System.out.println(c0);
            try{
                for(int j =1; j < i; i++){
                    ci = line.charAt(j);
                    if(c0 != ci) throw new Exception("条件OK");
                }
                System.out.println("NG");
                
            } catch (Exception e) {
                System.out.println("OK");
            }
            
        } else {
        	System.out.println("NG");
        	sc.next();
        }
        
    }
    
    public void paize3(){
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line.length() > 1){
            line = line.replaceAll("A", "4");
            
        }
    }
    
    public static void paizeB_1(){
    	//【入力】
    	//5
    	//
    	//774123801013511X
    	//973736969204716X
    	//793180803472918X
    	//358682935182058X
    	
    	//【結果】
    	//1 
    	//4 
    	//0 
    	//1 
    	//2
    	
    	Scanner sc = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<String>();
        String str = null;
        int n;
        
        while(true){
        	str = sc.nextLine();
        	if(str.length() == 1){
        		n = Integer.parseInt(str);
        		break;
        	} else{
        		sc.nextLine();
        	}
        }
        
        //System.out.println(n);
        
        while(true){
        	str = sc.nextLine();
        	if(str.length() == 16){
        		//System.out.println(str);
        		
        		input.add(str);
        		if( input.size() == n) break;
        	} else {
        	    sc.nextLine();
        	}
        }
        //System.out.println("入力終わり。");
        
        //System.out.println("シュチュ力開始");
        
        int even = 0;
        int odd = 0;
        int j;
        char c;
        char ten;
        char iti;
        
        for(String str1: input){
        	System.out.println(str1);
        	for (int i =0; i < 15; i++){
        		c = str1.charAt(i);
        		j = Integer.parseInt("" +c);
        		if(i % 2 == 0){
        		    //System.out.println("jが偶数です。" + j);
        			j = j * 2;
        			if(j >= 10){
        			    //System.out.println("jが10以上" + j);
        				ten = String.valueOf(j).charAt(0);
        				iti = String.valueOf(j).charAt(1);
        				j = Integer.parseInt("" + ten) + Integer.parseInt("" + iti);
        				//System.out.println("こうなりました。j＝" + j);
        			}
        			even = even + j;
        			//System.out.println("jが偶数です。" + j + "evenは、" + even );
        		} else {
        			odd = odd + j;
        			//System.out.println("jが奇数です。" + j + "oddは、" + odd );
        		}
        	}
        	//(even + ood + x *2 ) % 10 == 0
        	//
        	//System.out.println("evenは、" + even);
        	//System.out.println("oddは、" + odd);
        	//System.out.println("これからX求めるぞ");
        	int x;
        	for(int i = 0; i <10; i++){
        		x = i; //*2;
        		if(x == 10)x=1;
        		if(x == 12)x=3;
        		if(x == 14)x=5;
        		if(x == 16)x=7;
        		if(x == 18)x=9;
        		x = even + odd + x;
        		System.out.println((even + odd) + "これにX( " +  i  + " )を足すと、" + x);
        		System.out.println("Xを10で割ると、" + (x % 10));
        		if(x % 10 == 0){
        			System.out.println(i);
        			break;
        		}
        	}
        	
        }
    }
    
    public static void paizaB_2(){
    	Scanner sc = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<String>();
        String str = null;
        int n;
        
        while(true){
    	    str = sc.nextLine();
    	    n = Integer.parseInt(str);
    	    if(n > 1 && n <100) break;
    	    sc.nextLine();
        }
    	
    	while(true){
        	str = sc.nextLine();
        	input.add(str);
        	if( input.size() == n) break;
        	sc.nextLine();
        }
        
        
        float hight = 0f;
        ArrayList<Float> le = new ArrayList<Float>(); //以下
        ArrayList<Float> ge = new ArrayList<Float>(); //以上
        
        for(String s : input){
            
            String[] ch = s.split(" ");
            System.out.println(ch[0]);
            if(ch[0].equals("le")) le.add(Float.parseFloat(ch[1]));
            if(ch[0].equals("ge")) le.add(Float.parseFloat(ch[1]));
            
            //hight = Float.parseFloat(s);
            //hList.add(hList);
        }
        Collections.sort(le);
        Collections.sort(ge);
        
        System.out.println(ge.get(ge.size()-1) + " " + le.get(0));
        
    }
}