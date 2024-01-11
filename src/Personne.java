import java.util.Date;

public class Personne {

        private String nom;
        private String prenom;
        private String email;
        private int dateNaiss;
        public Personne(String nom,String prenom,String email,int datenaiss){
             this.nom= nom;
             this.prenom= prenom;
             this.email= email;
             this.dateNaiss= datenaiss;
        }

        public String getNom() {
                return nom;
        }

        public void setNom(String nom) {
                this.nom = nom;
        }

        public String getPrenom() {
                return prenom;
        }

        public void setPrenom(String prenom) {
                this.prenom = prenom;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public int getDateNaiss() {
                return dateNaiss;
        }

        public void setDateNaiss(int dateNaiss) {
                this.dateNaiss = dateNaiss;
        }

        @Override
        public String toString() {
                return "Personne{" +
                        "nom='" + nom + '\'' +
                        ", prenom='" + prenom + '\'' +
                        ", email='" + email + '\'' +
                        ", dateNaiss=" + dateNaiss +
                        '}';
        }
}
