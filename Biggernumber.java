import java.util.Scanner;
class Biggernumber{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("enter first number:");
int a=sc.nextInt();			//get the first input
System.out.println("enter second number:");
int b=sc.nextInt();			//get the second input
System.out.println("enter third number:");
int c=sc.nextInt();			//get the third input
  //ternary operator
  //checks if 'a' is greater than 'b', and checks if 'a' is also greater than c if so,then store 'a' else 'c'
  //Else, 'b' is greater than or equal to 'a'
  // Check if 'b' is greater than 'c'; if true, 'b' is the greatest; otherwise, 'c' is the greatest
int biggernumber = (a>b) ? (a>c?a:c) : (b>c?b:c);    
  System.out.println("the bigger number among 3 numbers: "+biggernumber);
}
}
}
