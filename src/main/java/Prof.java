import java.util.*;

public class Prof extends Personne {

    private int[] listeNote = new int[10];
    private List<Etudiant> listeEtudiant = new ArrayList();

    public void ajoutEtudiant(Etudiant... etudiants) {

        listeEtudiant.addAll(Arrays.asList(etudiants));

        //--- ou
//        for(Etudiant etudiant : etudiants) {
//            listeEtudiant.add(etudiant);
//        }
    }

    public void info() {
        System.out.println(
                "Il a " + listeEtudiant.size() + " / "
                        + Ecole.getInstance().listeEtudiant.size() + " etudiants");
    }

    @Override
    public int evaluation() {

        int somme = 0;

        for(int note : listeNote){
            somme += note;
        }

        return somme/listeNote.length;
    }


}
