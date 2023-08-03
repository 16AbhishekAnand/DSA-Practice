import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class DateFormat {
    public static void main(String args[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd"); // prints date and time
        String check = sdf.format(new Date());
        System.out.println(check);

        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:ss");
        String test = sdf1.format(new Date());
        System.out.println(test);
        /* y = year(yyyy); d= date in month(dd); H = hour(0-23)(HH); s = seconds(ss) */
        
        /* M = Month(MM); h=hour(0-12)(hh); m = minute in hour(mm); S = millisecond(SSS) */
        
        LocalDate  currentDate = LocalDate.now(); // current date
        LocalTime userInputTime = null;

        Scanner inp = new Scanner(System.in);
        String inptime = inp.nextLine();
        inp.close();
        /* DateTimeFormatter defines how the string will be 
        converted into LocalTime instance */
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        userInputTime = LocalTime.parse(inptime,dtf);
        // merging the LocalDate&LocalTime
        System.out.println(currentDate+" "+userInputTime);
        System.out.println("manually setup "+userInputTime);
        //java.time.format.DateTimeParseException if the entered 
        //string by the user does not satisfy the required format.
    }

    
}
