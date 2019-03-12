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
     * @param attaquant le joueur qui lance l'attaque
     * @param attaque   le joueur attaqué
     */
    @Override
    protected void attaqueBasique(Joueur attaquant, Joueur attaque){
        TRACE("Mage.attaqueBasique");

        Interaction.affichageMessage(attaquant.nomJoueur + " lance "+ attaquant.perso.nomAttaqueBasique + " et inflige " + intelligence + " dommages.");
        Interaction.affichageMessage(attaque.nomJoueur + " perd " + intelligence + " points de vie.");

        attaque.perso.vitalite = attaque.perso.vitalite - intelligence;
    }

    /**
     * attaqueSpeciale lance l'attaque spéciale du Mage
     * @param attaquant le joueur qui lance l'attaque
     * @param attaque   le joueur attaqué
     */
    @Override
    protected void attaqueSpeciale(Joueur attaquant, Joueur attaque){
        TRACE("Mage.attaqueSpeciale");

        Interaction.affichageMessage(attaquant.nomJoueur + " lance "+ attaquant.perso.nomAttaqueSpeciale + " et gagne " + (intelligence*2) + " en vitalité.");

        vitalite = vitalite + (intelligence*2);
        if(vitalite >= (niveau*5))
            vitalite = niveau*5;
    }


}
