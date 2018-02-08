import java.util.Scanner;

public class Main_RPG {

    public static void main(String[] args) {


        /*
        on peut choisir 2 fois le même personnage?

        comment passer en paramètres les personnages ??

        comment choisir les personnages ?

        RENDU AU MAIN


        - fin de partie
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue dans RPG Simulator!");
        System.out.println();
        System.out.println("Veuillez choisir le premier personnage");
        System.out.println("    1. Barbare");
        System.out.println("    2. Paladin");
        System.out.println("    3. Magicien Noir");
        System.out.println("    4. Magicien Rouge");
        System.out.println();


        Personnage perso1 = null;
        Personnage perso2 = null;
        int reponse = 0;
        boolean trouve = false;

        System.out.println("Votre choix : ");


        while (trouve==false) {
            reponse = sc.nextInt();
            switch (reponse) {
                case 1:
                    perso1 = new Barbare();
                    trouve = true;
                    break;
                case 2:
                    perso1 = new Paladin();
                    trouve = true;
                    break;
                case 3:
                    perso1 = new MagicienNoir();
                    trouve = true;
                    break;
                case 4:
                    perso1 = new MagicienRouge();
                    trouve = true;
                    break;
                default: System.out.println("Entrez un nombre valide");
                    System.out.println("Votre choix : ");
            }
        }

        System.out.println();
        System.out.println("Veuillez choisir le deuxième personnage");
        System.out.println("    1. Barbare");
        System.out.println("    2. Paladin");
        System.out.println("    3. Magicien Noir");
        System.out.println("    4. Magicien Rouge");

        System.out.println("Votre choix : ");

        trouve = false;

        while (trouve==false) {
            reponse = sc.nextInt();
            switch (reponse) {
                case 1:
                    perso2 = new Barbare();
                    trouve = true;
                    break;
                case 2:
                    perso2 = new Paladin();
                    trouve = true;
                    break;
                case 3:
                    perso2 = new MagicienNoir();
                    trouve = true;
                    break;
                case 4:
                    perso2 = new MagicienRouge();
                    trouve = true;
                    break;
                default:  System.out.println("Entrez un nombre valide");
                    System.out.println("Votre choix : ");
            }
        }

        System.out.println();

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
}
