/**
 * Created by BonLa1731834 on 2018-01-29.
 */
public abstract class Sort {

    private int cout; // En points de magie

    public abstract void lanceSort(Personnage persoAttaque, Magicien magicien);

    public int getCout() {return cout;}

    public void setCout(int cout) {this.cout = cout;}

}
