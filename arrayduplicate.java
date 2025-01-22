import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class arrayduplicate {
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size:");
    int n = sc.nextInt();
    System.out.println("enter the elements of the array:");
    int[] arr =new int[n];  
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
}
  List<Integer> result = findDuplicates(arr);
  System.out.println(result);
}
  public static  List<Integer> findDuplicates(int[] arr) {
        List<Integer> list =new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);      //first sort the array
        for(int i=1;i<n;i++){    //initialise i and start the iteration from index 1 to n
            if(arr[i]==arr[i-1]){    //compare the ith element with the previous element if both are equal then, add the element to the arraylist
                list.add(arr[i]);
            }
        }
        return list;    //return the ArrayList that consisting of the repeating element 
    }
}
