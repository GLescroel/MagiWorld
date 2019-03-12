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

        System.out.println(question);

        for (int i = 1; i <= reponses.length; i++)
            System.out.println(i + " - " + reponses[i - 1]);


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

            /**if (nbResponse >= 1 && nbResponse <= responses.length)
             responseIsGood = true;
             else responseIsGood = false;*/

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

        System.out.println("\nChoix du nombre " + valeurDemandee + " entre " + valeurMin + " et " + valeurMax);
        System.out.println("Avec combien " + valeurDemandee + " souhaitez vous jouer ?");

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
                DEBUG_DEV("Vous avez choisi comme quantité " + valeurDemandee + " : " + responseNb);
            else
                System.out.println("Vous n'avez pas choisi le nombre " + valeurDemandee + " parmi les choix proposés");

        } while (responseIsGood == false);

        return responseNb;
    }

    /**
     * demanderOuiNon() = demande à l'utilisateur une réponse par O ou N à une question
     * @param question = question posée
     * @return String de la réponse
     */
    public static String demanderOuiNon(String question) {
        TRACE("Interaction.demanderOuiNon()");

        System.out.println(question);

        String response="";
        boolean responseIsGood = false;
        do {
            Scanner sc = new Scanner(System.in);
            try {
                response = sc.next();
                responseIsGood = (response.toUpperCase().equals("O") || response.toUpperCase().equals("N"));
            }catch (InputMismatchException exception){
                System.out.println("Erreur de saisie");
                sc.next();
                responseIsGood = false;}

        } while (responseIsGood == false);

        return response.toUpperCase();
    }

    public static void affichageAttaque(String nomJoueur, String attaque, String consequence) {
        TRACE("Interaction.affichageAttaque()");

        System.out.println(nomJoueur + " utilise " + attaque + " et " + consequence);
    }

}
