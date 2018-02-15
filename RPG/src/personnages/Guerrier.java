package personnages;

import armes.Contondant;

/**
 * Created by BonLa1731834 on 2018-01-29.
 */
public abstract class Guerrier extends Personnage  {

    private int force;

    public Guerrier () { setNom("Guerrier"); }

    public int getForce() {return force;}

    public void setForce(int force) {this.force = force;}

    public void attaque(Personnage persoAttaque){

        System.out.println("Le " + this.getNom() + " attaque!");
        System.out.print("Le " + persoAttaque.getNom() + " perd " + (((getForce()*2)-persoAttaque.getDefense())+ getDegats()) + "pts de vie.");
        persoAttaque.setVie((persoAttaque.getVie())-(((getForce()*2)-persoAttaque.getDefense())+getDegats()));
        if (persoAttaque.getVie() <0){persoAttaque.setVie(0);}
        System.out.println(" Il lui en reste " + persoAttaque.getVie());

        if (persoAttaque.getVie()==0)
        {
            System.out.println();
            System.out.println("Le " + persoAttaque.getNom() + " est mort, le " + this.getNom() + " a gagné! ");

        }
    }


}
