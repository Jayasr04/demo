import java.util.Scanner;
class shopping{
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    String [] items = new String[10];
    shopping(){
        name = "General store";
        id = 100;
        items[0]="Apple";
        items[1]="Brush";
        items[2]="Chocolate";
        items[3]="Pencil";
        items[4]="Pen";
    }
    public void delete(){
        int i=0;
        System.out.println("Enter the item to delete");
        String item = sc.next();
        for(i =0;i<5;i++){
            if(items[i].equals(item)){
                break;
            }
        }
        for(int j=i;j<4;j++){
            items[j]=items[j+1];
        }
        for(int k=0;k<4;k++){
            System.out.println("List after deletion");
            System.out.print(items[k]+" ");
        }
    }
    public void add_sp(){
        int i=0;
        System.out.println("Enter a location");
        int loc = sc.nextInt();
        System.out.println("Enter an item");
        String item = sc.next();
        for(i=0;i<4;i++){
            if(i==loc){
                break;
            }
        }
        for(int j=4;j>=i;j--){
            items[j]=items[j-1];
        }
        items[i]=item;
    }
}