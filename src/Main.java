import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        // Création d'une liste d'étudiants
        ArrayList<Personne> listePersonnes = new ArrayList<>();

        // Création d'un étudiant
        Etudiant etudiant1 = new Etudiant("Bamba", "kane", 2000, "bambakane@gmail.com", "JEANDUPONT1020123", classes.L3);
        listePersonnes.add((Personne)etudiant1);

        // Création d'un autre étudiant
        Etudiant etudiant2 = new Etudiant("Martin", "Marie", 1999, "marie.martin@gmail.com", "1999123", classes.M1);
        listePersonnes.add((Personne)etudiant2);

        // Création d'un professeur
        Professeur professeur1 = new Professeur("Durand", "Pierre", "papelo@gmail.com", 1980, "PIERREDURAND1980123, new HashSet<>(Arrays.asList("JAVA", "PHP", "C#"))) {
            @Override
            public void enseigner() {
            }

            @Override
            public void corrigerExamen() {

            }
        };
        listePersonnes.add(professeur1);

        // Création d'un autre professeur
        Professeur professeur2 = new Professeur("sadam", "kani", "kanisadam@gmail.com", "2000, kanisadam@200123, new HashSet<>(Arrays.asList("SQL", "NoSQL", "ORM"))) {
            @Override
            public void enseigner() {

            }

            @Override
            public void corrigerExamen() {

            }
        };
        listePersonnes.add(professeur2);

        // Affichage des informations de chaque personne
        for (Personne personne : listePersonnes) {
            System.out.println(personne);
        }
    }
    public interface Etudiant

    {


}
