package GLescroel.MagiWorld;

import org.junit.Test;

import static org.junit.Assert.*;

public class RodeurTest {

    @Test
    public void Given_Rodeur_When_AttaqueBasique_Then_AdversairePerdVitalite() {
        Joueur joueur2 = new Joueur("joueur2");
        joueur2.perso = new Guerrier(10,10,0,0);
        Rodeur rodeur = new Rodeur(10, 1, 5, 4);
        rodeur.attaqueBasique(joueur2);

        assertEquals(45, joueur2.perso.vitalite);
    }

    @Test
    public void Given_Rodeur_When_AttaqueSpeciale_Then_AgiliteAugmente() {

        Joueur joueur2 = new Joueur("Joueur2");
        joueur2.perso = new Guerrier(10,10,0,0);
        Rodeur rodeur = new Rodeur(10, 1, 5, 4);
        rodeur.attaqueSpeciale(joueur2);

        assertEquals(10, rodeur.agilite);

    }
}