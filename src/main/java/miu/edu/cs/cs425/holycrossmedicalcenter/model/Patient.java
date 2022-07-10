package miu.edu.cs.cs425.holycrossmedicalcenter.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Patient")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @Column(name ="patientNumber", nullable=false)
    private String patientNumber;
    @Column(name = "isAnOutPatient", nullable = false)
    private String isAnOutPatient;
    @Column(name ="fullName", nullable =false)
    private String fullName;

    private String emailAddress;
    private String contactNumber;

    @Column(name = "dateOfBirth",nullable = false)
    private LocalDate dateOfBirth;
}
