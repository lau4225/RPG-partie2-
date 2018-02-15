package armes;

/**
 * Created by BonLa1731834 on 2018-02-08.
 */
public class ÉpéeMagique implements Tranchant, Magique {

    @Override
    public int trancher() {
        return 6;
    }

    @Override
    public int lanceSort() {
        return 3;
    }

    public String nom() {
        return "Épée Magique";
    }
}
