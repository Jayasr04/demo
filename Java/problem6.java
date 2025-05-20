import java.util.Scanner;
import java.lang.Integer;
public class problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        for(int i =0;i<num.length();i++){
            int ch = (int)num.charAt(i);
            if(ch>=65 && ch<=90 || ch>=97 && ch<=122){
                System.out.println(0);
                System.exit(0);
            }
        }
        int x = Integer.parseInt(num);
        System.out.println(x);
}
}
