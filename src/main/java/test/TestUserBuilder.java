/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.User;
import model.UserBuilder;

/**
 *
 * @author joang
 */
public class TestUserBuilder {
    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder();
        
        User user = builder.withIduser(12)
                .withName("Pedro")
                .withLastname("Perez")
                .withEmail("correo@correo.com")
                .withPassword("12345")
                .build();
        
        System.out.println(user.toString());
    }
}
