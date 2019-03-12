package GLescroel.MagiWorld;

import org.junit.Test;

import static org.junit.Assert.*;

public class RodeurTest {

    @Test
    public void Given_Rodeur_When_AttaqueBasique_Then_AdversairePerdVitalite() {
        Joueur joueur1 = new Joueur("joueur1");
        Joueur joueur2 = new Joueur("joueur2");
        joueur2.perso = new Guerrier(10,10,0,0);
        joueur1.perso = new Rodeur(10, 1, 5, 4);
        joueur1.perso.attaqueBasique(joueur1, joueur2);

        assertEquals(45, joueur2.perso.vitalite);
    }

    @Test
    public void Given_Rodeur_When_AttaqueSpeciale_Then_AgiliteAugmente() {

        Joueur joueur1 = new Joueur("Joueur1");
        Joueur joueur2 = new Joueur("Joueur2");
        joueur2.perso = new Guerrier(10,10,0,0);
        joueur1.perso = new Rodeur(10, 1, 5, 4);
        joueur1.perso.attaqueSpeciale(joueur1, joueur2);

        assertEquals(10, joueur1.perso.agilite);

    }
}