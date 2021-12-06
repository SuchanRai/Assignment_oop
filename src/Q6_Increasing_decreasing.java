import java.util.Scanner;

public class Q6_Increasing_decreasing {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int no1 = sc.nextInt();
        System.out.println("Enter the number: ");
        int no2 = sc.nextInt();
        System.out.println("Enter the number: ");
        int no3= sc.nextInt();
        if (no1>no2 & no2>no3){
            System.out.println("The number are in descending order");
        }
        else if (no1<no2 & no2<no3){
            System.out.println("The numbers are in asscending: ");
        }
        else {
            System.out.println("The numbers are in neither asceding nor descending order.");
        }

    }
}
