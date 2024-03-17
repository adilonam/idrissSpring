package uiz.ac.ma.idrissspring.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    private String registrationNumber;


    private Date dateOfBirth;

    private String CIN;

    @OneToOne(mappedBy = "driver")
    private DrivingLicense drivingLicense;

}
