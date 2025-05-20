import java.util.Locale;
import java.util.Scanner;
public class stringMethods {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name = sc.next();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);
        System.out.println(name.replace('a','l'));

    }
}
