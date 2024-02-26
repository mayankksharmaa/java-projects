import java.util.*;
public class studentGradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("STUDENT AVERAGE NUMBER CALCULATOR USING ARRAYS");
    System.out.print("ENTER NO OF SUBJECTS : ");
    int sub = sc.nextInt();
    double array[] = new double[sub];
    int sum=0;

for(int n=0; n<sub; n++){
    System.out.print("enter marks : ");
    array[n] = sc.nextInt();
   sum+=array[n];
}
double avrg = sum/sub;
System.out.println(avrg);

}
}
