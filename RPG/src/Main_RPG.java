import armes.*;
import personnages.*;

import java.util.Scanner;

public class Main_RPG {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        /*
        on peut choisir 2 fois le même personnage?

        comment passer en paramètres les personnages ??

        comment choisir les personnages ?

        AFFICHAGE DIRE LES ARMES?

        noms des armes + noms tout court?

        code inutile?

        RENDU A CHOIX DES ARMES


        - fin de partie
         */


        System.out.println("Bienvenue dans RPG Simulator!");
        System.out.println();
        System.out.println("Veuillez choisir le premier personnage");
        Personnage perso1 = choixPerso();
        System.out.println();
        System.out.println("Veuillez choisir le deuxième personnage");
        Personnage perso2 = choixPerso();

        System.out.println();


        /*
        System.out.println("    1. Barbare");
        System.out.println("    2. Paladin");
        System.out.println("    3. Magicien Noir");
        System.out.println("    4. Magicien Rouge");
        System.out.println("Votre choix : ");
        while (trouvePerso==false) {
            choixPerso = sc.nextInt();
            switch (choixPerso) {
                case 1:
                    System.out.println();
                    System.out.println("Quelle arme voulez-vous lui assigner?");
                    System.out.println("    1. Masse ");
                    System.out.println("    2. Épée Lourde");
                    System.out.println("    3. Sceptre");
                    System.out.println("    4. Masamune");
                    System.out.println("Votre choix : ");
                    while (trouveArme == false) {
                        choixArme = sc.nextInt();
                        switch (choixArme) {
                            case 1:
                                perso2 = new Barbare(new Masse());
                                trouveArme = true;
                                break;
                            case 2:
                                perso2 = new Barbare(new ÉpéeLourde());
                                trouveArme = true;
                                break;
                            case 3:
                                perso2 = new Barbare(new Sceptre());
                                trouveArme = true;
                                break;
                            case 4:
                                perso2 = new Barbare(new Masamune());
                                trouveArme = true;
                                break;

                            default:
                                System.out.println("Entrez un nombre valide");
                                System.out.println("Votre choix : ");
                        }
                    }
                    trouvePerso = true;
                    break;
                case 2:

                    System.out.println();
                    System.out.println("Quelle arme voulez-vous lui assigner?");
                    System.out.println("    1. Épée");
                    System.out.println("    2. Épée Magique");
                    System.out.println("    3. Épée Lourde");
                    System.out.println("    4. Masamune");
                    System.out.println("Votre choix : ");
                    while (trouveArme == false) {
                        choixArme = sc.nextInt();
                        switch (choixArme) {
                            case 1:
                                perso2 = new Paladin(new Épée());
                                trouveArme = true;
                                break;
                            case 2:
                                perso2 = new Paladin(new ÉpéeMagique());
                                trouveArme = true;
                                break;
                            case 3:
                                perso2 = new Paladin(new ÉpéeLourde());
                                trouveArme = true;
                                break;
                            case 4:
                                perso2 = new Paladin(new Masamune());
                                trouveArme = true;
                                break;

                            default:
                                System.out.println("Entrez un nombre valide");
                                System.out.println("Votre choix : ");
                        }
                    }
                    trouvePerso = true;
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Quelle arme voulez-vous lui assigner?");
                    System.out.println("    1. Baguette");
                    System.out.println("    2. Épée Magique");
                    System.out.println("    3. Sceptre");
                    System.out.println("    4. Masamune");
                    System.out.println("Votre choix : ");
                    while (trouveArme == false) {
                        choixArme = sc.nextInt();
                        switch (choixArme) {
                            case 1:
                                perso2 = new MagicienNoir(new Baguette());
                                trouveArme = true;
                                break;
                            case 2:
                                perso2 = new MagicienNoir(new Sceptre());
                                trouveArme = true;
                                break;
                            case 3:
                                perso2 = new MagicienNoir(new Sceptre());
                                trouveArme = true;
                                break;
                            case 4:
                                perso2 = new MagicienNoir(new Masamune());
                                trouveArme = true;
                                break;

                            default:
                                System.out.println("Entrez un nombre valide");
                                System.out.println("Votre choix : ");
                        }
                    }
                    trouvePerso = true;
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Quelle arme voulez-vous lui assigner?");
                    System.out.println("    1. Baguette");
                    System.out.println("    2. Épée Magique");
                    System.out.println("    3. Sceptre");
                    System.out.println("    4. Masamune");
                    System.out.println("Votre choix : ");
                    while (trouveArme == false) {
                        choixArme = sc.nextInt();
                        switch (choixArme) {
                            case 1:
                                perso2 = new MagicienRouge(new Baguette());
                                trouveArme = true;
                                break;
                            case 2:
                                perso2 = new MagicienRouge(new Sceptre());
                                trouveArme = true;
                                break;
                            case 3:
                                perso2 = new MagicienRouge(new Sceptre());
                                trouveArme = true;
                                break;
                            case 4:
                                perso2 = new MagicienRouge(new Masamune());
                                trouveArme = true;
                                break;

                            default:
                                System.out.println("Entrez un nombre valide");
                                System.out.println("Votre choix : ");
                        }
                    }
                    trouvePerso = true;
                    break;
            }
        }

        */




