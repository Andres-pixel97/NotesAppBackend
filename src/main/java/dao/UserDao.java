/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebService;
import model.User;
import model.UserBuilder;
import interfaces.IUserDao;

/**
 *
 * @author joang
 */
@Stateless
@WebService(endpointInterface = "interfaces.IUserDao")
public class UserDao implements IUserDao {

    Connection conn = ConnectionDB.getConnection();
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<User> getAll() {
        ArrayList<User> list = new ArrayList<>();
        String query = "SELECT * FROM user;";
        UserBuilder builder = new UserBuilder();
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                User user = builder.withIduser(rs.getInt("iduser"))
                        .withName(rs.getString("name"))
                        .withLastname(rs.getString("lastname"))
                        .withEmail(rs.getString("email"))
                        .withPassword(rs.getString("password"))
                        .build();

                list.add(user);
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return list;
    }

    @Override
    public boolean verifyCredentials(String email, String pass) {
        String query = "SELECT * FROM user WHERE email= ? AND password= ? ;";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return false;
    }

    @Override
    public boolean add(User u) {
        String query = "INSERT INTO user(name, lastname, email, password) VALUES (?, ?, ?, ?);";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, u.getName());
            ps.setString(2, u.getLastname());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        String query = "DELETE FROM user WHERE iduser = ? ;";
        try {
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return false;
    }

    @Override
    public boolean update(User u) {
        String query = "UPDATE user SET name= ?, lastname= ?, email= ?, password= ? WHERE iduser= ?;";
        try {
            ps = conn.prepareStatement(query);
            ps.setString(1, u.getName());
            ps.setString(2, u.getLastname());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getPassword());
            ps.setInt(5, u.getIduser());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
        return false;
    }

}
