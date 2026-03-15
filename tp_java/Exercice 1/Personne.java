public class Personne {
    String CIN;
    String nom;
    String prenom;
    String email;
    int age;

    void initialiser(String cin, String nom, String prenom, String email, int age) {
        this.CIN    = cin;
        this.nom    = nom;
        this.prenom = prenom;
        this.email  = email;
        this.age    = age;
    }

    void afficherPersonne() {
        System.out.println("CIN     : " + CIN);
        System.out.println("Nom     : " + nom);
        System.out.println("Prénom  : " + prenom);
        System.out.println("Email   : " + email);
        System.out.println("Age     : " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Personne p = new Personne();
        p.initialiser("AB123456", "Ouardek", "Hafsa", "houardek@gmail.com", 20);
        p.afficherPersonne();