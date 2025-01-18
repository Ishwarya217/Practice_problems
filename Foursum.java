import java.util.*;
class Foursum{
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
        System.out.println(fourSum(arr,target));
            }
                  
    public static List<List<Integer>> fourSum(int[] arr, int target) {
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(arr);           //sorting
            int n=arr.length;           //arrray length
            for(int i=0;i<n-3;i++){
            //skip for duplicates for i and j
            if(i>0 && arr[i]==arr[i-1])  continue;
            for(int j=i+1;j<n-2;j++){     //j points to the next element of i
            if(j>i+1 && arr[j]==arr[j-1])
                continue;
            int left =j+1;           //left pointer will be next to the j 
            int right =n-1;         //right pointer will be the element in the last index
            while(left < right){
                int sum = arr[i]+arr[j]+arr[left]+arr[right];   //sum of the 4 elements
                if(sum == target){
                    result.add(Arrays.asList(arr[i],arr[j],arr[left],arr[right]));  //adding the quadruplet to teh list
                    left++;
                    right--;
                //skip the duplicats for left and right
                while(left < right && arr[left] == arr[left -1]) left++;
                while(left < right && arr[right] == arr[right +1]) right--;
            }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                    }
                    }   
                 }
            }
            return result;
            }
        }
