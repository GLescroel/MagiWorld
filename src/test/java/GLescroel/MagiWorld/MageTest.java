package GLescroel.MagiWorld;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class MageTest {

    @Test
    public void Given_Mage_When_AttaqueBasique_Then_AdversairePerdVitalite() {

        System.setIn(new ByteArrayInputStream(String.format("1\n10\n10\n0\n0\n").getBytes()));
        Joueur joueur2 = new Joueur("Joueur2");
        joueur2.perso = new Guerrier(10,10,0,0);
        Mage mage = new Mage(10, 1, 1, 8);
        mage.attaqueBasique(joueur2);

        assertEquals(42, joueur2.perso.vitalite);
    }

    @Test
    public void Given_Mage_When_AttaqueSpeciale_Then_VitaliteAugmente() {
        Joueur joueur1 = new Joueur("Joueur1");
        Joueur joueur2 = new Joueur("Joueur2");
        joueur2.perso = new Guerrier(10,10,0,0);
        joueur1.perso = new Mage(10, 1, 1, 8);
        joueur2.perso.attaqueSpeciale(joueur1);
        joueur1.perso.attaqueSpeciale(null);

        assertEquals(46, joueur1.perso.vitalite);
    }
}