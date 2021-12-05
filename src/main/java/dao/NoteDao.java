/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.List;
import model.Note;
import config.ConnectionDB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import interfaces.IUserDao;

/**
 *
 * @author joang
 */
public class NoteDao{ // Crear y usar interface INoteDao
    Connection conn = ConnectionDB.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
//    @Override
//    public List<Note> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean add(Note object) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean delete(int id) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public boolean update(Note n) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
