import java.util.Scanner;
public class fibo {
    int n;
    static int fibo(int n){
        if(n==1|| n==2){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        n = sc.nextInt();
        int c = fibo(n);
        System.out.println(c);
    }
}
