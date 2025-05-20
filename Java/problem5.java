import java.util.Scanner;
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        if(s1.length()%2!=0){
            int x = s1.length()/2;
            System.out.println(s1.charAt(x));
        }
        else{
            int x = s1.length()/2;
            System.out.println(s1.charAt(x-1)+""+s1.charAt(x));
        }
    }
}
