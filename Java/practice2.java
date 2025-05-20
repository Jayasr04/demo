import java.util.Scanner;
class plussign{
    Scanner sc = new Scanner(System.in);
    String s1;
    void getdata(){
        s1 = sc.nextLine();
    }
    void check(){
        int count = 0;
        int alphanum=0;
        if(s1.charAt(0)!='+'){
            System.out.println("False");
            System.exit(0);
        }
        for(int i=0;i<s1.length()-1;i++){
            int charcode = (int)(s1.charAt(i));
            if(charcode >97 && charcode <123 && s1.charAt(i-1)=='+' && s1.charAt(i+1)=='+'){
                count++;
            }
        }
        for(int i=0;i<s1.length();i++){
            int charcode = (int)(s1.charAt(i));
            if(charcode >97 && charcode <123){
                alphanum++;
            }
        }
        if(alphanum == count){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
public class practice2 {
    public static void main(String[] args) {
        plussign p1 = new plussign();
        p1.getdata();
        p1.check();
    }
}
