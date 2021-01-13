# Présentation

Bienvenue dans ce recueil d'exercices pour apprendre Java dans le secondaire.

Le but de ce recueil est de regrouper des exercices à travailler en autonomie, en classe ou à la maison, dans le but d'apprendre progressivement quelques concept de programmation _impérative_, dans un premier temps, puis de _Programmation Orientée Objet_, par la suite, avec le langage *Java*.

# Comment ça marche ?

Le principe est simple : sur chaque page se trouvent un ou plusieurs exercices à faire avec un énoncé et une présentation des variables qui seront données en entrée ainsi que les sorties qui sont attendues.

Ensuite on trouve un cadre, comme ci-dessous, dans lequel il faut taper son code. Une partie du code est déjà prérempli et il ne vaut mieux pas toucher l'en-tête.

Pour résoudre l'exercice, il faut créer un programme qui passera les tests lorsqu'on appuie sur `Run`.

Pour vous entrainer, essayez de rajouter `System.out.println("Hello World");` (Attention aux majuscules !) dans le programme suivant puis testez-le en appuyant sur } `Run`.

**Remarques**
 - `System.out.println()`est une instruction d'affichage dans le terminal ;
 - en Java, les instructions se terminent toujours par un `;` ;
 - `//` précise que la fin de la ligne est *un commentaire*, qui est essentiellement là pour la bonne lisibilité du code, pour indiquer des informations qui ne seront pas prises en compte par l'ordinateur au moment de l'exécution du programme.

 @[Hello World !]({"stubs": ["ch00/HelloWorld.java"], "command": "ch00/HelloWorldTest#test.java"})


```java runnable
// { autofold
public class Main {
  public static void main(String[] args) {
    System.out.println(donneReponse());
  }

  public static String donneReponse(){
// }
    //NE PAS CHANGER AVANT
    // A COMPLETER : VOTRE CODE . . .
    //NE PAS CHANGER APRES
// { autofold
    return "Okayyyy!";
  }
}
// }
```
