/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.iit.sat.itmd4515.ashevkar.security;

import edu.iit.sat.itmd4515.ashevkar.service.AbstractService;
import jakarta.ejb.Stateless;
import jakarta.inject.Named;
import java.util.List;

/**
 *
 * @author ashevkar
 */
@Named
@Stateless
public class UserService extends AbstractService<User>{

    /**
     *
     */
    public UserService() {
        super(User.class);
        }

    /**
     *
     * @return
     */
    public List<User> findAll(){
        return super.findAll("User.findAll");
    }

    /**
     *
     * @param u
     */
    public void create( User u) {
        em.persist(u);
    }
    
}