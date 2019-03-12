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
     * @param joueur le joueur attaqué
     */
    protected void attaqueBasique(Joueur joueur){
        TRACE("Guerrier.attaqueBasique()");

        joueur.perso.vitalite = joueur.perso.vitalite - force;
    }

    /**
     * attaqueSpeciale lance l'attaque spéciale du Guerrier
     * @param joueur le joueur attaqué
     */
    protected void attaqueSpeciale(Joueur joueur){
        TRACE("Guerrier.attaqueSpeciale()");

        joueur.perso.vitalite = joueur.perso.vitalite - (force*2);
        vitalite = vitalite - (force/2);

    }


}
