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

        joueur1.parametragePersonnage();
        joueur2.parametragePersonnage();
    }

    /**
     * executerPartie() lance la partie
     */
    public void executerPartie() {
        TRACE("Partie.executerPartie()");

        do {
            joueur1.perso.attaque(joueur1, joueur2);

            if(joueur2.perso.vitalite > 0)
                joueur2.perso.attaque(joueur2, joueur1);

        }while (joueur1.perso.vitalite > 0 && joueur2.perso.vitalite > 0);

        affichageResultat();
    }

    /**
     * affichageResultat() affiche le résultat de la partie
     */
    public void affichageResultat() {
        TRACE("Partie.affichageResultat()");

        if((joueur1.perso.vitalite <= 0) && (joueur2.perso.vitalite <= 0))
            Interaction.affichageMessage("Vous vous êtes entretués !\n\n");
        else if(joueur1.perso.vitalite > 0)
            Interaction.affichageMessage(joueur2.nomJoueur + " est mort\n" + joueur1.nomJoueur + " a gagné le combat !\n\n");
        else
            Interaction.affichageMessage(joueur1.nomJoueur + " est mort\n" + joueur2.nomJoueur + " a gagné le combat !\n\n");

    }
}
