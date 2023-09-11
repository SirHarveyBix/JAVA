# Class

Les classes sont comme une entité, elle represente un ensemble d'objet, qui ont la meme representation / structure.
c'est comme un fomulaire vide qu'on alimente.

## Les classes :

- definissent un structure,
- definissent et detienent leurs comportement,
- peuvent generer des instances.

---

- public ou private => **portée**
- abstract => **impossible a instancier**
- final => **ne peut etre drivée** (extends)

---

il est possible de creer une instance de cette classe en utilisant **`new`**,
**String** est speciale, on creer une chaine de caractere en utilisant un literral :

```java
String s = "Hello";
```

on pourrait aussi ecrire :

```java
String s = new String("Hello");
```

---

## Static / Methods

Le mot clé static signifie que la valeur reste toujours avec la class, il est stocké dans un emplacement particulier dans la memoire pour les valeurs qui changent constament contrairement aux vairables et objects.
**static** premet de conserver la valeur unique de sa classe _maitresse_.

quand on n'utilise pas **static** on parle d'**instance field** _(champ d'instance)_, tant que la classe n'a pas été instaciée, le champ n'a pas sa place en memoire.

### Static method

```java
Integer.parseInt("123");
```

### Instance Method

```java
"Hello".toUpperCase();
```
