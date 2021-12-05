package testNotes;

import dao.NoteDao;

/**
 *
 * @author Miguel
 */
public class TestGetAllNotes {
    
    public static void main(String[] args) {
        NoteDao dao = new NoteDao();
        
        System.out.println(dao.getAll().toString());
    }

}
