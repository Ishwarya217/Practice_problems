import java.util.Scanner;
public class abs{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("enter num1 : ");
int num1=sc.nextInt(); 
System.out.print("enter num2 : ");
int num2=sc.nextInt();
System.out.println("the addition of 2 numbers: "+ Math.abs(num1+num2));     //addition of 2 input and remove the negative sign  (-5+-2 = -7) returns only 7
System.out.println("the subtraction of 2 numbers: "+ Math.abs(num1-num2));  //sub of 2 input and remove the negative sign
}
}
