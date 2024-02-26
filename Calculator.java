import java.util.*;
public class Calculator {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("CALCULATOR USING JAVA");
System.out.print("enter 1st no : ");
float a = sc.nextFloat();
System.out.print("enter operator (*,+,-,/) : ");
String opt = sc.next();
System.out.print("enter 2nd no : ");
float b = sc.nextFloat();

if(opt.charAt(0) =='+'){
    float c = a+b;
System.out.println("sum of " + a+ " and "+b+" is = "+c);
}
else if(opt.charAt(0)=='-'){
    float c = a-b;
    System.out.println("decrement of " + a+ " and "+b+" is = "+c);

}
else if(opt.charAt(0)=='*'){
float c = a*b;
    System.out.println("multiplication of " + a+ " and "+b+" is = "+c);

}
else if(opt.charAt(0)=='/'){
    float c =a/b;
    System.out.println("divident of " + a+ " and "+b+" is = "+c);

}
else{
    System.out.println("error!!!!");
}


}    
}
