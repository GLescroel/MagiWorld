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
     * @param attaquant le joueur qui lance l'attaque
     * @param attaque   le joueur attaqué
     */
    @Override
    protected void attaqueBasique(Joueur attaquant, Joueur attaque){
        TRACE("Rodeur.attaqueBasique()");

        Interaction.affichageAttaqueBasique(attaquant.nomJoueur, attaque.nomJoueur, attaquant.perso.nomAttaqueBasique, agilite);

        attaque.perso.vitalite = attaque.perso.vitalite - agilite;
    }

    /**
     * attaqueSpeciale lance l'attaque spéciale du Rodeur
     * @param attaquant le joueur qui lance l'attaque
     * @param attaque   le joueur attaqué
     */
    @Override
    protected void attaqueSpeciale(Joueur attaquant, Joueur attaque){
        TRACE("Rodeur.attaqueSpeciale()");

        Interaction.affichageMessage(attaquant.nomJoueur + " lance "+ attaquant.perso.nomAttaqueSpeciale + " et gagne " + (niveau/2) + " en agilité.");

        agilite = agilite + (niveau/2);

    }


}
