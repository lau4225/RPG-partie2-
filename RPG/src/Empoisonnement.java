/**
 * Created by BonLa1731834 on 2018-01-29.
 */
public class Empoisonnement extends Sort{

    private int degats = 0;

    public Empoisonnement (){setCout(2);}
    
    public void lanceSort(Personnage persoAttaque, Magicien magicien) {
        if (magicien.getMagie()>=2)
        {
            degats = degats+2;
            System.out.println("Le Magicien " + magicien.type + " attaque!");
            System.out.println("Le Magicien " + magicien.type + " utilise le sort Empoisonnement, ce qui lui coûte " + getCout() + "pts de magie.");

            persoAttaque.setVie(persoAttaque.getVie()-degats);
            if (persoAttaque.getVie()<0) { persoAttaque.setVie(0); }

            magicien.setMagie(magicien.getMagie()-2);

            System.out.println("Il lui reste " + magicien.getMagie() + "pts de magie.");
            System.out.println("Le " + persoAttaque.getNom() + " perd " + degats + "pts de vie. Il lui en reste " + persoAttaque.getVie() + ".");

            if (persoAttaque.getVie()==0){
                System.out.println("Le " + persoAttaque.getNom() + " est mort, le Magicien " + magicien.type + " a gagné!");
            }
        }
        else {
            System.out.println("Le Magicien " + magicien.type + " n'a pas assez de points magie pour lancer le sort Empoisonnement");
        }

    }

    public int getDegats() {return degats;}

    public void setDegats(int degats) {this.degats = degats;}
}