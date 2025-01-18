import java.util.*; 
class Twosum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);     
        System.out.println("Enter the array size: ");              
        int n = sc.nextInt();                                    //To get the input array size from user
        int[] arr = new int[n];                                  //array declaration
        System.out.println("Enter the elements of array : ");  
        for(int i=0;i<arr.length;i++){  
            arr[i]=sc.nextInt();                                //To get the elements of the array
        }
        System.out.println("enter ur target: ");
        int target = sc.nextInt();                              //To get the Target value
        System.out.println(twoSum(arr,target));                //call the Twosum method and print the result
    }
    static boolean twoSum(int arr[], int target) {  
      // the optimal Approach is Two Pointer technique for that first, we need to sort the array 
        Arrays.sort(arr);   
      //left and right are the 2 pointers used for this approach.
         int left = 0;                //left pointer is initialised to 0th index                                
         int right =arr.length-1;     //right pointer is initailised to last index
         while(left < right){
             int sum = arr[left] + arr[right];
             if(sum == target)        //if the obtained sum value is equal to the target then return true
                 return true;
             else if (sum < target)  //if the obtained sum value id lesser than the target then increment the left pointer.
                 left++;
             else
                right--;            //if the obtained sum value id greater than the target then decrement the right pointer.
         }
   return false;                   //if no pair is found
    }
}
