package miu.edu.cs.cs425.holycrossmedicalcenter.repository;


import miu.edu.cs.cs425.holycrossmedicalcenter.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
}
