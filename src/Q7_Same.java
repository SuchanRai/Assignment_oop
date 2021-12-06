import java.util.Scanner;

public class Q7_Same {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the floating number: ");
        float no1 = sc.nextFloat();
        System.out.println("Enter the floating number: ");
        float no2 = sc.nextFloat();
        if (Math.abs(no1-no2)<=0.01){
            System.out.println("They are same");
        }
        else{
            System.out.println("they are different");
        }
    }


}
