import java.util.Scanner;

public class Q3_Asscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's number: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++) {
            str[i] = new String(sc.next());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String tempt = str[i];
                    str[i] = str[j];
                    str[j] = tempt;

                }
            }
        }
        System.out.println("sorted list of strings is; ");
        for (int i = 0; i < n; i++){
            System.out.println(str[i]);
        }

    }

}

