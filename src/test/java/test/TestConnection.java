/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import config.ConnectionDB;
import java.sql.Connection;

/**
 *
 * @author joang
 */
public class TestConnection {
    public static void main(String[] args) {
        Connection conn = ConnectionDB.getConnection();
    }
}
