/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.iit.sat.itmd4515.ashevkar.web;

import edu.iit.sat.itmd4515.ashevkar.domain.Patient;
import edu.iit.sat.itmd4515.ashevkar.security.User;
import edu.iit.sat.itmd4515.ashevkar.security.UserService;
import edu.iit.sat.itmd4515.ashevkar.service.HospitalService;
import edu.iit.sat.itmd4515.ashevkar.service.PatientService;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.logging.Logger;

/**
 *
 * @author ashevkar
 */
@Named
@RequestScoped
public class SignUpController {
    private static final Logger LOG = Logger.getLogger(SignUpController.class.getName());

    @EJB UserService userSvc;
    @EJB PatientService patientSvc;
    private User user;
    private Patient patient = new Patient();

    /**
     *
     */
    public SignUpController() {      
    }  

    /**
     *
     * @return
     */
    public String savePatient() {
            LOG.info("Attempting to save user and patient information");
//            this.user=new User();
//            this.user=new User();
//            patient.setUser(user);  
//            userSvc.create(user);
            patientSvc.create(patient);  
            LOG.info("Patient and User saved successfully");
            return "/admin/welcome.xhtml";
    }    
    
    /**
     *
     * @return
     */
    public Patient getPatient() {
        LOG.info("In getPatient");
        return patient;
    }

    /**
     *
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     *
     * @return
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     */
    public void setUser(User user) {
        this.user = user;
    }
}

    

    
    
    
    


    
   

