import java.util.Scanner;

public class Q10_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three digit number: ");
        int number = sc.nextInt();
        int no1 = number%10;
        int no2 = (number/10)%10;
        int no3 = number/100;
        int sum = (no1*no1*no1)+(no2*no2*no2)+(no3*no3*no3);
        if (number == sum){
            System.out.println(number +" is armstrong number.");
        }
        else{
            System.out.println(number+" is not armstrong number");
        }
    }
}
