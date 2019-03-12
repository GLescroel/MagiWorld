package GLescroel.MagiWorld;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static GLescroel.MagiWorld.Log.recupModeExecution;

/**
 * le Main()
 * lance le programme !
 */
public class Main {

    public static final Logger monLogger = LogManager.getLogger(GLescroel.MagiWorld.Main.class.getName());

    public static void main(String[] args){
        monLogger.trace("----------Main()----------");

        recupModeExecution(args);

        Partie maPartie = new Partie();
        maPartie.demarrerPartie();

    }
}
