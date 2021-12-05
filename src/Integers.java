import java.util.Scanner;
import java.util.StringTokenizer;

public class Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sequence of integers with space between " +
                "them;  ");
        String no = sc.nextLine();
        StringTokenizer numbers = new StringTokenizer(no);
        int sum = 0;
        System.out.println("The sequence is: ");
        while(numbers.hasMoreTokens()) {
            String s = numbers.nextToken();
            int digit = Integer.parseInt(s);
            System.out.println(digit + " ");
            sum = sum + digit;
        }
        System.out.println("Sum "+sum);


    }
}
