Contexte : 
ce projet est l'implémentation d'un jeu de combat épique entre 2 joueurs sur le même ordinateur en mode console.
ce projet contient un fichier de paramétrage log4j2.xml pour paramétrer le loggin par log4j

---------------------------------------------------------------------------------------------------------------------------------

Pré-requis :
- java 1.8 minimum
- maven

---------------------------------------------------------------------------------------------------------------------------------

Build du projet :
en ligne de commande, se positionner dans le répertoire du projet et "mvn clean package"

---------------------------------------------------------------------------------------------------------------------------------

Exécution :
- en ligne de commande, se positionner dans le répertoire projet/target et 
- lancer "java -jar MagiWorld-1.0-SNAPSHOT-jar-with-dependencies.jar -[mode]" pour modifier le mode d'exécution avec mode
  - PROD : pas de trace ni affichage de debug
  - DEV : affichage console de messages de debug
  - DEBUG : trace dans le fichier Logs/myGames.log l'exécution de toutes les méthodes appelées pendant l'exécution

---------------------------------------------------------------------------------------------------------------------------------

Logs :
En mode DEBUG, les traces sont enregistrées dans le fichier Logs/MagiWordl.log

---------------------------------------------------------------------------------------------------------------------------------
