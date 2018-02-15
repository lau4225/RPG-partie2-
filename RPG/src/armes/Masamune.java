package armes;

/**
 * Created by BonLa1731834 on 2018-02-08.
 */
public class Masamune implements Contondant, Tranchant, Magique {


    @Override
    public int lanceSort() {
        return 6;
    }

    @Override
    public int frapper() {
        return 5;
    }


    @Override
    public int trancher() {
        return 6;
    }

    public String nom() {
        return "Masamune";
    }

}
