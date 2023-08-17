import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Scanner;
import java.util.Timer;

public class SimpleTest {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the Appointment time in 'hh:mm'");
        String time = inp.next();
        System.out.println("Enter the distance");
        int dis = inp.nextInt();
        System.out.println("Enter the avg speed");
        int speed = inp.nextInt();
        int arrivalTime = dis/speed;
        System.out.println(arrivalTime);




    }
}
