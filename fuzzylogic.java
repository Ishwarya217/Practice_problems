import java.util.Scanner;
public class fuzzylogic{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("enter the weight of the clothes (grams): ");
int weight=sc.nextInt();
System.out.print("enter the water level(L,M,H): ");
char waterlevel = sc.next().charAt(0);

if(weight <0)           //weight input value is negative 
System.out.println("Invalid weight");
else if(weight==0)      //weight input value is zero
System.out.println("time estimation is 0 minutes");
else if(weight>7000)    //if weight input value exceeds the max limit
System.out.println("weight overloaded..");
else {
int time =0;            //Initialise time
switch(waterlevel){     //using switch case we can the different waterlevel 
case 'L':
//ternary operator
time= (weight<=2000 )? 25:0;    //if weight is less than 2000 grams then return time is 25minutes else 0
break;
case 'M':
time= (weight>=2001 && weight < 4000)? 35:0;    //if weight is in between  2001 and 4000 grams then return time is 35minutes else 0
break;
case 'H':
time= (weight >=4000 && weight <7000)? 45:0;   //if weight is in between  4000 and 7000 grams then return time is 45minutes else 0
break;
default:
    System.out.println("invalid weight....");
    return;
}
if(time >0)
System.out.println("time estimation: " + time +" minutes");     //display time
else
System.out.println("invalid value..");
}
}
}