        System.out.println();


        // Deroulement de la partie
        boolean fin = false;
        while (fin==false)
        {
            System.out.println();
            perso1.attaque(perso2);

            if (perso2.getVie()>0) {
                System.out.println();
                perso2.attaque(perso1);
            }
            else {
                fin = true;
            }

            if (perso1 instanceof Magicien && perso2 instanceof Magicien)
            {
                Magicien magi1 = (Magicien) perso1;
                Magicien magi2 = (Magicien) perso2;

                if (magi1.getMagie() <= 0 && magi2.getMagie() <= 0)
                {
                    fin = true;
                    System.out.println("Les deux Magiciens n'ont plus de magie :( ");
                    System.out.println("La partie est nulle");
                }
            }
        }
    }

    public static Personnage choixPerso (){


        System.out.println("    1. Barbare");
        System.out.println("    2. Paladin");
        System.out.println("    3. Magicien Noir");
        System.out.println("    4. Magicien Rouge");
        System.out.println();


        int choixPerso = 0;
        int choixArme = 0;

        System.out.println("Votre choix : ");


        while (true) {
            choixPerso = sc.nextInt();
            switch (choixPerso) {
                case 1:
                    System.out.println();
                    System.out.println("Quelle arme voulez-vous lui assigner?");
                    System.out.println("    1. Masse ");
                    System.out.println("    2. Épée Lourde");
                    System.out.println("    3. Sceptre");
                    System.out.println("    4. Masamune");
                    System.out.println("Votre choix : ");
                    while (true) {
                        choixArme = sc.nextInt();
                        switch (choixArme) {
                            case 1:
                                return new Barbare(new Masse());
                            case 2:
                                return new Barbare(new ÉpéeLourde());
                            case 3:
                                return new Barbare(new Sceptre());
                            case 4:
                                return new Barbare(new Masamune());
                            default:
                                System.out.println("Entrez un nombre valide");
                                System.out.println("Votre choix : ");
                        }
                    }
                case 2:

                    System.out.println();
                    System.out.println("Quelle arme voulez-vous lui assigner?");
                    System.out.println("    1. Épée");
                    System.out.println("    2. Épée Magique");
                    System.out.println("    3. Épée Lourde");
                    System.out.println("    4. Masamune");
                    System.out.println("Votre choix : ");
                    while (true) {
                        choixArme = sc.nextInt();
                        System.out.println();
                        switch (choixArme) {
                            case 1:
                                return new Paladin(new Épée());
                            case 2:
                                return new Paladin(new ÉpéeMagique());
                            case 3:
                                return new Paladin(new ÉpéeLourde());
                            case 4:
                                return new Paladin(new Masamune());
                            default:
                                System.out.println("Entrez un nombre valide");
                                System.out.println("Votre choix : ");
                        }
                    }
                case 3:
                    System.out.println();
                    System.out.println("Quelle arme voulez-vous lui assigner?");
                    System.out.println("    1. Baguette");
                    System.out.println("    2. Épée Magique");
                    System.out.println("    3. Sceptre");
                    System.out.println("    4. Masamune");
                    System.out.println("Votre choix : ");
                    while (true) {
                        choixArme = sc.nextInt();
                        switch (choixArme) {
                            case 1:
                                return new MagicienNoir(new Baguette());
                            case 2:
                                return new MagicienNoir(new Sceptre());
                            case 3:
                                return new MagicienNoir(new Sceptre());
                            case 4:
                                return new MagicienNoir(new Masamune());
                            default:
                                System.out.println("Entrez un nombre valide");
                                System.out.println("Votre choix : ");
                        }
                    }
                case 4:
                    System.out.println();
                    System.out.println("Quelle arme voulez-vous lui assigner?");
                    System.out.println("    1. Baguette");
                    System.out.println("    2. Épée Magique");
                    System.out.println("    3. Sceptre");
                    System.out.println("    4. Masamune");
                    System.out.println("Votre choix : ");
                    while (true) {
                        choixArme = sc.nextInt();
                        switch (choixArme) {
                            case 1:
                                return new MagicienRouge(new Baguette());
                            case 2:
                                return new MagicienRouge(new Sceptre());
                            case 3:
                                return new MagicienRouge(new Sceptre());
                            case 4:
                                return new MagicienRouge(new Masamune());

                            default:
                                System.out.println("Entrez un nombre valide");
                                System.out.println("Votre choix : ");
                        }
                    }

            }
        }
    }
}
