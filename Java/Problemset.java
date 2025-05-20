import java.util.Scanner;
public class Problemset {
    public static void main(String[] args) {
        String template = "Dear |name| , Thanks a lot!!";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(template.replace("|name|",name));
    }
}
