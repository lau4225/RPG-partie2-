/**
 * Created by BonLa1731834 on 2018-01-29.
 */
public class Magicien extends Personnage{

    private int magie;
    protected Sort tabSorts [] = new Sort[2];
    public Magicien () { setVie(60); setDefense(1);}
    private int attaqueMagi; // position du sort aleatoirement choisi
    protected String type;

    public void attaque(Personnage persoAttaque){

        attaqueMagi = (int) (Math.random()*2);
        tabSorts[attaqueMagi].lanceSort(persoAttaque, this);
    }

    public int getMagie() {return magie;}

    public void setMagie(int magie) {this.magie = magie;}

    public Sort[] getTabSorts() { return tabSorts; }

    public void setTabSorts(Sort[] tabSorts) { this.tabSorts = tabSorts; }

    public int getAttaqueMagi() { return attaqueMagi; }

    public void setAttaqueMagi(int attaqueMagi) { this.attaqueMagi = attaqueMagi; }
}
