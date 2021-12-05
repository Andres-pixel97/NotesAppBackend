/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testNotes;

import dao.NoteDao;

/**
 *
 * @author Miguel
 */
public class TestDeleteNote {
    
    public static void main(String[] args) {
        NoteDao dao = new NoteDao();
        
        System.out.println(dao.getAll().toString());
        
        System.out.println("--- Deleting note with id 1 ---");
        
        dao.delete(1);
        
        System.out.println(dao.getAll().toString());

    }
}
