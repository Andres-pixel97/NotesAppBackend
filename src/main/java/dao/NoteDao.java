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
import interfaces.INoteDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.jws.WebService;
import model.NoteBuilder;

/**
 *
 * @author joang
 */
@Stateless
@WebService(endpointInterface = "interfaces.INoteDao")
public class NoteDao implements INoteDao{ // Crear y usar interface INoteDao
    Connection conn = ConnectionDB.getConnection();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<Note> getAll() {
        ArrayList<Note> list = new ArrayList<>();
        String query = "SELECT * FROM note;";
        NoteBuilder builder = new NoteBuilder();
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Note note = builder.withIduser(rs.getInt("iduser"))
                        .withIdnote(rs.getInt("idnote"))
                        .withContent(rs.getString("content"))
                        .withTitle(rs.getString("title"))
                        .build();

                list.add(note);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return list;
    }
    
    @Override
    public List<Note> getAllByUser(int userid) {
        ArrayList<Note> list = new ArrayList<>();
        String query = "SELECT * FROM note WHERE iduser = " + userid + " ;";
        NoteBuilder builder = new NoteBuilder();
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Note note = builder.withIduser(rs.getInt("iduser"))
                        .withIdnote(rs.getInt("idnote"))
                        .withContent(rs.getString("content"))
                        .withTitle(rs.getString("title"))
                        .build();

                list.add(note);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return list;
    }
    
    @Override
    public boolean add(Note n) {
        String query = "INSERT INTO note (iduser, title, content) VALUES (?, ?, ?);";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, n.getIduser());
            ps.setString(2, n.getTitle());
            ps.setString(3, n.getContent());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return false;
    }

    @Override
    public boolean delete(int idnote) {
        String query = "DELETE FROM note WHERE idnote = ? ;";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, idnote);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return false;
    }

    @Override
    public boolean update(Note n) {
        String query = "UPDATE note SET title= ?, content= ? WHERE idnote= ?;";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, n.getTitle());
            ps.setString(2, n.getContent());
            ps.setInt(3, n.getIdnote());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return false;
    }

}
