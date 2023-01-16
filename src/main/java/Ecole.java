import java.util.ArrayList;
import java.util.List;

public class Ecole {

    private String nom = "Super app !";
    public List<Etudiant> listeEtudiant = new ArrayList<>();
    private List<Prof> listeProf = new ArrayList();

    private static Ecole instance = null;

    private Ecole(){
        Etudiant etudiant1 = new Etudiant();
        Etudiant etudiant2 = new Etudiant();
        Etudiant etudiant3 = new Etudiant();

        listeEtudiant.add(etudiant1);
        listeEtudiant.add(etudiant2);
        listeEtudiant.add(etudiant3);

        Prof prof = new Prof();
        prof.ajoutEtudiant(etudiant1, etudiant2);

    }

    public static Ecole getInstance() {
        if(instance == null) {
            instance = new Ecole();
        }

        return instance;
    }

    public static void main(String[] args) {
        new Ecole();
    }
}
