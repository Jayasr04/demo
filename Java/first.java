import java.util.Scanner;
class first{
    Scanner sc = new Scanner(System.in);
    static int height;
    static int weight;
    static double bmi;
    static void userdetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight");
        weight = sc.nextInt();
        System.out.println("Enter your height");
        height = sc.nextInt();
    }
    static void calc(){
        double weight1 = weight*0.45;
        double height1 = height*0.025;
        bmi = (weight1)/(height1*height1);
    }
    static void display(){
        System.out.println("Your BMI is : "+ bmi);
        if(bmi<18.5){
            System.out.println("Underweight");
        }
        if(bmi>18.5 && bmi <25.0){
            System.out.println("Normal");
        }
        if(bmi>25.0 && bmi<30.0){
            System.out.println("Overweight");
        }
        if(bmi>30.0){
            System.out.println("Obese");
        }
    }
    public static void main(String args[]){
        //first bm = new first();
        userdetails();
        calc();
        display();
    }
}