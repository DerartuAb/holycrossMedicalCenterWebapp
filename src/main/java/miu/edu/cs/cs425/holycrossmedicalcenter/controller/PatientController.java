package miu.edu.cs.cs425.holycrossmedicalcenter.controller;

import miu.edu.cs.cs425.holycrossmedicalcenter.model.Patient;
import miu.edu.cs.cs425.holycrossmedicalcenter.service.implementation.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    private Patient patientList;

    public ModelAndView showPatientList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Patient> patientList = patientService.getAllPatient();
        modelAndView.addObject("patient",patientList);
        modelAndView.setViewName("patient/list");
        return modelAndView;
    }


}