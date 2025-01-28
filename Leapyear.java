import java.util.Scanner;
class Leapyear{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int year=sc.nextInt();
    System.out.println(isLeap(year));
  }
    static boolean isLeap(int n) {
        if((n%4==0 && n%100 !=0)||(n%400 ==0))  //check the year is divisible by 4 and it is not an century or check year id divisble by 400 thus it is leap year
            return true;
        else
            return false;
    }
}
