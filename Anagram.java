//to check if two string are Anagrams of each other
import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("enter first string : ");
String s1=sc.nextLine();
System.out.print("enter second  string : ");
String s2=sc.nextLine();
System.out.println(checkAnagram(s1,s2));
}
static boolean checkAnagram(String s1,String s2){
    if(s1.length() != s2.length())      //checks the length of the both strings
    return false;
else{
    char[] c1=s1.toCharArray();        //since strings are immutable we need to convert the string into character array
    char[] c2=s2.toCharArray();
    Arrays.sort(c1);                  //then sort the arrays in ascending problems
    Arrays.sort(c2);
    if(Arrays.equals(c1,c2)==true)    //compare both the string using .equals() if true then return tru light
        return true;
    else
        return false;
}
}
}
