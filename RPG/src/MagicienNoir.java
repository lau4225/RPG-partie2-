/**
 * Created by BonLa1731834 on 2018-02-01.
 */
public class MagicienNoir extends Magicien {


    public MagicienNoir(){
       tabSorts [0] = new BouledeFeu();
       tabSorts [1] = new PicDeGlace();
       setMagie(50);
       setNom("Magicien Noir");
       type = "Noir";
    }
}
