
public class Point1 {
    String nom;
    double abscisse;

    // Constructeur
    Point1(String nom, double abscisse) {
        this.nom      = nom;
        this.abscisse = abscisse;
    }

    void affiche() {
        System.out.println("Point " + nom + " : abscisse = " + abscisse);
    }

    void translate(double valeur) {
        abscisse += valeur;
    }
}