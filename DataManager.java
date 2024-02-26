import java.util.*;
public class DataManager{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String array [] = new String[3];
        for(int n=1; ; n++){
System.out.println("enter 1 for add task");
System.out.println("enter 2 for view added task");
System.out.println("enter 3 for exit");
int input= sc.nextInt();
sc.nextLine();
if(input==1){
    System.out.print("enter yours name : ");
    array[0] = sc.nextLine();
    System.out.print("enter mothers name : ");
    array[1] = sc.nextLine();
    System.out.print("enter fathers name : ");
    array[2] = sc.nextLine();

}
else if(input==2){
    System.out.println("yours name "+ array[0]);
    System.out.println("mother's name "+ array[1]);
    System.out.println("Father's2 name "+ array[2]);

}
else if(input ==3 ){
    System.out.println("exitingggg!!");
    break;
    
}
else{System.out.println("wrong input try again !!");}
}



        }





    }
