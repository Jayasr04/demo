import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        int [][] array = new int[2][3];
        int [][] array1 = new int[2][3];
        int [][] sum = new int [2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of first matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                array[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second matrix");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                array1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                sum[i][j]=array[i][j]+array1[i][j];
            }
        }
        System.out.println("Sum is :");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+ sum[i][j]);
            }
            System.out.println();
        }


    }
}
