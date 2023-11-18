package excercise2;

import java.time.LocalDateTime;
import java.time.Period;


public class Employee implements Person {
    private LocalDateTime dateOfEmployemnt;
    private String position;
    private String personFirstName;
    private String personLastName;
    private LocalDateTime personDateOfBirth;
    private String personAddress;
    private LocalDateTime age;

    public Employee(LocalDateTime dateOfEmployemnt, String position, String personFirstName, String personLastName, LocalDateTime personDateOfBirth, String personAddress) {
        this.dateOfEmployemnt = dateOfEmployemnt;
        this.position = position;
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.personDateOfBirth = personDateOfBirth;
        this.personAddress = personAddress;
        this.age=age;
    }

    public LocalDateTime getDateOfEmployemnt() {
        return dateOfEmployemnt;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String firstName() {
        return personFirstName;
    }

    @Override
    public String lastName() {
        return personLastName;
    }

    @Override
    public LocalDateTime birthDay() {
        return personDateOfBirth;
    }

    @Override
    public String address() {
        return personAddress;
    }

   /* public Period personAge(){
        LocalDateTime currentTime = LocalDateTime.now();
        Period age = Period.between(currentTime, personDateOfBirth);
        return age;
    }*/

}
