import java.util.*;
public class Union {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      //first array
      System.out.println("Enter the first array size: ");
      int n = sc.nextInt();
      int[] a = new int[n];
      System.out.println("Enter the elements of first array : ");
      int i;
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      //second array
      System.out.println("Enter the second array size: ");
      int m = sc.nextInt();
      int[] b = new int[m];
      System.out.println("Enter the elements of second array : ");
      int j;
      for(j=0;j<m;j++){
        b[j]=sc.nextInt();
      }
      System.out.println(CountIntersection(a, b));
    }    
    public static int CountIntersection(int a[], int b[]) {
      //sort the array's
        Arrays.sort(a);
        Arrays.sort(b);
         int i=0;
         int j=0;
      //since we need to count the no.of.elements common in both the array(intersection)
      //initialise count to 0
        int count =0;
      //loop the i till the last index of the first array and j till the index of the second array.
        while(i<a.length && j<b.length){
          //if the elements exists in the both array's then increment the count and move forward to check the remaining common elements
            if(a[i] == b[j]){
                count++;
                i++;
                j++;
            }
            else if (a[i]<b[j]){
                i++;
            }
            else
                j++;
        }
      //return the stored count value
        return count;
     }
}
