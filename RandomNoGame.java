import java.util.*;
public class RandomNoGame {
public static void main(String[] args) {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);

System.out.println("RANDOM NO GAME IN JAVA");
System.out.print("enter no limit (ex 0-?) : ");
int limit = sc.nextInt();
int rno = rd.nextInt(limit);

for(int n=1; ; n++){
    System.out.print("GUESS :");
    int guess = sc.nextInt();
    if(guess==rno){
        System.out.println("CONGRATULATIONS YOUR NO IS CORRECT :)");
        break;
    }
   else if(guess<rno){
        System.out.println("TOO LOW! TRY AGAIN!!");
    }
    else if(guess>rno){
        System.out.println("TOO HIGH! TRY AGAIN !!");
    }
    else{System.out.println("WRONG INPUT TRY AGAIN");}
    
}


}    
}
