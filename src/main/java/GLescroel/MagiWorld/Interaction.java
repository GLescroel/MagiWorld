package GLescroel.MagiWorld;

import java.util.InputMismatchException;
import java.util.Scanner;

import static GLescroel.MagiWorld.Log.DEBUG_DEV;
import static GLescroel.MagiWorld.Log.TRACE;

public class Interaction {

    /**
     * demanderChoix()
     * @param question =  catégorie de la demande (jeu, mode)
     * @param reponses = la liste des réponses possibles
     * @return le numéro de la réponse dans la liste
     */
    public static int demanderChoix(String question, String[] reponses) {
        TRACE("Interaction.demanderChoix()");

        String reponsesFormat =" (";
        for (int i = 1; i <= reponses.length; i++)
            reponsesFormat += i + " : " + reponses[i - 1] + ", ";
        reponsesFormat += ")";
        reponsesFormat = reponsesFormat.replace(", )", ")");

        System.out.println(question + reponsesFormat);

        int responseNb=0;
        boolean responseIsGood = false;
        do {
            Scanner sc = new Scanner(System.in);
            try {
                responseNb = sc.nextInt();
                responseIsGood = (responseNb >= 1 && responseNb <= reponses.length);
            }catch (InputMismatchException exception){
                System.out.println("Erreur de saisie");
                sc.next();
                responseIsGood = false;}

            if (responseIsGood == true)
                DEBUG_DEV("Vous avez choisi  : " + reponses[responseNb - 1]);
            else
                System.out.println("Vous n'avez pas choisi parmi les choix proposés");
        } while (responseIsGood == false);

        return responseNb;
    }


    /**
     * Permet de récupérer le nombre saisi par le joueur pour une donnée demandée
     * @param valeurDemandee (nbCar ou nbTry), int minValue, int maxValue
     * @param valeurMin valeur minimale de la proposition
     * @param valeurMax valeur maximale de la proposition
     * @return le nombre saisi par le joueur
     */
    public static int demanderNombre(String valeurDemandee, int valeurMin, int valeurMax) {
        TRACE("Interaction.demanderNombre()");

        System.out.println("\n" + valeurDemandee + " entre " + valeurMin + " et " + valeurMax);

        int responseNb=0;
        boolean responseIsGood = false;
        do {
            Scanner sc = new Scanner(System.in);
            try {
                responseNb = sc.nextInt();
                responseIsGood = (responseNb >= valeurMin && responseNb <= valeurMax);
            }catch (InputMismatchException exception){
                System.out.println("Erreur de saisie");
                sc.next();
                responseIsGood = false;}

            if (responseIsGood == true)
                DEBUG_DEV("Vous avez choisi comme " + valeurDemandee + " : " + responseNb);
            else
                System.out.println("Vous n'avez pas choisi dans l'intervale proposé");

        } while (responseIsGood == false);

        return responseNb;
    }

    /**
     * affichageAttaque affiche l'attaque en cours
     * @param attaquant nom du joueur attaquant
     * @param attaque nom du joueur attaqué
     * @param nomAttaqueBasique nom de l'attaque
     * @param dommages infligés à l'attaqué
     */
    public static void affichageAttaqueBasique(String attaquant, String attaque, String nomAttaqueBasique, int dommages) {
        TRACE("Interaction.affichageAttaqueBasique()");

        Interaction.affichageMessage(attaquant + " lance "+ nomAttaqueBasique + " et inflige " + dommages + " dommages.");
        Interaction.affichageMessage(attaque   + " perd " + dommages + " points de vie.");

    }

    /**
     * affichageMessage() = affiche un message console à l'utilisateur
     * @param message = pmessage à afficher
     */
    public static void affichageMessage(String message) {
        TRACE("Interaction.affichageMessage");
        System.out.println(message);
    }
}
