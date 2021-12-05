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
public class TestAddUser {
    public static void main(String[] args) {
        UserDao dao = new UserDao();
        
        User aux = new User();
        aux.setName("Karla");
        aux.setLastname("Garcia");
        aux.setEmail("email@email.com");
        aux.setPassword("pass123");
        
        boolean r = dao.add(aux);
        
        System.out.println(r ? "Row inserted" : "Error");
    }
}
