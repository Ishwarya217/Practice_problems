import java.util.Scanner;
public class Divisiblitycheck {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("enter a number : ");
int num1=sc.nextInt(); 
System.out.println(checkdivisiblity(num1)); //function calling
}
public static boolean checkdivisiblity(int n){
if(n%27 == 0)          //if number modulus 27 gives remainder as 0 then the number is divisible by 27
    return true;      //then return true
else
    return false; 
}
}
