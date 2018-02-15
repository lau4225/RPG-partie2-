package personnages;

import armes.Tranchant;

/**
 * Created by BonLa1731834 on 2018-01-29.
 */
public class Paladin extends Guerrier {

    private Tranchant arme;


    public Paladin(Tranchant arme){
        setForce(5);
        setDefense(5);
        setVie(80);
        setNom("Paladin");
        this.arme = arme;
    }

    public int getDegats ()
    {
        return arme.trancher();
    }

    public Tranchant getArme() {
        return arme;
    }

    public void setArme(Tranchant arme) {
        this.arme = arme;
    }

}
