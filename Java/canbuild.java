import java.util.Scanner;
public class canbuild {
    Scanner sc =new Scanner(System.in);
    void can(){
        String one = sc.nextLine();
        String two = sc.nextLine();
        int count = 0;
        if(two.equals("")){
            System.out.println("True");
            return;
        }
        for(int j=0;j<two.length();j++) {
            for (int i = 0; i < one.length(); i++) {
                if (two.charAt(j) == one.charAt(i)) {
                    count++;
                    break;

                }
            }
        }
        if(count == two.length() && count <=one.length()){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        };
    }
    public static void main(String[] args) {
        canbuild c1 = new canbuild();
        c1.can();
    }
}
