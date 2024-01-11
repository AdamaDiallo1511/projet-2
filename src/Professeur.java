import java.util.Date;

public abstract class Professeur extends Personne{

    public Professeur(String nom, String prenom, String email, int datenaiss) {
        super(nom, prenom, email, datenaiss);
    }


    public void enseigner(){
        System.out.println("");
    };

    public void corrigerExamen(){
        System.out.println("");
    }

}
