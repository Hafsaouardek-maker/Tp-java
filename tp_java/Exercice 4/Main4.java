public class Main4 {
    public static void main(String[] args) {

      
        Livre l1 = new Livre("Clean Code", "Robert Martin", 431);
        Livre l2 = new Livre("Design Patterns", "Gang of Four", 395, 45.0);
        Livre l3 = new Livre("Java in a Nutshell", "Evans", 520, 0.0); 

        System.out.println(l1);   
        System.out.println(l2);
        System.out.println(l3);

        l1.setPrix(35.0);
        l1.setPrix(40.0);        
        System.out.println(l1);   

        System.out.println("Compare l1/l2 : " + l1.compare(l2)); 

        Etagere e = new Etagere(3);
        e.ajouter(l1);
        e.ajouter(l2);
        e.ajouter(l3);
        e.ajouter(new Livre("Extra", "Auteur", 100)); 

        e.afficher();

        System.out.println("Chercher 'Clean Code' : position " +
                           e.chercher("Clean Code", "Robert Martin"));

        System.out.println("Livre en pos 2 : " + e.getLivre(2));

        e.supprimer(1);
        e.afficher();
    }
}
