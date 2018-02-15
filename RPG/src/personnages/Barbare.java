package personnages;

import armes.Contondant;

/**
 * Created by BonLa1731834 on 2018-01-29.
 */
public class Barbare extends Guerrier {



    private Contondant arme;

    public Barbare(Contondant arme){
        setForce(10);
        setDefense(3);
        setVie(100);
        setNom("Barbare");
        this.arme = arme;

    }

    public int getDegats ()
    {
        return arme.frapper();
    }

    public Contondant getArme() {
        return arme;
    }

    public void setArme(Contondant arme) {
        this.arme = arme;
    }


}
