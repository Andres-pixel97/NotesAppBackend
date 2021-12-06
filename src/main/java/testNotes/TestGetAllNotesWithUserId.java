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
public class TestGetAllNotesWithUserId {
        
    public static void main(String[] args) {
        NoteDao dao = new NoteDao();
        
        System.out.println(dao.getAllByUser(7).toString());
    }

}
