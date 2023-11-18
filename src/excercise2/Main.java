package excercise2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Programmer person1 = new Programmer(LocalDateTime.of(2022, Month.MARCH,5, 18,24,56),"programmer","Stefan", "Andrei", LocalDateTime.of(1987, Month.APRIL, 18, 9,25,42), "Strada Vadului nr 46, Cluj-Napoca", "Java");
        System.out.println(person1.getDateOfEmployemnt());
        System.out.println(person1.personFullName());
    }
}
