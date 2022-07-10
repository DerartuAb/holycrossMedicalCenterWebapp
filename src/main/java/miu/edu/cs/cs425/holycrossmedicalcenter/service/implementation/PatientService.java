package miu.edu.cs.cs425.holycrossmedicalcenter.service.implementation;

import miu.edu.cs.cs425.holycrossmedicalcenter.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    public abstract Patient addNewPatient(Patient patient);
    public abstract List<Patient> getAllPatient();

}
