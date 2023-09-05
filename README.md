# JAVA

après avoir installer [java (17 LTS)](https://www.oracle.com/java/technologies/downloads/#java17)

`jshell`

```shell
var someText = "Hello Tim!"
System.out.print(someText);
```

## Primitive Types

1. numbers (nombre entiers):

   - byte : (**Byte**_.MAX_VALUE_) ==> `127`
   - short : (**Short**_.MAX_VALUE_) ==> `32767`
   - int : (**Integer**_.MAX_VALUE_) ==> `2147483646`
   - long : (**Long**_.MAX_VALUE_) ==> `9223372036854775807`

2. numbers (nombre réel):

   - float : (**Float**_.MAX_VALUE_) ==> `3.4028235E38`
   - double : (**Double**_.MAX_VALUE_) ==> `1.7976931348623157E308`

3. single char:

   - char (**Character**)

4. booleans:

   - boolean (**Boolean**)

> les classes sont en gras (Classes Wrapper)

Numbers: les valeurs ne sont pas infinies :

```shell
jshell> int someNumber = Integer.MIN_VALUE;
someNumber ==> -2147483648

jshell> int someNumber = Integer.MAX_VALUE;
someNumber ==> 2147483647
```

nous pouvons avoir la taille du type de donnée en y ajoutant _.SIZE_ :

```shell
jshell> System.out.print(Long.SIZE);
64
```
