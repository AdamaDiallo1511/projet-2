import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add(new Etudiants("Kane", "Bamba", 2000, "jean.dupont@gmail.com", "1", Classe.L3));
        personnes.add(new Etudiants("Durand", "Marie", 1999, "marie.durand@gmail.com", "2", Classe.M1));
        personnes.add(new Etudiants("Martin", "Paul", 2001, "paul.martin@gmail.com", "3", Classe.M2));
        personnes.add(new Professeur("Leroy", "Alice", 1980, "alice.leroy@gmail.com", new HashSet<>(Arrays.asList("JAVA", "PHP"))));
        personnes.add(new Professeur("Lemoine", "Robert", 1975, "robert.lemoine@gmail.com", new HashSet<>(Arrays.asList("C#", "PHP"))));
        personnes.add(new Professeur("Moreau", "Claire", 1985, "claire.moreau@gmail.com", new HashSet<>(Arrays.asList("JAVA", "C#"))));

        for (Personne personne : personnes) {
            System.out.println(personne);
            if (personne instanceof IEtudiant) {
                ((IEtudiant) personne).sInscrire();
                ((IEtudiant) personne).suivreCours();
                ((IEtudiant) personne).passerExamen();
            }
            if (personne instanceof IProfesseur) {
                ((IProfesseur) personne).enseigner();
                ((IProfesseur) personne).corrigerExamen();
            }
        }
    }
}