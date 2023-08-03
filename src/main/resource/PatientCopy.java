import java.time.LocalDate;
import java.time.LocalTime;

public class PatientCopy {
    private String name; 
    private int age;
    private String phoneNo;
    private LocalTime temptime;
    private LocalDate date;
    PatientCopy(String name,int age,String phoneNo,LocalTime temptime,LocalDate date) {
        
        //'this.name' refers to the instance variable 'name',
        //and 'name' refers to the parameter 'name'.  
        this.name=name;
        this.age=age;
        this.phoneNo=phoneNo;
        this.temptime=temptime;
        this.date=date;
        
        
    }
    public String toString() {
        return name + "\t" +age +"\t"+ phoneNo +"\t"+temptime+"\t"+date;
    }
}
