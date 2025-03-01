import java.util.Scanner;
public class ATM {
    public static void main(String args[]){
        double totalamt;
        int hundreds, fivehundreds, thousands;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of.100 rupees notes: ");
        hundreds = sc.nextInt();
        System.out.println("Enter the no.of.500 rupees notes: ");
        fivehundreds = sc.nextInt();
        System.out.println("Enter the no.of.1000 rupees notes: ");
        thousands = sc.nextInt();
        totalamt = (hundreds*100) + (fivehundreds*500) + (thousands*1000);
        System.out.println("The amt withdrawn by the user: "+ totalamt);
    }
    
}
