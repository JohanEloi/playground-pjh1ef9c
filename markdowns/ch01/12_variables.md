# Cours : Variables, types et opérations

## Partie 2 : Les opérations sur les variables numériques

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

> **Remarque préliminaire** il faut bien distinguer, en java, l'utilisation d'un entier de l'utilisation d'un nombre à virgule. En effet, sous bien des aspects, ils se comportent de manière différente !

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

#### Opérations classiques
Commençons par les quatre opérations classiques `+`, `-`, `*`, `/` avec les priorités opératoires habituelles. Par exemple :

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

Nous remarquons que la division entre 2 `int` et 2 `double` est différente ! La première est la *division entière* et la deuxième est la division réelle.

#### La division euclidienne
  + La **division entière** et est donnée par `n / m`où `n`et `m`sont 2 variables de type `int`. Le résultat de la division entière est l'entier `q` tel que `0 <= n-qm < m`.
    - `25/7 = 3` car 25-3*7=4 et 0<=4<7
    - `27/7 = 3` car 27-3*7=6 et 0<=7<7
    - `28/7 = 4` car 28-4*7=0 et 0<=0<7

  + Le **reste de la division entière** est donné par `n % m` :
    - `25 % 7 = 4`
    - `27 % 7 = 6`
    - `28 % 7 = 0`

  + Calcul d'une division euclidienne (la "division écrite" apprise en primaire), par exemple : **25 / 7 vaut 3 reste 4**

Modifier le code suivant pour que ce programme affiche le résultat de la division euclidienne de `n`par `m`.

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

//Affichage des résultats
System.out.print("n vaut ");System.out.println(n);
System.out.print("m vaut ");System.out.println(m);
System.out.print("La division entière de n par m vaut ");System.out.println(quotient);
System.out.print("et son reste vaut ");System.out.println(reste);
//{autofold
  }
}
//}
```

_**Remarque**_. Même si ces opérations sont finalement assez peu utilisées en cours de mathématiques, elles le sont beaucoup plus en informatique, principalement le calcul du reste de la division euclidienne (l'opérateur modulo).
Par exemple pour déterminer si un nombre est pair, il suffit de regarder si `x % 2` vaut 0. En effet, un nombre est pair si et seulement si son reste par la division par 2 est nul. On l'utilisera régulièrement dans les exercices.

#### Division réelle - Conversion de types

Pour effectuer la division réelle, il est donc nécessaire que les valeurs soient de type `double`:
```java runnable
//{autofold
public class Main{
  public static void main(String[] args){
//}
    System.out.println(5/2) ;
    System.out.println(5.0/2.0) ;
    //Ou encore
    int n = 10 ; int m = 3 ;
    double d1 = 10 ; double d2 = 3 ;
    System.out.println(n/m) ;
    System.out.println(d1/d2) ;
//{autofold
  }
}
//}
```

On voit que *directement*, on ne sait pas effectuer la division réelle entre 2 `int`. Il faut **forcer** cette division réelle, en précisant explicitement que la variable doit être considérée comme un `double`.

**Conversion de types** Afin de *convertir* un `int` en `double` il suffit de mettre le nom du type entre parenthèses devant la variable à convertir : `(double) n` convertit l'entier `n` en variable de type `double`.

```java runnable
//{autofold
public class Main{
  public static void main(String[] args){
//}
    int n = 10 ; int m = 3 ;
    System.out.println(n/m) ;
    System.out.println((double)n / (double)m) ;

    double x = 2.5 ; double y = 3.9 ;
    System.out.println(x);
    System.out.println(y);
    System.out.println((int)x);
    System.out.println((int)y);
//{autofold
  }
}
//}
```
