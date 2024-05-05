/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.iit.sat.itmd4515.ashevkar.service;

import edu.iit.sat.itmd4515.ashevkar.domain.Hospital;
import edu.iit.sat.itmd4515.ashevkar.domain.Patient;
import edu.iit.sat.itmd4515.ashevkar.security.User;
import jakarta.ejb.Stateless;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author ashevkar
 */
@Named
@Stateless
public class PatientService extends AbstractService<Patient>{   
    
    @PersistenceContext(name = "itmd4515PU")
    private EntityManager em;
    
    /**
     *
     */
    public PatientService() {
        super(Patient.class);  
    }
    private static final Logger LOG = Logger.getLogger(PatientService.class.getName());
    
    /**
     *
     * @return
     */
    public List<Patient> findAll(){
        return super.findAll("Patient.findAll");
    }  
    
    /**
     *
     * @param username
     * @return
     */
    public Patient findByUsername(String username){
        return em.createNamedQuery("Patient.findByUsername",Patient.class).setParameter("uname", username).getSingleResult();
    }   

    /**
     *
     * @param p
     */
    public void editPatient(Patient p){
        Patient managedRef = em.getReference(Patient.class, p.getId());
        managedRef.setName(p.getName());
        managedRef.setBirthDate(p.getBirthDate());
        managedRef.setGender(p.getGender());
        
        em.merge(managedRef);
    }

    /**
     *
     * @param p
     */
    public void deletePatient(Patient p) {
        Patient patient = em.getReference(Patient.class, p.getId());
        em.remove(patient);
    }
    
    /**
     *
     * @param hospital
     * @param patient
     */
    public void createPatient(Hospital hospital, Patient patient) {
        em.persist(patient);
        Hospital hospitalRef = em.getReference(Hospital.class, hospital.getId());
        hospitalRef.addPatient(patient);
        em.merge(hospitalRef);
    }
    
    /**
     *
     * @param p
     */
    public void create(Patient p){ 
        em.persist(p); 
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Patient read(Long id){
        return em.find(Patient.class, id);
    }
    
    /**
     *
     * @param p
     */
    public void update(Patient p){
        em.merge(p);
    }
    
    /**
     *
     * @param p
     */
    public void delete(Patient p){
        em.remove(em.merge(p));
    }   

    /**
     *
     * @param user
     * @param patient
     */
    public void createNewPatient(User user, Patient patient) {
        
        em.persist(patient);
    }
}
