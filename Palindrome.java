//input  : "A man, a plan, a canal:Panama"
//output : true 
import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a String : ");        //get the input string
        String s = sc.nextLine();    
        s=s.toLowerCase();                              //convert the string to lowercase
        s=s.replaceAll("[^A-Za-z]","");                 //remove all the special character 
        System.out.println(checkpalindrome(s));
    }
    public static boolean checkpalindrome(String s){
        String reversed ="";
        for(int i = s.length()-1;i>=0;i--){            //iterate from the last index to 0th index
            reversed += s.charAt(i);                   //add the character to the reversed variable
        }
        if(s.equals(reversed))                        //check whether the reversed string is equal to the original string
        return true;
        else
        return false;
    }
}

   
