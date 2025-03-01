import java.util.Scanner;
public class Board_exam_marks_to_Percentage {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int Totalmarks=0 ;
    float Percentage;
    int[] marks = new int[5];
    System.out.print("Enter 5 subjects marks: ");
    for(int i=0;i<5;i++){
        marks[i] = sc.nextInt();
    }
    for(int i=0;i<5;i++){
    Totalmarks += marks[i];
    }
    Percentage = Totalmarks / 5;
    System.out.println("Total marks : "+ Totalmarks);
    System.out.println("Percentage: "+Percentage);



}    
}
