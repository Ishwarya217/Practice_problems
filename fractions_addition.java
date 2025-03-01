import java.util.*;
public class fractions_addition {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter num1 : ");
        float num1 = sc. nextFloat();
        System.out.print("enter num2 : ");
        float num2 = sc. nextFloat();
        float sum = num1 +num2;
        float fraction = sum -(int)sum;
        System.out.printf("%.10f",fraction);
    }
}

