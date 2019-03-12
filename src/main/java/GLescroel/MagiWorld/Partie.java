package GLescroel.MagiWorld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static GLescroel.MagiWorld.Log.TRACE;

/**
 * Classe Partie
 * demande aux joueurs de définir les paramètres de la partie
 * et lance la partie en fonction de ces paramètres
 */

public class Partie {

    Joueur joueur1;
    Joueur joueur2;

    private final String[] suitePartie = {
            "Rejouer la même partie",
            "Lancer une nouvelle partie",
            "Quitter"};
    private final int rejouer = 0;
    private final int nouvellePartie = 1;
    private final int quitter = 2;

    public static final Logger monDevLogger = LogManager.getLogger(GLescroel.MagiWorld.Partie.class.getName());

    /**
     * demarrerPartie() lance l'initialisation de la partie (choix utilisateurs), l'initialisation des joueurs et lance le jeu
     */
    public void demarrerPartie(){
        TRACE("Partie.demarrerPartie()");

        String suiteChoisie = "";
        do {
            initJoueurs();

            do {
                executerPartie();


                String demande = "\nLa partie est terminée\nQue vouhaitez vous faire maintenant ?";
                suiteChoisie = suitePartie[Interaction.demanderChoix(demande, suitePartie)-1];

            } while (suiteChoisie.equals(suitePartie[rejouer]));

        }while(suiteChoisie.equals(suitePartie[nouvellePartie]));

        System.out.println("Merci d'avoir joué ! à bientôt !");

    }

    /**
     * initJoueurs() crée les 2 joueurs
     */
    private void initJoueurs(){
        TRACE("Partie.initJoueurs()");

        joueur1 = new Joueur("Joueur 1");
        joueur2 = new Joueur("Joueur 2");
    }

    /**
     * executerPartie() lance la partie
     */
    public void executerPartie() {
        TRACE("Partie.executerPartie()");

    }

}
