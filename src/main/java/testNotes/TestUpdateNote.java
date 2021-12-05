/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testNotes;

import dao.NoteDao;
import model.Note;
import model.NoteBuilder;

/**
 *
 * @author Miguel
 */
public class TestUpdateNote {
    
    public static void main(String[] args) {
        NoteDao dao = new NoteDao();
        NoteBuilder builder = new NoteBuilder();
        
        Note nota = builder.withIdnote(2).
                                withTitle("nuevo título").
                                withContent("el nuevo contenido de la nota 2").
                                build();
        
        System.out.println(dao.getAll().toString());
        System.out.println("--- Updating note with id 2 ---");
        
        dao.update(nota);
        
        System.out.println(dao.getAll().toString());
        
    }
}
