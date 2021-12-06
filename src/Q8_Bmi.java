import java.util.Scanner;

public class Q8_Bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kilogram: ");
        float weight = sc.nextFloat();
        System.out.println("Enter your height in feet: ");
        float height = sc.nextFloat();
        float meter = height/3.2808F;
        float BMI = weight/(meter*meter);
        System.out.println("your BMI is"+BMI);

    }
}
