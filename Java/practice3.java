import java.util.*;
import java.lang.Integer;
class afterpotion{
    Scanner sc = new Scanner(System.in);
    String s1;
    void getdata(){
        s1 = sc.nextLine();
    }
    void applypotion(){
        int x=0;
        int y=0;
        int index_a=0;
        int index_b=0;
        String new1 = "";
        int [] new2 = new int[10];
        for(int i =0;i<s1.length();i++){
            if(s1.charAt(i)=='A'){
                x = Integer.parseInt(String.valueOf(s1.charAt(i-1)));
                x=x+1;
                index_a=i-1;
            }
            if(s1.charAt(i)=='B') {
                y = Integer.parseInt(String.valueOf(s1.charAt(i - 1)));
                y = y - 1;
                index_b=i-2;
            }
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='A'){
                continue;
            }
            else if(s1.charAt(i)=='B'){
                continue;
            }
            else {
                new2[i]= s1.charAt(i);
            }
        }
        new2[index_a]=x;
        new2[index_b]=y;
        for(int i=0;i<new1.length();i++){
            System.out.print(new2[i]);
        }
    }
}
public class practice3 {
    public static void main(String[] args) {
        afterpotion a1 = new afterpotion();
        a1.getdata();
        a1.applypotion();
}
}
