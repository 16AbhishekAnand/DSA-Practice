import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.Scanner;

public class SetDateTime {
    public static void main(String args[]) {
        LocalDate ld = null;
        Scanner inp = new Scanner(System.in);
        System.out.println("yyy-MM-dd");
        String datetime = inp.nextLine();
        inp.close();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        ld = LocalDate.parse(datetime,dtf); // parse->take out given DT value from data.
        System.out.println(" manually setup date "+ld);

        System.out.println("Set your date and time manually");  
        LocalDateTime ldt = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("yyyy-MM-dd-HH-mm");
        String dt = sc.nextLine();
        sc.close();
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm");
        ldt = LocalDateTime.parse(dt,dtf1); // converting string inp to DateTimefomat.
        System.out.println("Date and Time is fixed "+ldt);

        // operatins on DateTime & Calender i.e can be incremented and decremented.
        LocalDateTime ldt1 = ldt.plusHours(1);
        System.out.println("new hr : "+ldt1);
    }
    
}
