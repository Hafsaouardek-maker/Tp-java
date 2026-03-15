public class Livre {

    private String titre;
    private String auteur;
    private int    nombrePages;
    private double prix;
    private boolean prixFixe;   

    public Livre(String titre, String auteur, int nombrePages) {
        this.titre       = titre;
        this.auteur      = auteur;
        this.nombrePages = nombrePages;
        this.prix        = -1;      
        this.prixFixe    = false;
    }

    public Livre(String titre, String auteur, int nombrePages, double prix) {
        this(titre, auteur, nombrePages);
        setPrix(prix);
    }
    public String getTitre()       { return titre; }
    public String getAuteur()      { return auteur; }
    public int    getNombrePages() { return nombrePages; }
    public double getPrix()        { return prix; }
    public boolean isPrixFixe()    { return prixFixe; }

    public void setTitre(String titre)          { this.titre = titre; }
    public void setAuteur(String auteur)        { this.auteur = auteur; }
    public void setNombrePages(int nombrePages) { this.nombrePages = nombrePages; }

    public void setPrix(double prix) {
        if (prixFixe) {
            System.out.println("Erreur : le prix a déjà été fixé et ne peut pas être modifié.");
        } else {
            this.prix     = prix;
            this.prixFixe = true;
        }
    }

    @Override
    public String toString() {
        String prixStr = prixFixe ? prix + " €" : "Prix pas encore donné";
        return "Livre{titre='" + titre + "', auteur='" + auteur +
               "', pages=" + nombrePages + ", prix=" + prixStr + "}";
    }

    public int compare(Livre l) {
        if (this.nombrePages == l.nombrePages) return  0;
        if (this.nombrePages >  l.nombrePages) return  1;
        return -1;
    }
}