# Arrays Vs. ArrayList

## Instanciating Arrays

```java
String[] array = new String[10];
```

un Array de 10 elements est creer _references : null_, le compiler n'accepte que les __String__, avec un taille maximum de __10__.

pour lui atribuer une valeur :

```java
array[0] = "one";
```

```java
String[] array = new String[] {"first", "second", "third"};
```

3 elements sont créés, on peu aussi creer un _anonymous array_ :

```java
String[] array = {"first", "second", "third"};
```

### Using Arrays.asList

la list retournée n'est pas _resizable_ mais _mutable_

```java
var newList = Arrays.asList("Sunday", "Monday", "Tuesday");
/*  - - - - - - - - - - - - - - - - - - - - - - - - */
String[] days = new String("Sunday", "Monday", "Tuesday");
List<String> newList = Arrays.asList(days);
```

## Instanciating ArrayLists

```java
ArrayList<String> arrayList = new ArrayList<>();
```

un ArrayList vide est creer, le compiler verfifiera seulement si les valeurs sont des __String__.

pour lui atribuer une valeur :

```java
arrayList.set(0, "one");
```

`arrayList.get(0)` pour la recuperer;

```java
ArrayList<String> arrayList = new ArrayList<>(List.of("first", "second", "third"));
```

`List.of()` est une '_factory method_', creer une list __immutable__.

### Using List.of

la list retournée est _immutable_

```java
var newList = List.of("Sunday", "Monday", "Tuesday");
/*  - - - - - - - - - - - - - - - - - - - - - - - - */
String[] days = new String("Sunday", "Monday", "Tuesday");
List<String> newList = List.of(days);
```

## Creating Arrays from ArrayLists

```java
ArrayList<String> stringList = new ArrayList<>(List.of("Sunday", "Monday", "Tuesday"));

String[] stringArray = stringList.toArray(new String[0]);
```

cette method `ArrayList` prend 1 argument, une instance de type __Array__, et retourne un Array du meme type.
