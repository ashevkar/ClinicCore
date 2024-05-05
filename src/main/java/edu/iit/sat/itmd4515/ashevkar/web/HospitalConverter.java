/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.iit.sat.itmd4515.ashevkar.web;

import edu.iit.sat.itmd4515.ashevkar.domain.Hospital;
import edu.iit.sat.itmd4515.ashevkar.service.HospitalService;
import jakarta.ejb.EJB;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.faces.convert.Converter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author ashevkar
 */
@FacesConverter(value = "hospitalConverter", managed = true)
public class HospitalConverter implements Converter<Hospital> {

    @EJB HospitalService hospitalSvc;

    /**
     *
     * @param context
     * @param component
     * @param value
     * @return
     */
    @Override
    public Hospital getAsObject(FacesContext context, UIComponent component, String value) {
        return hospitalSvc.read(Long.valueOf(value));            
    }

    /**
     *
     * @param context
     * @param component
     * @param value
     * @return
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component, Hospital value) {
        return String.valueOf(value.getId());
    }
    
}
