//Input: arr[] = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
import java.util.*;
class Threesum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter ur target: ");
        int target = sc.nextInt();
        System.out.println(threeSum(arr,target));
            }
        public static List<List<Integer>> threeSum(int[] arr,int target) {
        Arrays.sort(arr);      //sorting the array
        //List to store the final result of unique triplets.
        List<List<Integer>> result = new ArrayList<>();
        // Set to ensure that only unique triplets are added to the result.
        Set<List<Integer>> s= new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int left = i+1;    
            int right =n-1;
          // While loop to find triplets using the two-pointer technique
            while(left < right){
                int sum = arr[i] + arr[left]+ arr[right];  //Calculating the sum of the current triplet.
                int sum = arr[i] + arr[left]+ arr[right];  
                if(sum == target ){
                    s.add(Arrays.asList(arr[i],arr[left],arr[right]));
                    left++;
                    right--;
                }
                else if (sum< target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        result.addAll(s);
        return result;
    }
}
