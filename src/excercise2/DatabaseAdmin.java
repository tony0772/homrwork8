package excercise2;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;
    private String fullName;
    public DatabaseAdmin(LocalDateTime dateOfEmployemnt, String position, String personFirstName, String personLastName, LocalDateTime personDateOfBirth, String personAddress) {
        super(dateOfEmployemnt, position, personFirstName, personLastName, personDateOfBirth, personAddress);
        this.dbTechnology=dbTechnology;
        this.fullName=fullName;
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
    public String address(){
        super.address();
        System.out.println("db admin." + address());
        return address();
    }
    public String personFullName() {
        String fullName = firstName() + " " + lastName();
        return fullName;
    }
}
