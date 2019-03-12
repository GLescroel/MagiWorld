package GLescroel.MagiWorld;

import static GLescroel.MagiWorld.Log.TRACE;

/**
 * Classe Mage étend Personnage
 * décrit les spécificités du personnage Mage
 */
public class Mage extends Personnage {

    /**
     * Mage() constructor
     *
     * @param niveau       niveau du personnage
     * @param force        force du personnage
     * @param agilite      vitalite du personnage
     * @param intelligence intelligence du personnage
     */
    public Mage(int niveau, int force, int agilite, int intelligence) {
        super(niveau, force, agilite, intelligence);
        TRACE("Mage() constructor");

        nomAttaqueBasique = "Boule de feu";
        nomAttaqueSpeciale = "Soin";

    }

    /**
     * attaqueBasique lance l'attaque basique du Mage
     * @param joueur le joueur attaqué
     */
    protected void attaqueBasique(Joueur joueur){
        TRACE("Mage.attaqueBasique");

        joueur.perso.vitalite = joueur.perso.vitalite - intelligence;
    }

    /**
     * attaqueSpeciale lance l'attaque spéciale du Mage
     * @param joueur le joueur attaqué
     */
    protected void attaqueSpeciale(Joueur joueur){
        TRACE("Mage.atrtaqueSpeciale");

        vitalite = vitalite + (intelligence*2);
        if(vitalite >= (niveau*5))
            vitalite = niveau*5;
    }


}
