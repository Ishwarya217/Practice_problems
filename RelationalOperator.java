import java.util.Scanner;
class RelationalOperator{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter a number:");
int num1=sc.nextInt();
System.out.println("enter a number:");
int num2=sc.nextInt();
if(num1 > num2)			//compare num and num2 ,if num1 is greater than num2, print true
  System.out.println( num1 +">"+ num2 + " is true");
else if(num1 >= num2)		//compare num and num2 ,if num1 is greater than equal to num2, print true
  System.out.println( num1 +">="+ num2 + " is true");
else if(num1 < num2)		//compare num and num2 ,if num1 is lesser than num2, print false
  System.out.println( num1 +"<"+ num2 + " is false");
else if(num1 <= num2)		//compare num and num2 ,if num1 is lesser than or equal to num2, print false
  System.out.println( num1 +"<="+ num2 + " is false");
else if(num1 == num2){		//if both are equal then true
  System.out.println( num1 +"=="+ num2 + " is true");
else				//if both are not 
  System.out.println( num1 +"!=" + num2 +" is false");
}
}
