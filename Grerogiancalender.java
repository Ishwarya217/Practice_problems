//input : 2005-07-21
//output : 264
import java.util.Scanner;
public class Grerogiancalender{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a String :(YYYY-MM-DD) ");        
        String date = sc.nextLine();
        System.out.println(findday(date));
    }
    static final int[] days={31,28,31,30,31,30,31,31,30,31,30,31};          //initialise the days of the month in an array
    public static int findday(String date){
        int year =Integer.parseInt(date.substring(0,4));      
        int month =Integer.parseInt(date.substring(5,7));
        int day =Integer.parseInt(date.substring(8));
        if(month > 2 &&(year%4==0 && (year%100 !=0 ||year %400 == 0)))      //checking year is leap year or not 
            day++;                                                          //if leap then add 1 more day in febraury month
        for(int i=0;i<=month;i++){                                          
            day+=days[i];                                                   //day count 
        }
        return day;
    }
    }

        
   
