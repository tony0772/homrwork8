package excercise2;


import java.time.LocalDateTime;

public class Programmer extends Employee {
    private String language;
    private String fullName;

    public Programmer(LocalDateTime dateOfEmployemnt, String position, String personFirstName, String personLastName, LocalDateTime personDateOfBirth, String personAddress, String language) {
        super(dateOfEmployemnt, position, personFirstName, personLastName, personDateOfBirth, personAddress);
        this.language = language;
        this.fullName=fullName;
    }

    public String getLanguage() {
        return language;
    }

    public String personFullName() {
        String fullName = firstName() + " " + lastName();
        return fullName;
    }

}
