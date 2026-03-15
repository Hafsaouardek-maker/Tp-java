
public class Main2 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.initialiser('A', 3.5);
        p1.affiche();         

        p1.translate(2.0);
        p1.affiche();           

        Point p2 = new Point();
        p2.initialiser(p1);     
        p2.affiche();           
    }
}