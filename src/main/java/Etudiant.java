

public class Etudiant extends Personne {

    private int noteGlobal;

    public int getNoteGlobal() {
        return noteGlobal;
    }

    public void setNoteGlobal(int noteGlobal) {
        this.noteGlobal = noteGlobal;
    }

    @Override
    public int evaluation() {
        return noteGlobal;
    }
}
