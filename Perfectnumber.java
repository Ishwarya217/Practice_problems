//perfect number 
//input : num=6 
//ouput : true
//1+2+3(sum) == 6(num)
import java.util.Scanner;
public class Perfectnumber{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(checkperfectnumber(num));
  }
    public static boolean checkperfectnumber(int num){
        int sum=0;                  //initilize the sum to 0
        for(int i=1;i<num;i++){     //start iterating from 1 to less than the num
            if(num % i == 0){       //check whether the number is divisible by i. if so, then add i to the sum
                sum += i;
            }}
            if(sum == num)          //check whether the obtained sum equal to the input number
                return true;        //then return true
            else 
                return false;       //else return false
    }
}
