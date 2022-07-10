package miu.edu.cs.cs425.holycrossmedicalcenter;

import miu.edu.cs.cs425.holycrossmedicalcenter.model.Patient;
import miu.edu.cs.cs425.holycrossmedicalcenter.repository.PatientRepository;
import miu.edu.cs.cs425.holycrossmedicalcenter.service.implementation.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
public class HolyCrossMedicalCenterApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;


    private PatientService patientService;

     public HolyCrossMedicalCenterApplication(PatientService patientService){
         this.patientService= patientService;
     }



    public static void main(String[] args) {
        SpringApplication.run(HolyCrossMedicalCenterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is a test");

        Patient patient1 = new Patient(null,"9999278","yes","Jomal Hassan","JomalHason@gmail","2025605428", LocalDate.of(1991, Month.APRIL,20));
        System.out.println(createNewPatient(patient1));
        patientRepository.save(patient1);

        Patient patient2 = new Patient(null,"6789000","No"," Don Smith","DonSmith@gmali","20258903489", LocalDate.of(1989, Month.JANUARY,25));
        System.out.println(createNewPatient(patient2));
        patientRepository.save(patient2);
        Patient patient3 = new Patient(null,"55555338","yes","John Keven","JohnKeven@gmal","3015607541", LocalDate.of(1981, Month.DECEMBER,5));
        patientRepository.save(patient3);
    }

    private Patient createNewPatient(Patient patient){
        return patientService.addNewPatient(patient);

    }
    private void printAllPatient(){
         var patients = patientService.getAllPatient();
    }
}
