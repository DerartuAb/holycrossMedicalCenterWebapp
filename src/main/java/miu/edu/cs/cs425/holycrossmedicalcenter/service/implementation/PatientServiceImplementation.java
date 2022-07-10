package miu.edu.cs.cs425.holycrossmedicalcenter.service.implementation;

import miu.edu.cs.cs425.holycrossmedicalcenter.model.Patient;
import miu.edu.cs.cs425.holycrossmedicalcenter.repository.PatientRepository;
import org.aspectj.weaver.ast.Var;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImplementation implements PatientService {
   private PatientRepository patientRepository;


  public PatientServiceImplementation(PatientRepository patientRepository){
      this.patientRepository = patientRepository;
  }

    @Override
    public Patient addNewPatient(Patient patient) {
        var newPatient = patientRepository.save(patient);
        return newPatient;

    }

    @Override
    public List<Patient> getAllPatient() {
      var patients = patientRepository.findAll();
        return  patients;
    }
}
