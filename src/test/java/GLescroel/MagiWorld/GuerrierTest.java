package GLescroel.MagiWorld;

import org.junit.Test;

import static org.junit.Assert.*;

public class GuerrierTest {

    @Test
    public void Given_Guerrier_When_AttaqueBasique_Then_AdversairePerdVitalite() {
        Joueur joueur1 = new Joueur("Joueur1");
        Joueur joueur2 = new Joueur("Joueur2");
        joueur1.perso = new Mage(10, 1, 1, 8);
        joueur2.perso = new Guerrier(10,10,0,0);
        joueur2.perso.attaqueBasique(joueur1);

        assertEquals(40, joueur1.perso.vitalite);
    }

    @Test
    public void Given_Guerrier_When_AttaqueSpeciale_Then_TousPerdentVitalite() {
        Joueur joueur1 = new Joueur("Joueur1");
        Joueur joueur2 = new Joueur("Joueur2");
        joueur1.perso = new Mage(10, 1, 1, 8);
        joueur2.perso = new Guerrier(10,10,0,0);
        joueur2.perso.attaqueSpeciale(joueur1);

        assertEquals(30, joueur1.perso.vitalite);
        assertEquals(45, joueur2.perso.vitalite);
    }
}