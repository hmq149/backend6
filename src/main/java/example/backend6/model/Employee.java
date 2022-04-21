package example.backend6.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "employee3")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String emailID;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String emailID) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailID = emailID;
    }
}
