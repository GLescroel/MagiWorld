package GLescroel.MagiWorld;

import static GLescroel.MagiWorld.Log.DEBUG_DEV;

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
        this.nomJoueur = nomJoueur;
    }

    protected void creationPersonnage(){

        Interaction.affichageMessage("Création du personnage du " + nomJoueur);

        String[] choixPerso = {Personnage.persoGuerrier, Personnage.persoMage, Personnage.persoRodeur};
        String demande = "Veuillez choisir la classe de votre personnage";
        String choix = choixPerso[Interaction.demanderChoix(demande, choixPerso)-1];

        DEBUG_DEV(choix);

        int niveau = 0;
        int force = 0;
        int agilite = 0;
        int intelligence = 0;
        do {
            demande = "Niveau du personnage ?";
            niveau = Interaction.demanderNombre(demande, 1, 100);

            demande = "Force du personnage ?";
            force = Interaction.demanderNombre(demande, 0, 100);

            demande = "Agilité du personnage ?";
            agilite = Interaction.demanderNombre(demande, 0, 100);

            demande = "Intelligence du personnage ?";
            intelligence = Interaction.demanderNombre(demande, 0, 100);

            if(force + intelligence + agilite != niveau)
                Interaction.affichageMessage("Force + intelligence + agilité != niveau\nChoisissez à nouveau");

        }while(force + intelligence + agilite != niveau);

        switch (choix){
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

