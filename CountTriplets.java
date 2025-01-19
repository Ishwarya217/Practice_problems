import java.util.*;
public class CountTriplets {
    public static void main(String[] args) {
      // Scanner obj is created to get the input from user
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();      //size of the array
        int[] arr= new int[n];      //array declaration
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();      //array input values
        }
        int result =countTriplet(arr);    //method calling
        System.out.println("Count of Triplets:"+result);         
     }
        static int countTriplet(int arr[]) {
        Arrays.sort(arr);        //sorting the array
        int n= arr.length;        //length of the array
        int count =0;             //Initialise the count variable to zero
        for(int i=n-1;i>=2 ;i--){  //looping starts from last index till index 2
           int left =0;            
           int right = i-1;
           //two-pointer approach
           while(left < right){
               int sum = arr[left] + arr[right];    //element in the left and right pointers are added are stored in the sum
               if(sum == arr[i]){                    //compare the sum with the element in the ith pointer
                  count ++;                          // if both are equal increment the counter by 1
                  left++;                             //to check for next pair of the triplets move the left pointer towards right
                  right--;                            //and right pointer towards left
           }
               else if(sum < arr[i])
                   left++;
               else
                   right--;
           }}
        return count;                      //return the counted triplet 
  }
}
