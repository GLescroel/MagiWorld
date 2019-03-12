package GLescroel.MagiWorld;

import static GLescroel.MagiWorld.Log.TRACE;

/**
 * Classe Rodeur étend Personnage
 * décrit les spécificités du personnage Rodeur
 */
public class Rodeur extends Personnage {

    /**
     * Rodeur() constructor
     *
     * @param niveau       niveau du personnage
     * @param force        force du personnage
     * @param agilite      vitalite du personnage
     * @param intelligence intelligence du personnage
     */
    public Rodeur(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
        TRACE("Rodeur() constructor");

        nomAttaqueBasique = "Tir à l'arc";
        nomAttaqueSpeciale = "Concentration";
    }

    /**
     * attaqueBasique lance l'attaque basique du Rodeur
     * @param joueur le joueur attaqué
     */
    protected void attaqueBasique(Joueur joueur){
        TRACE("Rodeur.attaqueBasique()");

        joueur.perso.vitalite = joueur.perso.vitalite - agilite;
    }

    /**
     * attaqueSpeciale lance l'attaque spéciale du Rodeur
     * @param joueur le joueur attaqué
     */
    protected void attaqueSpeciale(Joueur joueur){
        TRACE("Rodeur.attaqueSpeciale()");

        agilite = agilite + (niveau/2);

    }


}
