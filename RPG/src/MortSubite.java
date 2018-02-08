/**
 * Created by BonLa1731834 on 2018-02-01.
 */
public class MortSubite extends Sort {

    private int instantane;

    public MortSubite (){setCout(10);}

    public void lanceSort(Personnage persoAttaque, Magicien magicien) {
        if (magicien.getMagie()>=10)
        {
            System.out.println("Le Magicien " + magicien.type + " attaque!");
            System.out.println("Le Magicien " + magicien.type + " utilise le sort Mort Subite, ce qui lui coûte " + getCout() + "pts de magie.");

            magicien.setMagie(magicien.getMagie()-10);

            instantane = (int) Math.random()*10;
            if (instantane==5)
            {
                System.out.println("Le " + persoAttaque.getNom() + " perd tous ses " + persoAttaque.getVie() + "pts de vie. Il lui en reste 0.");
                persoAttaque.setVie(0);
                System.out.println("Le " + persoAttaque.getNom() + " est mort, le Magicien Rouge a gagné!");
            }
            else {
                System.out.println("Il lui reste " + magicien.getMagie() + "pts de magie.");
                System.out.println("Le " + persoAttaque.getNom() + " ne perd aucun points de vie. Il lui en reste " + persoAttaque.getVie() );
            }
        }
        else {
            System.out.println("Le Magicien " + magicien.type + " n'a pas assez de points magie pour lancer le sort Mort Subite");
        }
    }

}
