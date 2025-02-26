import java.util.*;
public class Mathproblem {
    public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a 3digit number");
    int num =sc.nextInt();
    int unit = num%10; 
    int hundreds = num/100;
    System.out.println(unit+"\t"+hundreds);

}}
