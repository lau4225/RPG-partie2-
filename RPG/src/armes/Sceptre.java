package armes;

/**
 * Created by BonLa1731834 on 2018-02-08.
 */
public class Sceptre implements Contondant, Magique {


    @Override
    public int lanceSort() {
        return 6;
    }

    @Override
    public int frapper () {
        return 3;
    }

    public String nom() {
        return "Sceptre";
    }
}
