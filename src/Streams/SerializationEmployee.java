package Streams;

import java.io.Serializable;
import java.time.LocalDate;

public class SerializationEmployee implements Serializable {
    private String firstName, lastName;
    private int age;
    private LocalDate joiningDate;

    public SerializationEmployee(String firstName, String lastName, int age, LocalDate joiningDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "SerializationEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", joiningDate=" + joiningDate +
                '}';
    }
}


