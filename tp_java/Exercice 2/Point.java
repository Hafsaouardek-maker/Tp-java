public class Point {
    char   nom;
    double abscisse;

    void initialiser(char nom, double abscisse) {
        this.nom      = nom;
        this.abscisse = abscisse;
    }

    void initialiser(Point p) {
        this.nom      = p.nom;
        this.abscisse = p.abscisse;
    }

    void affiche() {
        System.out.println("Point " + nom + " : abscisse = " + abscisse);
    }

    void translate(double valeur) {
        abscisse += valeur;
    }
}
    
