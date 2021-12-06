import java.util.Scanner;

public class Q2_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or Word");
        String word= sc.nextLine();
        String reverse="";
        int length = word.length();
        for (int i = length-1; i>=0;i = i-1)
            reverse = reverse + word.charAt(i);
        if (word.equals(reverse))
            System.out.println(word+" is palindrome");
        else
            System.out.println(word+"is not a palindrome");

    }

}
