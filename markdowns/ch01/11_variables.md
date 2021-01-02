# Cours : Variables, types et opérations

## Partie 1 : Notion de variable

Une variable en informatique permet de garder en mémoire (le temps que le programme s'exécute) des données comme par exemple le résultat d'un calcul ou un mot, une liste ou bien d'autres choses.  
Pour stocker en mémoire une valeur dans une variable, on utilise simplement le signe égal `=`.  

En Java, qui est un langage *fortement typé*, on **doit** préciser le *type* d'information que la variable va retenir : un *nombre entier* : `int` ; un *nombre à virgule* : `double` ; une *chaine de caractères* : `String`... Pour indiquer le type de la variable, il suffit (une fois pour toutes) de faire précéder le nom de la variable par son type, par exemple : `int n = 10`signife que `n` est une variable de type `int` et qu'on lui donne la valeur `10`.

> **Définition**.
L'action d'assigner une valeur à une variable se nomme **affectation**.
Par exemple :
```java
int a = 3;
int b = 7;
int c = b + a + 2;
```
Dans cet exemple, on a mis en mémoire trois variables. Dans `a`, on a stocké la valeur 3, dans `b` la valeur 7 et dans `c` la valeur 12.
**Remarque importante** : ce qui est stocké est le *résultat du calcul* et non le calcul. Ce qui veut dire que si on modifie la valeur de `a`, la variable `c` gardera la valeur 12 (jusqu'à ce qu'on la modifie).

On a déjà rencontré une instruction d'affichage [ici](../ch00/01_presentation.md). Pour afficher la valeur d'une variable, on peut utiliser les instructions `System.out.print()` ou `System.out.println()`, cette dernière *va à la ligne* après l'affichage du contenu.

Appuyez sur le bouton Run pour voir l'effet du code ci-dessous :
```java runnable
// { autofold
public class Main{
  public static void main(String[] args){
// }  
    int a = 3;
    int b = 7;
    int c = b + a + 2;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
// { autofold    
  }
}
// }
```
On voit s'afficher la valeur de `a`, puis celle de `b` et enfin la valeur de `c`. Les trois premières instructions (les affectations de `a`, `b` et `c`) se passent dans la mémoire de l'ordinateur. Pour voir, à l'écran, la valeur d'une variable ou un texte quelconque, il est nécessaire d'utiliser une instruction d'affichage (comme `System.out.println()`).

>**Fondamental**.
On peut utiliser une certaine variable `a` pour faire un calcul et stocker la réponse de nouveau dans `a` ce qui aura pour effet de faire disparaitre la première valeur de `a`. C'est très pratique pour éviter d'utiliser trop de variables différentes par exemple.
```java runnable
// { autofold
public class Main{
  public static void main(String[] args){
// }  
    int a = 3;
    a = a + 2;
    System.out.println(a);
    a = a + a;
    System.out.println(a);
// { autofold
  }
}
// }
```
Petite explication des résultats affichés : Au début `a` vaut 3. Ensuite, on lui ajoute 2 et on stocke le résultat dans `a`. Donc maintenant `a` vaut 5, ce qu'on affiche en premier. Enfin on calcule `a+a` donc 5+5=10 qu'on stocke de nouveau dans `a`, d'où l'affichage du 10 en deuxième.
