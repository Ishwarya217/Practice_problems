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
        System.out.println(hasTripletSum(arr,target));
    }
    public static boolean hasTripletSum(int arr[], int target) {
      
        Arrays.sort(arr);    //sort the array
        //to find the triplet sum we are using i,left,right as pointers
        for(int i =0;i<arr.length;i++){
            int left =i+1;  //left pointer points the element next to the i
            int right =arr.length-1;
            while(left < right ){
              //arr[i] + arr[left] +arr[right] = target
              //arr[left] + arr[right] = target -arr[i]
                int requiredsum =target -arr[i];
                int sum =arr[left]+arr[right];
                if( sum==requiredsum)     //comparing sum and required sum value if both are equal then return true
                {  
                    return true;
                }
                else if(sum <requiredsum){    //if sum is lesser than the requiredsum then move the left pointer(increment)  
                    left++;
                }
                else{
                    right--;                  //if sum is greater than the requiredsum then move the right pointer(decrement) 
                }
            }
        }
        return false;
      }
  }
    
