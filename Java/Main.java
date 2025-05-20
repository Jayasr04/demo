import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sum=0;
        System.out.println("Enter the marks of student for 5 subjects");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <5; i++) {
            int a= sc.nextInt();
            sum=sum+a;
        }
        int percent=(sum/5);
        System.out.println("The percentage obtained is ");
        System.out.println(percent);
    }
}