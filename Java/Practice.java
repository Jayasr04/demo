import  java.util.Scanner;
class Disarium{
    Scanner sc = new Scanner(System.in);
    int num ;
    void getdata(){
        System.out.println("Enter a number ");
        num = sc.nextInt();
    }
    void checkdis(){
        int n1 = num;
        int new_num=0;
        int sum=0;
        while(n1!=0){
            int digit = n1%10;
            n1=n1/10;
            new_num=new_num*10+digit;

        }
        int i=1;
        while(new_num!=0){
            int digit1 = new_num%10;
            new_num= new_num/10;
            sum =(int)(sum+(Math.pow(digit1,i)));
            i++;
        }
        if(sum==num){
            System.out.println("Disarium number");
        }
        else{
            System.out.println("Not a Disarium number");
        }
    }
}
public class Practice {
    public static void main(String[] args) {
        Disarium number = new Disarium();
        number.getdata();
        number.checkdis();
    }
}
