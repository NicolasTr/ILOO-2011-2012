README
======

Comment créer un dépôt git pour mon groupe?
-------------------------------------------

1. [Créer un dépôt git privé][6] sur [assembla.com][7]
2. Cloner le dépôt
3. Lancer la commande suivante "git remote add iloo git@github.com:NicolasTr/ILOO-2011-2012.git"

Toutes les modifications se feront sur votre propre dépôt (pour faire un push, utiliser "push origin master")

Comment récupérer le code des autres groupes?
---------------------------------------------

1. Lancer la commande suivante "git pull iloo master"

Commment partager mon code avec les autres groupes?
---------------------------------------------------

1. Lancer le script "./push_jar.sh"

Le premier argument doit être le type de groupe (Game ou GUI)
Le second argument doit être le groupe (groupxx)

Comment créer un projet sur netbeans?
-------------------------------------

1. Renommer le fichier build.xml en build2.xml
2. [Créer un projet java dans netbeans (avec sources existantes)][4]
3. Supprimer le fichier build.xml de netbeans
4. Renommer le fichier build2.xml en build.xml
5. [Ajouter les sources][5]

Comment créer un projet sur eclipse?
------------------------------------

1. [Créer un projet java][1]
2. [Ajouter le dossier avec les sources ("link source" dans les options du projet)][2]
3. [Créer un "Ant builder" dans les options du projet (Utilisez le fichier build.xml et votre dépôt git)][3]

[1]: http://dl.dropbox.com/u/14582957/iloo/01.png
[2]: http://dl.dropbox.com/u/14582957/iloo/02.png
[3]: http://dl.dropbox.com/u/14582957/iloo/03.png
[4]: http://dl.dropbox.com/u/14582957/iloo/04.png
[5]: http://dl.dropbox.com/u/14582957/iloo/05.png
[6]: http://dl.dropbox.com/u/14582957/iloo/06.png
[7]: http://http://www.assembla.com/

