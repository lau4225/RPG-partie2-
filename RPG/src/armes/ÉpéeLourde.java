package armes;

/**
 * Created by BonLa1731834 on 2018-02-08.
 */
public class ÉpéeLourde implements Tranchant, Contondant {

    @Override
    public int trancher() {
        return 6;
    }

    @Override
    public int frapper() {
        return 3;
    }

    public String nom() {
        return "Épée Lourde";
    }
}
