import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();
        personnes.add(new Etudiants("Kane", "Mouhamadou", 2000, "Mouhamadou.Kane@gmail.com", "1", Classe.L3));
        personnes.add(new Etudiants("Kane", "Bamba", 1999, "Bamba.Kane@gmail.com", "2", Classe.M1));
        personnes.add(new Etudiants("Kane", "Mehmed", 2001, "Mehmed.Kane@gmail.com", "3", Classe.M2));
        personnes.add(new Professeur("Boy", "Mbour", 1980, "Boy.Mbour@gmail.com", new HashSet<>(Arrays.asList("JAVA", "PHP"))));
        personnes.add(new Professeur("Java", "Lover", 1975, "Java.Lover@gmail.com", new HashSet<>(Arrays.asList("C#", "PHP"))));
        personnes.add(new Professeur("Lo", "Dane", 1985, "Dane.Lo@gmail.com", new HashSet<>(Arrays.asList("JAVA", "C#"))));

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