import java.util.Scanner;
class roman{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String [] one = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String [] ten = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        int num = sc.nextInt();
        int x = num%10;
        num = num/10;
        int y = num%10;
        String rom = ten[y]+one[x];
        System.out.println(rom);
    }
}