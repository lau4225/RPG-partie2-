package personnages;

import armes.Magique;
import sorts.Empoisonnement;
import sorts.MortSubite;

/**
 * Created by BonLa1731834 on 2018-02-01.
 */
public class MagicienRouge extends  Magicien{

    private Magique arme;



    public MagicienRouge(Magique arme){
        tabSorts [0] = new Empoisonnement();
        tabSorts [1] = new MortSubite();
        setMagie(40);
        setNom("Magicien Rouge");
        type = "Rouge";
        this.arme = arme;
    }

    public int getDegats ()
    {
        return arme.lanceSort();
    }

    @Override
    public Magique getArme() {
        return arme;
    }

    @Override
    public void setArme(Magique arme) {
        this.arme = arme;
    }
}
