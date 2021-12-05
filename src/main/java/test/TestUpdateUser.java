/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UserDao;
import model.User;

/**
 *
 * @author joang
 */
public class TestUpdateUser {

    public static void main(String[] args) {
        UserDao dao = new UserDao();

        User aux = new User();
        aux.setIduser(7);
        aux.setName("Karla Andrea");
        aux.setLastname("Garcia Hernandez");
        aux.setEmail("email@email.com");
        aux.setPassword("123");
        
        boolean r = dao.update(aux);
        
        System.out.println(r ? "Row updated" : "Error");
    }

}
