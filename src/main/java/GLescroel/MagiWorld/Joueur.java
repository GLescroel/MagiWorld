package GLescroel.MagiWorld;

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

        creationPersonnage();

    }

    private void creationPersonnage(){

        String[] choixPerso = {Personnage.persoGuerrier, Personnage.persoMage, Personnage.persoRodeur};
        String demande = "Veuillez choisir la classe de votre personnage :";
        String choix = choixPerso[Interaction.demanderChoix(demande, choixPerso)-1];

        int niveau = 0;
        int force = 0;
        int agilite = 0;
        int intelligence = 0;
        do {
            demande = "Niveau du personnage ?";
            niveau = Interaction.demanderNombre(demande, 1, 100);

            demande = "Force du personnage ?";
            force = Interaction.demanderNombre(demande, 0, 10);

            demande = "Agilité du personnage ?";
            agilite = Interaction.demanderNombre(demande, 0, 10);

            demande = "Intelligence du personnage ?";
            intelligence = Interaction.demanderNombre(demande, 0, 10);

        }while (force + intelligence + agilite != niveau);

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

