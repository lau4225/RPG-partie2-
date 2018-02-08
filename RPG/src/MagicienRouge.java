/**
 * Created by BonLa1731834 on 2018-02-01.
 */
public class MagicienRouge extends  Magicien{

    public MagicienRouge(){
        tabSorts [0] = new Empoisonnement();
        tabSorts [1] = new MortSubite();
        setMagie(40);
        setNom("Magicien Rouge");
        type = "Rouge";
    }
}
