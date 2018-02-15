package personnages;

import armes.Magique;
import sorts.BouledeFeu;
import sorts.PicDeGlace;

/**
 * Created by BonLa1731834 on 2018-02-01.
 */
public class MagicienNoir extends Magicien {


    private Magique arme;



    public MagicienNoir(Magique arme){
       tabSorts [0] = new BouledeFeu();
       tabSorts [1] = new PicDeGlace();
       setMagie(50);
       setNom("Magicien Noir");
       type = "Noir";
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
