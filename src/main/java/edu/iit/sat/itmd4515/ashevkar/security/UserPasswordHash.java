/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.iit.sat.itmd4515.ashevkar.security;

import jakarta.inject.Inject;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.security.enterprise.identitystore.Pbkdf2PasswordHash;

/**
 *
 * @author ashevkar
 */
public class UserPasswordHash {
    @Inject private Pbkdf2PasswordHash hash;
    
    @PrePersist
    @PreUpdate
    private void hashPassword(User u){
        u.setPassword(hash.generate(u.getPassword().toCharArray()));
    }
}
    

