//Enter the price: 10000
//Total price of the product = 12000.0 [totalprice = price + CGST + SGST]
import java.util.*;
public class CGST_SGST {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        double price, totalprice, CGST, SGST;
        System.out.print("Enter the price: ");
        price = sc.nextDouble();
        CGST = price * 0.09;        //CGST = 9%
        SGST = price * 0.11;        //SGST = 11%
        totalprice = price + CGST + SGST;
        System.out.println("Total price of the product = "+ totalprice);
    }
}
