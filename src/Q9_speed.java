import java.util.Scanner;

public class Q9_speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance travelled in meters: ");
        float distance = sc.nextFloat();
        System.out.println("Enter the hours taken: ");
        float hour = sc.nextFloat();
        System.out.println("Enter the minutes taken: ");
        float minute = sc.nextFloat();
        System.out.println("Enter the seconds taken: ");
        float second = sc.nextFloat();
        float total_time_in_hour = ((second/60)+minute)/60+hour;

        float total_time_in_second = (((hour*60)+minute)*60)+second;
        System.out.println(distance/total_time_in_second+" is your speed in m/s.");
        System.out.println((distance/1000)/total_time_in_hour+" is your speed in m/h");
        System.out.println(((distance/1609)/total_time_in_hour)+"is your speed in miles/hour");


    }
}
