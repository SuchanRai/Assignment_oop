import java.util.Scanner;

public class rectrangle {
    public static void main(String[] args) {
        System.out.println("1");
        square();
        System.out.println("2");
        HollowSquareStarPattern();
        System.out.println("3");
        pyramidStarPattern();
        System.out.println("4");
        invalidPyramidStarPattern();

    }
    public static void square() {

        for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }
    }

    public static void HollowSquareStarPattern() {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= 5; j++)
                if((i==1 || i==5) || (j==1 || j==5))
                    System.out.print("*");
                else
                    System.out.print(" ");

            System.out.println();

        }


    }

    public static void pyramidStarPattern() {
        int row = 5;
        int j;
        int i;
        for (i = 0; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invalidPyramidStarPattern(){
        int rows = 5;
        for (int i= 0; i<= rows-1; i++)
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=rows-1-i; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }
}
