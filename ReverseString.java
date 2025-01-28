import.java.util.Scanner;
class ReverseString{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    String s = sc.nextLine();
    String result = reverseString(s);      //function calling
    System.out.println(result);
  }
public static String reverseString(String s) {
        String reversed="";      //declare a variable named reversed of String datatype to store the reversed string 
        for(int i=s.length()-1;i>=0;i--){     //start from the last index till the 0th index
            reversed+=s.charAt(i);            //store the reversed char in each iteration into the reversed variable 
        }
        return reversed;                      //return the reversed String
    }
}
