package personnages;

/**
 * Created by BonLa1731834 on 2018-01-29.
 */
public abstract class Personnage {

    private int vie;
    private int defense;
    private String nom;

    public abstract int getDegats();

    public int getVie() {return vie;}

    public void setVie(int vie) {this.vie = vie;}

    public int getDefense() {return defense;}

    public void setDefense(int defense) {this.defense = defense;}

    public String getNom() {return nom;}

    public void setNom(String nom) {this.nom = nom;}

    public abstract void attaque(Personnage persoAttaque );

}
