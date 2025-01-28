import.java.util.Scanner;
class Factorial{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int result =factorialnum(n);              //function calling
    System.out.println(result);
  }
  static int factorialnum(int n) {
        if(n==0 || n==1)            //if the input number is either 0 or 1 thus, the factorial of the number should be returned as 1
            return 1;
        else        
            return (n*factorial(n-1));    //else, do recursive process(recursion)
      }
}
//5! = 5*4*3*2*1=120
