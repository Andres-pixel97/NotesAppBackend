/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.frontend;

import clientews.servicio.*;
import java.util.List;
import model.Note;

/**
 *
 * @author fabri
 */
public class Pruebas {

    public static void main(String[] args) {
        INoteDao n = new NoteDaoService().getNoteDaoPort();
        IUserDao no = new UserDaoService().getUserDaoPort();
        List l = n.getAll();
        //Pendiente no se puede convertir el 
        User u = (User) l.get(0);

        System.out.println(u.getName());

    }
}
