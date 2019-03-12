package GLescroel.MagiWorld;

import static GLescroel.MagiWorld.Log.DEBUG_DEV;
import static GLescroel.MagiWorld.Log.TRACE;

/**
 * Classe Joueur représente les joueurs
 */
public class Joueur {
    String nomJoueur;
    Personnage perso;

    /**
     * Joueur() constructor
     * @param nomJoueur nom du joueur
     */
    public Joueur(String nomJoueur){
        TRACE("Joueur() constructor");
        this.nomJoueur = nomJoueur;
    }

    protected void parametragePersonnage(){
        TRACE("Joueur.parametragePersonnage()");

        Interaction.affichageMessage("Création du personnage du " + nomJoueur);

        String[] choixPerso = {Personnage.persoGuerrier, Personnage.persoMage, Personnage.persoRodeur};
        String choix = choixPerso[Interaction.demanderChoix("Veuillez choisir la classe de votre personnage", choixPerso)-1];

        DEBUG_DEV(choix);

        boolean parametrageOk = true;
        do {
            int niveau = Interaction.demanderNombre("Niveau du personnage ?", 1, 100);
            int force = Interaction.demanderNombre("Force du personnage ?", 0, 100);
            int agilite = Interaction.demanderNombre("Agilité du personnage ?", 0, 100);
            int intelligence = Interaction.demanderNombre("Intelligence du personnage ?", 0, 100);

            if(force + intelligence + agilite != niveau) {
                parametrageOk = false;
                Interaction.affichageMessage("Force + intelligence + agilité != niveau\nChoisissez à nouveau");
            }
            else
            {
                parametrageOk = true;
                creationPersonnage(choix, niveau, force, agilite, intelligence);
            }
        }while(!parametrageOk);
    }

    private void creationPersonnage(String personnage, int niveau, int force, int agilite, int intelligence) {
        TRACE("Joueur.creationPersonnage()");

        switch (personnage) {
            case Personnage.persoGuerrier:
                this.perso = new Guerrier(niveau, force, agilite, intelligence);
                break;
            case Personnage.persoMage:
                this.perso = new Mage(niveau, force, agilite, intelligence);
                break;
            case Personnage.persoRodeur:
                this.perso = new Rodeur(niveau, force, agilite, intelligence);
                break;
        }
    }
}

