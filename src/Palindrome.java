import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String word;
        String reverse="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or Word");
        word = sc.nextLine();
        int length = word.length();
        for (int i = length-1; i>=0;i = i-1)
            reverse = reverse + word.charAt(i);
        if (word.equals(reverse))
            System.out.println(word+" is palindrome");
        else
            System.out.println(word+"is not a palindrome");

    }

}
