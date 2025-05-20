import java.util.Scanner;
class string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int j = 0;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int cnt=0;
        String[] ins = new String[10];
        for (int i = 0; i < 10; i++) {
            ins[i] = "";
        }
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ',') {
                j++;
            } else {
                ins[j] = ins[j] + inp.charAt(i);
            }
        }
        for (int i = 0; i < j + 1; i++) {
            int count = 0;
            a=0;b=0;c=0;d=0;
            for (int k = 0; k < ins[i].length(); k++) {
                int charcode = (int) ins[i].charAt(k);
                if (charcode >= 97 && charcode <= 122){
                    a=1;
                }
                if(charcode >= 65 && charcode <= 90){
                    b=1;
                }
                if(charcode == 35 || charcode == 36 || charcode == 64){
                    c=1;

                }
                if(charcode >= 48 && charcode <= 57) {
                    d=1;
                }
            }

            if (a==1 && b==1 && c==1 && d==1 && ins[i].length() > 6 && ins[i].length() < 12) {
                System.out.println(ins[i]);
                cnt++;

            }
        }
        if(cnt==0){
            System.out.println("Invalid");
        }
    }
}
