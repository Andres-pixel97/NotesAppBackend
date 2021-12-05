package testNotes;

import dao.NoteDao;
import model.Note;
import model.NoteBuilder;

/**
 *
 * @author Miguel
 */
public class TestAddNote {
    
    public static void main(String[] args) {
        NoteDao dao = new NoteDao();
        NoteBuilder builder = new NoteBuilder();
        
        Note nuevanota = builder.withIduser(7).
                                withTitle("otra nota").
                                withContent("nueva nota del usuario 7").
                                build();
        
        dao.add(nuevanota);
    }
}
