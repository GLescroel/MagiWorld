package GLescroel.MagiWorld;

import static GLescroel.MagiWorld.Log.TRACE;

/**
 * Classe Personnage représente les caractéristiques génériques d'un personnage
 */
public abstract class Personnage {

    public static final String persoGuerrier = "Guerrier";
    public static final String persoRodeur = "Rodeur";
    public static final String persoMage = "Mage";

    protected int niveau;
    protected int vitalite;
    protected int force;
    protected int agilite;
    protected int intelligence;

    protected String nomAttaqueBasique;
    protected String nomAttaqueSpeciale;

    protected abstract void attaqueBasique(Joueur joueur);
    protected abstract void attaqueSpeciale(Joueur joueur);

    /**
     * Personnage() constructor
     * @param niveau niveau du personnage
     * @param force force du personnage
     * @param agilite vitalite du personnage
     * @param intelligence intelligence du personnage
     */
    public Personnage(int niveau, int force, int agilite, int intelligence) {
        TRACE("Personnage() constructor");

        this.niveau = niveau;
        this.vitalite = niveau * 5;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
    }

}
