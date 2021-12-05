/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UserDao;

/**
 *
 * @author joang
 */
public class TestVerifyCredentials {
    public static void main(String[] args) {
        UserDao dao = new UserDao();
        
        boolean r = dao.verifyCredentials("email@email.com", "123");
        
        System.out.println(r ? "Credentials Verified" : "Error");
    }
}
