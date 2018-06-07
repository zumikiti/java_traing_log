package paiza;

import java.util.*;


public class c3 {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] ll = line.split(" ", 0);
        //System.out.println(ll[0]);
        
        int n = Integer.parseInt(ll[0]);
        int s = Integer.parseInt(ll[1]);
        int p = Integer.parseInt(ll[2]);
        
        //System.out.println("n=" + n + ", s=" + s + ", p=" +p);
        
        int sp = s*p;
        int ps = sp - s + 1;
        //System.out.println("sp=" + sp + ", ps=" + ps);
        
        if(n >0 && n <= 10000 && s >1 && s <= 10000 && p >1 && p <= 10000){
            String res = "";
            if(n > ps){
                for(int i=ps; ps <= sp;){
                    //System.out.println(ps);
                	res = res + ps;
                    ps++;
                    if(ps > n) break;
                    res = res + " ";
                }
            } else {
                res= "none";
            }
            System.out.println(res);
        }
        
    }
}