# Cours : Variables, types et opérations

## Partie III : Exercices
### Questionnaires QCM

Voici quelques QCM pour voir si vous avez bien compris. N'hésitez pas à relire ce qui précède si vous avez un doute.

#### QCM 1
```java
int a = 5 ;
int b = a - 2 ;
System.out.println(a * b);
```  
?[Quelle valeur sera affichée si on exécute le programme ci-dessus ? ]
-[ ] -10
-[x] 15
-[ ] 23
-[ ] 3
-[ ] 8

---

#### QCM 2
```java
int a = 5 ;
a = a - 2 ;
a = a * a + 1 ;
System.out.println(a);
```  
?[Quelle valeur sera affichée si on exécute le programme ci-dessus ? ]
-[ ] 16
-[ ] 26
-[ ] 12
-[x] 10

---

#### QCM 3
```java
int a = 7 ;
System.out.println(a / 2);
```
?[Quelle valeur sera affichée si on exécute le programme ci-dessus ? ]
-[ ] 7
-[ ] 7 2
-[x] 3.5
-[ ] 3.0
-[ ] 3
-[ ] 4

---

#### QCM 4
```java
int a = 7 ;
int b = a - 1 ;
System.out.println((b / 2));
```
?[Quelle valeur sera affichée si on exécute le programme ci-dessus ? ]
-[ ] 6.0
-[ ] 3.0
-[x] 3
-[ ] 4  

---

##### QCM 5
> L'instruction `Math.sqrt()`calcule la racine carrée d'un nombre -au format `double`-, par exemple `Math.sqrt(100)` donne `10.0` et `Math.sqrt(2)` donne `1.4142135623730951`.

```java
int a = 3 ;
int b = a + 1 ;
System.out.println(Math.sqrt(a*a + b*b)) ;
```
?[Quelle valeur sera affichée si on exécute le programme ci-dessus ? ]
-[ ] 25
-[ ] 25.0
-[ ] 13.0
-[ ] 12.5
-[ ] 5
-[x] 5.0

---

###### QCM 6
```java
int a = 22;
int b = 5;
System.out.println((a / b) + (a % b));
```
?[Quelle valeur sera affichée si on execute le programme ci-dessus ? ]
-[ ] 6.4
-[ ] 4.4
-[x] 6
-[ ] 114.4

===

### À vous !

#### Exercice 1 :

Le but de cet exercice est de suivre un programme de calcul en partant d'un entier `n` qui sera donné automatiquement.

Appuyez sur `Run` et suivez les instructions qui s'affichent.

Remplacez le mot-clé `pass` par votre code.
Ajoutez au fur et à mesure ce qu'on vous demande dans les instructions en dessous.
N'effacez rien de ce que vous écrivez... sauf si ce n'est pas juste.

Quand on vous demande d'afficher, utilisez la fonction `System.out.println()`.

@[Programme de calcul]({"stubs": ["ch01/Calcul_13_1.java"], "command": "ch01/Calcul_13_1_TEST.java"})

---

#### Exercice 2 :

La consigne de cet exercice est identique au précédent.

Appuyez sur `Run` et suivez les instructions qui s'affichent.

NRemplacez le mot-clé `pass` par votre code.
Ajoutez au fur et à mesure ce qu'on vous demande dans les instructions en dessous.
N'effacez rien de ce que vous écrivez... sauf si ce n'est pas juste.

Quand on vous demande d'afficher, utilisez la fonction `System.out.println()`.

@[Programme de calcul]({"stubs": ["ch01/Calcul_13_2.java"], "command": "ch01/Calcul_13_2_TEST.java"})

---
