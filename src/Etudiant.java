import java.util.Date;
public class Etudiant extends Personne {
    private String classes;
    private int Num_Etu;



    public Etudiant(String nom, String prenom, String email, int datenaiss,String classes,int Num_Etu) {
        super(nom, prenom, email, datenaiss);
        this.classes=classes;
        this.Num_Etu = Num_Etu;
    }

    public String getclasses() {
        return classes;
    }

    public void setclasses(String classes) {
        this.classes = classes;
    }

    public int getNum_Etu() {
        return Num_Etu;
    }

    public void setNum_Etu(int num_Etu) {
        Num_Etu = num_Etu;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "classe='" + classes + '\'' +
                ", Num_Etu=" + Num_Etu +
                '}';
    }

}