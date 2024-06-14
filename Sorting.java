import java.util.Scanner;

public class Sorting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
System.out.print("enter total numbers to sort : ");
int total = sc.nextInt();
int arry [] = new int[total];
for(int n =0; n<total; n++){
    System.out.print("enter no to sort on "+ n + " : ");
    arry[n] = sc.nextInt();
}
System.out.println("1 for ascending order : ");
System.out.print("2 for descending order : ");
int chose = sc.nextInt();
int temp;
if(chose==1){
for(int n =0 ; n<total; n++){
    for(int j= n+1; j<total; j++){
        if(arry[n]>arry[j]){
temp = arry[n];
arry[n] = arry [j];
arry[j] = temp;
        }
    }
}
for(int n=0; n<total; n++){
    System.out.print(arry[n] + " ");
}
}
if(chose==2){
    for(int n =0 ; n<total; n++){
        for(int j= n+1; j<total; j++){
            if(arry[n]<arry[j]){
    temp = arry[n];
    arry[n] = arry [j];
    arry[j] = temp;
            }
        }
    }
    for(int n=0; n<total; n++){
        System.out.print(arry[n]+ " ");
    }
    }




    }
}