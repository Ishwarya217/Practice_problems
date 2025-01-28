//Input: n = 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.

class fibonaaciseries {
  public static int fib(int n) {
      if (n <= 1) return n; // Base condition
      int a = 0, b = 1;     // Initial values for F(0) and F(1)
      for (int i = 2; i <= n; i++) {  
          int temp = b;      //initialise the temp variable with the value of 'b'
          b = a + b;        //update 'b' with the sum of a and b
          a = temp;          //update a with the temp value
      }
      return b; // Return the nth Fibonacci number
  }

  // Main method to test the Fibonacci function
  public static void main(String[] args) {
      int n = 10; 
      System.out.println("The " + n + "th Fibonacci number is: " + fib(n));
  }
}
