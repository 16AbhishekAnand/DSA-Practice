import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    
    public static void main(String args[]) {
    
        Scanner inp = new Scanner(System.in);
        
        ArrayList<PatientCopy> patientdetails = new ArrayList<PatientCopy>();
        
        System.out.println("Doctors Day & Timmig : Mon-Fri :- 9:00am-6:00pm");
        
        int meetTime=0;
        while(true) {
            System.out.println("The average time on each patient is 20 min");
            System.out.println("Type 'confirm' to continue else 'exit'.");
            
            String choice = inp.next();
            if(choice.equalsIgnoreCase("exit")){
                System.out.println("Thanks for your time");
                break;
            }

            if(choice.equalsIgnoreCase("confirm")) {
            System.out.println("***Enter the patientDetails***");
            System.out.println("Name: ");
            String name = inp.next();
            System.out.println("Age: ");
            int age = inp.nextInt();
            System.out.println("Phoneno: ");
            String phno = inp.next();
            /* new PatientDetails(name, age, phno): This part creates a new PD object using the constructor of the PD class. 
            The constructor takes three parameters: name, age, and phno. These parameters are provided from the user input 
            when the program is running. So, this part creates a new PD with the given name, age, and phno.
            The patientdetails here is an ArrayListt that stores Student objects. <generic>*/ 
            
            LocalDate date = LocalDate.now();
            LocalTime temptime = null;
            String inptime = "09:00";
            DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
            temptime = LocalTime.parse(inptime,dtf1);
            if(meetTime==0) {
                //System.out.println(date+"\t"+temptime);
                patientdetails.add(new PatientCopy(name,age,phno,temptime,date));
            }
            else {
                temptime = temptime.plusMinutes(meetTime);
                patientdetails.add(new PatientCopy(name, age,phno,temptime,date));
            }
            meetTime+=20;

            }
            else {
                System.out.println("Give valid input");
            }
            
        }

        for(PatientCopy details :patientdetails) {
            System.out.println("* "+details);
        }
        
        inp.close();
    }    
}
    

