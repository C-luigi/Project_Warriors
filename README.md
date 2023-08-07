# Java

- **Introduction**

  Java est un langage de programmation généraliste orienté objet. Nous n’allons pas copier Wikipedia ici (voir [Java (langage) — Wikipédia](https://fr.wikipedia.org/wiki/Java_(langage)) ), mais relever un point important par rapport aux langages que vous avez rencontrés jusqu’à maintenant (JavaScript, PHP, ...).

  Java est un langage **statiquement typé** et **compilé** :

    - les variables sont définies avec un type de données (une variable “String” ne pourra contenir que des valeurs de type "String")
    - les fichiers sources devront être compilés (sorte de traduction) en fichiers “classes” avant d’être exécutés

  Cela oblige à bien définir les types des variables et à subir l’étape supplémentaire de compilation mais apporte plusieurs avantages :

    - certaines erreurs sont détectées lors de la compilation et non lors de l’exécution (le code est plus “sûr”)
    - des optimisations plus poussées peuvent être mises en œuvre
    - les classes générées sont indépendantes du système.

  Mais… même dans le développement, tout n’est pas binaire ! Même si cela est moins visible, lors de l’exécution d’un code JavaScript (on parle alors de code interprété car “lu” au fur et à mesure des besoins), ce code peut être localement compilé pour être exécuté et accéléré.

  Le principe est juste moins poussé que pour le langage Java et la différence est historique. Les langages interprétés étaient alors exécutés comme nous le faisons en lisant le code ! De même, des extensions à JavaScript peuvent apporter du typage statique. Et dans l’autre sens, beaucoup de frameworks rendent l’opération de compilation en Java quasi invisible… On peut donc relativiser ces différences !


La commande **javac** (Java Compiler) produit le fichier compilé File*.class*.

La commande **java** File exécute ces étapes :

- cherche la classe File dans l’environnement (par défaut dans le répertoire courant définie dans **File*.class*
- charge cette classe
- cherche la méthode par défaut, main et l’exécute
- Notion POO java

  Programmation Orientée Objet (POO) : Approche de programmation où le logiciel est structuré autour d'objets, qui sont des instances de classes représentant des entités avec des attributs et des méthodes.

    - Classe : Modèle ou plan définissant les attributs et les méthodes que tous les objets créés à partir de cette classe auront.
    - Instance : Création d'un objet réel à partir d'une classe. Chaque instance a ses propres valeurs d'attributs et comportements spécifiés par sa classe.
    - Objet : Instance d'une classe, possédant ses propres valeurs d'attributs et pouvant effectuer des actions spécifiées par sa classe.
    - Méthode : Fonction définie dans une classe qui décrit les comportements d'un objet. Une méthode est souvent liée à un objet spécifique et manipule les données de cet objet.
    - Attribut (ou propriété) : Variable liée à une classe spécifique, chaque objet créé à partir de cette classe ayant sa propre copie de cet attribut.
    - Héritage : Mécanisme de la POO où une nouvelle classe est créée à partir d'une classe existante, héritant de ses attributs et méthodes, permettant la réutilisation de code et le regroupement de classes similaires.
    - Encapsulation : Principe de la POO qui cache les détails internes de la façon dont un objet fonctionne, permettant de modifier ces détails sans affecter d'autres parties du programme.
    - Polymorphisme : Capacité en POO de traiter des objets de différentes classes de manière similaire. Permet à une méthode d'avoir plusieurs formes, ou à des classes différentes d'avoir des méthodes du même nom.

  —————————————————————————————————————————

    - Constructeur : Méthode spéciale d'une classe qui est automatiquement appelée lorsqu'un nouvel objet de cette classe est créé. Utilisé pour initialiser les attributs de l'objet.
    - Classe abstraite : Classe qui ne peut pas être instanciée, souvent utilisée comme classe de base pour l'héritage.
    - Surcharge de méthode : Possibilité de définir plusieurs méthodes avec le même nom mais avec des paramètres différents dans une même classe.
    - Surcharge d'opérateur : En POO, permet de redéfinir la manière dont les opérateurs standard (comme +, -, *, /) fonctionnent pour une classe spécifique.

## Why Java start at method main ?

The Java `main` method is usually the first method you learn about when you start programming in Java because its the entry point for executing a Java program. The `main` method can contain code to execute or call other methods, and it can be placed in any class that’s part of a program.