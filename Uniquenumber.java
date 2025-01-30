//intput  : arr[] = [2,2,1] to return the element that is repeating only once in the array 
//output : 1 (unique element) 

import java.util.Scanner;
public class Uniquenumber{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the array size: ");
        int n = sc.nextInt();
        System.out.print("\n enter the array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(finduniquenumber(arr));
    }
    public static int finduniquenumber(int[] arr){
    int unique=0;
    for(int nums :arr){
        unique ^= nums;
    }
        return unique;
    }
}
//Explaination of the Approach : [2,2,1] [X-OR OPERATION]
//unique = 0
//unique = 0 ^ 2 = 2(in decimal) [0000 ^ 0010 = 0010]  
//unique = 2 ^ 2 = 0(in decimal) [0010 ^ 0010 = 0000]  
//unique = 0 ^ 1 = 1(in decimal) [0000 ^ 0001 = 0001]  
//return unique = 1
