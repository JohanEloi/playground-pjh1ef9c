
# Partie II
## Les opérations sur les variables numériques

Dans cette partie, nous allons voir les opérations de base que l'on peut effectuer en python sur des nombres.

+ Il y a bien sûr les quatre opérations classiques `+`, `-`, `*`, `/` avec les priorités opératoires habituelles. Par exemple :
  ```python runnable
  a = 5
  b = 3
  print(a + b)
  print(a - b)
  print(a * b)
  print(a / b)
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

# Partie III
## Questionnaire QCM

Voici quelques QCM pour voir si vous avez bien compris. N'hésitez pas à relire ce qui précède si vous avez un doute.

###### QCM 1
```python
a = 5
b = a - 2
print(a * b)
```
?[Quelle valeur sera affichée si on execute le programme ci-dessus ? ]
-[ ] -10
-[x] 15
-[ ] 23
-[ ] 3
-[ ] 8

---

###### QCM 2
```python
a = 5
a = a - 2
a = a * a + 1
print(a)
```
?[Quelle valeur sera affichée si on execute le programme ci-dessus ? ]
-[ ] 16
-[ ] 26
-[ ] 12
-[x] 10

---

###### QCM 3
```python
a = 7
b = a - 1
print((b / 2)**2)
```
?[Quelle valeur sera affichée si on execute le programme ci-dessus ? ]
-[ ] 6.0
-[ ] 1.5
-[x] 9.0
-[ ] -0.25

---

##### QCM 4
```python
a = 3
b = a + 1
print((a**2 + b**2)**0.5)
```
?[Quelle valeur sera affichée si on execute le programme ci-dessus ? ]
-[x] 5.0
-[ ] 13.0
-[ ] 12.5
-[ ] 7.0

---

###### QCM 5
```python
a = 22
b = 5
print((a // b) + (a % b))
```
?[Quelle valeur sera affichée si on execute le programme ci-dessus ? ]
-[ ] 6.4
-[ ] 4.4
-[x] 6
-[ ] 114.4

# À vous !

###### Exercice 1 :

Le but de cet exercice est de suivre un programme de calcul en partant d'un entier ***n*** qui sera donné automatiquement.

Appuyez sur Run et suivez les instructions qui s'affichent.

Remplacez le mot-clé `pass` par votre code.
Ajoutez au fur et à mesure ce qu'on vous demande dans les instructions en dessous.
N'effacez rien de ce que vous écrivez... sauf si ce n'est pas juste.

Quand on vous demande d'afficher, utilisez la fonction `print`.

@[Programme de calcul]({"stubs": ["Variables_et_fonctions/Programme_calcul.py"], "command": "python3 Variables_et_fonctions/Programme_calcul_Test.py"})

---

###### Exercice 2 :

La consigne de cet exercice est identique au précédent.

Appuyez sur Run et suivez les instructions qui s'affichent.

NRemplacez le mot-clé `pass` par votre code.
Ajoutez au fur et à mesure ce qu'on vous demande dans les instructions en dessous.
N'effacez rien de ce que vous écrivez... sauf si ce n'est pas juste.

Quand on vous demande d'afficher, utilisez la fonction `print`.

@[Programme de calcul]({"stubs": ["Variables_et_fonctions/Programme_calcul1.py"], "command": "python3 Variables_et_fonctions/Programme_calcul1_Test.py"})

---
