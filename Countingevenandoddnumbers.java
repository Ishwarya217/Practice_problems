//question : get 5 input numbers from user , pass them as the parameters and then try to find the no.of.even and odd numbers in it.
//enter 5 input numbers: 12 13 155 153 199 
//evencount : 1
//oddcount  : 4

import java.util.*;
public class Countingevenandoddnumbers {
public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter 5 input numbers: ");    //get 5 input  numbers
	int input1 =sc.nextInt();
	int input2 =sc.nextInt();
	int input3 =sc.nextInt();
	int input4 =sc.nextInt();
	int input5 =sc.nextInt();
	countnumbers(input1,input2,input3,input4,input5);    //function calling
}
public static void countnumbers(int input1,int input2,int input3,int input4,int input5) {
	int evencount = 0, oddcount = 0;
	int[] arr = {input1,input2,input3,input4,input5};    //since all the numbers are of integer datatype(similar) I stored it, in an array.
	for(int i=0;i<arr.length;i++) {                      //start looping from 0 to 4th index
		if(arr[i] % 2 == 0)                                //condition to check even number
			evencount++;
		else                                              //else count odd number
			oddcount++;
	}
	System.out.println("evencount : "+evencount);
	System.out.println("oddcount  : "+oddcount);
}
}
