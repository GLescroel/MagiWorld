package GLescroel.MagiWorld;

import static GLescroel.MagiWorld.Main.*;
import static GLescroel.MagiWorld.Partie.monDevLogger;

/**
 * Classe Log pour l'enregistrement des logs et debug avec Log4J
 */
public class Log {

    public static String MODERUN = "";

    public static final String runModeDebug = "DEBUG";
    public static final String runModeDev = "DEV";
    public static final String runModeProd = "PROD";

    /**
     * recupModeExecution() récupère le mode d'exécution passé en paramètre
     * @param args les arguments éventuels envoyés dans la ligne de commande
     */
    public static void recupModeExecution(String[] args) {
        if(args.length > 0) {
            if (args[0].equals("-DEV") || args[0].equals("-DEBUG") || args[0].equals("-PROD"))
                MODERUN = args[0].replace("-", "");

            if(MODERUN.equals(runModeDebug))
                monLogger.debug("MODERUN en ligne de commande = " + MODERUN);

            DEBUG_DEV("MODERUN en ligne de commande ; " + MODERUN);
        }
        else MODERUN = runModeProd;
    }

    /**
     * TRACE() enregistre une trace si mode DEBUG
     * @param trace = la trace à enregistrer
     */
    public static void TRACE(String trace){

        if(MODERUN.equals(runModeDebug)) {
            monLogger.trace("----------Log.TRACE()----------");
            monLogger.trace("----------" + trace + "----------");
        }
    }

    /**
     * DEBUG() enregistre le debug si mode DEBUG
     * @param debug = le debug à lggger
     */
    public static void DEBUG(String debug){

        if(MODERUN.equals(runModeDebug)) {
            monLogger.trace("----------Log.DEBUG()----------");
            monLogger.debug(debug);
        }
    }

    /**
     * DEBUG_DEV() enregistre le debug si mode DEBUG
     * @param debug_affiche = le debug à lggger
     */
    public static void DEBUG_DEV(String debug_affiche){
        TRACE("Log.DEBUG_DEV()");
        if(MODERUN.equals(runModeDev)){
            monDevLogger.debug(debug_affiche);
        }
    }

}
