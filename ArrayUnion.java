import java.util.*;
public class ArrayUnion {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the first array size: ");
      int n = sc.nextInt();
      int[] a = new int[n];
      System.out.println("Enter the elements of first array : ");
      int i;
      for(i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      System.out.println("Enter the second array size: ");
      int m = sc.nextInt();
      int[] b = new int[m];
      System.out.println("Enter the elements of second array : ");
      int j;
      for(j=0;j<m;j++){
        b[j]=sc.nextInt();
      }
      System.out.println(findUnion(a, b));
    }    
    public static int findUnion(int a[], int b[]) {
        //use a hashset to sore all the elements
        Set<Integer> s= new HashSet<>();
        // Insert all the elements of the first array into the HashSet.
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        // Insert all the elements of the second array into the HashSet.
        //hashset automatically handles the duplicates.
        for(int i=0;i<b.length;i++){
            s.add(b[i]);
        }
        //return the size of the elements in the hashset
         return s.size();
     }
}
