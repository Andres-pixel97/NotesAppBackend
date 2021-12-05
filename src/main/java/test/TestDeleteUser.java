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
public class TestDeleteUser {
    public static void main(String[] args) {
        UserDao dao = new UserDao();
        
        boolean r = dao.delete(4);
        
        System.out.println(r ? "Row deleted" : "Error");
    }
}
