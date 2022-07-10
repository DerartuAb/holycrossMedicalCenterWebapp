package miu.edu.cs.cs425.holycrossmedicalcenter.controller;


import miu.edu.cs.cs425.holycrossmedicalcenter.service.implementation.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class HomeController {
    @Autowired
    PatientService patientService;

    @GetMapping(value = {"/","/home"})
    public String displayHomepage (){
        return "home/index";
    }



    }
