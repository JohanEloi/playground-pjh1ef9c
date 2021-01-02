# Cours : Variables, types et opérations

## Partie 1 : Les variables et leur type

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

Pour afficher la valeur d'une variable, on peut utiliser les instructions `System.out.print()` ou `System.out.println()`, cette dernière *va à la ligne* après l'affichage du contenu.

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

## Partie II : Les opérations sur les variables numériques

### Les types de variables

En Java, il y a 8 *types primitifs*.
+ 4 types de nombres entiers :
  - `byte` : pour un très petit nombre entier, entre `-128` et `+127` ;
  - `short`: pour un petit nombre entier, entre `-32 768` et `32 767` ;
  - `ìnt` : pour un nombre entier entre `-2 147 483 648` et `2 147 483 647` ;
  - `long` : pour un grand nombre entier, entre `-9 223 372 036 854 775 808` et `9 223 372 036 854 775 807`.
+ 2 types de nombres *à virgule* :
  - `float`: pour un nombre décimal, codé sur 4 octets ;
  - `double`: pour un nombre décimal, codé sur 8 octets.
+ Et enfin :
  - `char`: pour un caractère, codé sur 2 octets, supporte l'Unicode ;
  - `boolean`: pour représenter une information booléenne, c'est-à-dire soit *VRAI* `true`, soit *FAUX* `false`.

> *Dans la pratique, nous utiliserons le type `int` pour un nombre entier et le type `double` pour un nombre à virgule.*

A côté de ces 8 types *primitifs*, nous avons déjà rencontré le type *chaine de caractères* : `String`.

**Code**  

``` java
byte heure = 0 ; // l'heure est entre 0 et 23
short annee = 2021 ;
int n ; //n est déclaré mais pas initialisé
long l ;
float x ;
double delta ;
char c = 'a' ; // un caractère est toujours entre ' et '
boolean b = false ; // ou bien true
String s = "Hello World !" ;// une chaine de caractères est toujours en " et "
```

### Les opérations numériques

Dans cette partie, nous allons voir les opérations de base que l'on peut effectuer en java sur des nombres.

**Remarque** il faut bien distinguer, en java, l'utilisation d'un entier de l'utilisation d'un nombre à virgule. En effet, ils sont différents sous différents aspects.

A titre d'exemple, ajoutez les instructions suivantes et exécutez :
  - `System.out.print("n = ") ; System.out.println(n) ;`
  - `System.out.print("d = ") ; System.out.println(d) ;`

```java runnable
// { autofold
public class Main{
  public static void main(String[] args){
// }
int n = 5 ;
double d = 5 ;
//Ajoutez ici les instructions
//{autofold
  }
}
//}
```

Même si on affecte aux variables `n` et `d` le nombre `5`, à l'affichage, le `int` et le `double` apparaissent différemment : `5`et `5.0`. Nous verrons qu'il y a d'autres différences, notamment au niveau calculatoire.

+ Commençons par les quatre opérations classiques `+`, `-`, `*`, `/` avec les priorités opératoires habituelles. Par exemple :

```java runnable
// { autofold
public class Main{
  public static void main(String[] args){
// }
int n1 = 5 ; int n2 = 3 ;
System.out.println(n1 + n2);
System.out.println(n1 - n2);
System.out.println(n1 * n2);
System.out.println(n1 / n2);
System.out.println(" ********************");
double d1 = 5 ; double d2 = 3 ;
System.out.println(d1 + d2);
System.out.println(d1 - d2);
System.out.println(d1 * d2);
System.out.println(d1 / d2);

// { autofold
  }
}
// }
```

> Nous remarquons que la division entre 2 `int` et 2 `double` est différente ! La première est la *division entière* et la deuxième est la division réelle.

+ La **division euclidienne**
 - La **division entière** et est donnée par `n / m`où `n`et `m`sont 2 variables de type `int`. Le résultat de la division entière est l'entier `q` tel que `0 <= n-qm < m`.

>Exemples
  - `25/7 = 3` car 25-3*7=4 et 0<=4<7
  - `27/7 = 3` car 27-3*7=6 et 0<=7<7
  - `28/7 = 4` car 28-4*7=0 et 0<=0<7

  - Le **reste de la division entière** est donné par `n % m` :
>
  - `25 % 7 = 4`
  - `27 % 7 = 6`
  - `28 % 7 = 0`

- Calcul d'une division euclidienne (la "division écrite" apprise en primaire), par exemple : **25 / 7 vaut 3 reste 4**

Compléter le code suivant pour que ce programme affiche un résultat comme ci-dessus

```java runnable
//{autofold
public class Main{
  public static void main(String[] args){      
//}
int n = 25 ; //Valeur qui peut être modifiée !
int m = 7 ; //idem !
//MODIFIER LES 2 LIGNES SUIVANTES
int quotient = 0 ;
int reste = 0 ;

System.out.print("n vaut ");System.out.println(n);
System.out.print("m" vaut ");System.out.println(m);
System.out.print("La division entière de n par m vaut ");System.out.println(quotient);
System.out.print("et son reste vaut ");System.out.println(reste);
//{autofold
  }
}
//}
```

+ Les deux autres opérations qu'on utilise couramment sont les puissances et la racine carrée.
  - Pour les _puissances_, on double simplement la multiplication. Ainsi $`x^n`$ s'obtiendra en écrivant `x**n`.
  - Pour la _racine carrée_, on va simplement utiliser une propriété mathématique : $`\sqrt x = x^{0.5}`$. Donc pour calculer la racine carrée d'un nombre `x`, il suffit d'écrire `x**0.5`.

  **Exemples**.
  On a ajouté des commentaires à coté des instructions d'affichage des calculs pour que ces instructions soient plus claires. Pour écrire un commentaire, il suffit de mettre un `#` (hashtag) devant. Tout ce qui suit le `#` ne sera pas executé par python et ne sert donc qu'à la personne qui lit le programme.
  ```python runnable
  print(2**3) # Affiche le résultat de 2 puissance 3
  print(3**2) # Affiche le résultat de 3 puissance 2
  print(9**0.5) # Affiche la racine carrée de 9
  print(2**0.5) # Affiche la racine carrée de 2
  ```

+ On peut aussi réaliser facilement des divisions euclidiennes (c'est-à-dire les divisions posées comme au primaire).
  - Pour obtenir le _quotient_ de la division de `a` par `b`, il suffit d'écrire `a // b`.
  - Pour obtenir le _reste_ de la division de `a` par `b`, il suffit d'écrire `a % b`.

  Remarque : La différence entre `a / b`et `a // b`est que le premier donne une valeur approchée décimale à 16 chiffres après la virgule alors que la deuxième nous donne l'_entier_ q tel que 0 <= a-bq < b.

  Voici quelques exemples que vous pouvez modifier pour vérifier que vous avez bien compris.
  ```python runnable
  a = 17
  b = 3
  print(a // b) # Affiche le quotient de la division euclidienne de a par b
  print(a % b)  # Affiche le reste de la division euclidienne de a par b
  ```

  **Remarque**. Même si ces opérations sont finalement assez peu utilisées en cours de mathématiques, elles le sont beaucoup plus en informatique, principalement le calcul du reste de la division euclidienne (l'opérateur modulo).
  Par exemple pour déterminer si un nombre est pair, il suffit de regarder si `x % 2` vaut 0. En effet, un nombre est pair si et seulement si son reste par la division par 2 est nul. On l'utilisera régulièrement dans les exercices.
