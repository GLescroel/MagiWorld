package GLescroel.MagiWorld;

import static GLescroel.MagiWorld.Log.TRACE;

/**
 * Classe Guerrier étend Personnage
 * décrit les spécificités du personnage Guerrier
 */
public class Guerrier extends Personnage {

    /**
     * Guerrier() constructor
     *
     * @param niveau       niveau du personnage
     * @param force        force du personnage
     * @param agilite      vitalite du personnage
     * @param intelligence intelligence du personnage
     */
    public Guerrier(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
        TRACE("Guerrier() constructor");

        nomAttaqueBasique = "Coup d'épée";
        nomAttaqueSpeciale = "Coup de rage";
    }

    /**
     * attaqueBasique lance l'attaque basique du Guerrier
     * @param attaquant le joueur qui lance l'attaque
     * @param attaque   le joueur attaqué
     */
    @Override
    protected void attaqueBasique(Joueur attaquant, Joueur attaque){
        TRACE("Guerrier.attaqueBasique()");

        Interaction.affichageMessage(attaquant.nomJoueur + " lance "+ attaquant.perso.nomAttaqueBasique + " et inflige " + force + " dommages.");
        Interaction.affichageMessage(attaque.nomJoueur + " perd " + force + " points de vie.");

        attaque.perso.vitalite = attaque.perso.vitalite - force;
    }

    /**
     * attaqueSpeciale lance l'attaque spéciale du Guerrier
     * @param attaquant le joueur qui lance l'attaque
     * @param attaque   le joueur attaqué
     */
    @Override
    protected void attaqueSpeciale(Joueur attaquant, Joueur attaque){
        TRACE("Guerrier.attaqueSpeciale()");

        Interaction.affichageMessage(attaquant.nomJoueur + " lance "+ attaquant.perso.nomAttaqueSpeciale + " et inflige " + (force*2) + " dommages.");
        Interaction.affichageMessage(attaque.nomJoueur + " perd " + (force*2) + " points de vie.");
        Interaction.affichageMessage(attaquant.nomJoueur + " perd " + (force/2) + " points de vie.");

        attaque.perso.vitalite = attaque.perso.vitalite - (force*2);
        vitalite = vitalite - (force/2);

    }


}
