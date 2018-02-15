package personnages;
import armes.Magique;
import sorts.Sort;

/**
 * Created by BonLa1731834 on 2018-01-29.
 */
public class Magicien extends Personnage{

    private int magie;
    protected Sort tabSorts [] = new Sort[2];

    private int attaqueMagi; // position du sort aleatoirement choisi
    protected String type;


    private Magique arme;

    public Magicien () {
        setVie(60);
        setDefense(1);

    }
    public void attaque(Personnage persoAttaque){

        attaqueMagi = (int) (Math.random()*2);
        tabSorts[attaqueMagi].lanceSort(persoAttaque, this);
    }

    public int getDegats ()
    {
        return arme.lanceSort();
    }

    public int getMagie() {return magie;}

    public void setMagie(int magie) {this.magie = magie;}

    public Sort[] getTabSorts() { return tabSorts; }

    public void setTabSorts(Sort[] tabSorts) { this.tabSorts = tabSorts; }

    public int getAttaqueMagi() { return attaqueMagi; }

    public void setAttaqueMagi(int attaqueMagi) { this.attaqueMagi = attaqueMagi; }

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}

    public Magique getArme() {
        return arme;
    }

    public void setArme(Magique arme) {
        this.arme = arme;
    }

}
