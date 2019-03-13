Contexte : 
ce projet est l'impl�mentation d'un jeu de combat �pique entre 2 joueurs sur le m�me ordinateur en mode console.
ce projet contient un fichier de param�trage log4j2.xml pour param�trer le loggin par log4j

---------------------------------------------------------------------------------------------------------------------------------

Pr�-requis :
- java 1.8 minimum
- maven

---------------------------------------------------------------------------------------------------------------------------------

Build du projet :
en ligne de commande, se positionner dans le r�pertoire du projet et "mvn clean package"

---------------------------------------------------------------------------------------------------------------------------------

Ex�cution :
- en ligne de commande, se positionner dans le r�pertoire projet/target et 
- lancer "java -jar MagiWorld-1.0-SNAPSHOT-jar-with-dependencies.jar -[mode]" pour modifier le mode d'ex�cution avec mode
  - PROD : pas de trace ni affichage de debug
  - DEV : affichage console de messages de debug
  - DEBUG : trace dans le fichier Logs/myGames.log l'ex�cution de toutes les m�thodes appel�es pendant l'ex�cution

---------------------------------------------------------------------------------------------------------------------------------

Logs :
En mode DEBUG, les traces sont enregistr�es dans le fichier Logs/MagiWordl.log

---------------------------------------------------------------------------------------------------------------------------------
