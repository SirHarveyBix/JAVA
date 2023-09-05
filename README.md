# JAVA: First Steps

après avoir installer [java (17 LTS)](https://www.oracle.com/java/technologies/downloads/#java17)

`jshell`

```shell
var someText = "Hello Tim!"
System.out.print(someText);
```

---

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

5. string

   - **String** (_mais ce n'est techniquement pas un type primitif_)

> les classes sont en gras (Classes Wrapper)

---

Numbers: les valeurs ne sont pas infinies :

```shell
jshell> int someNumber = Integer.MIN_VALUE;
someNumber ==> -2147483648

jshell> int someNumber = Integer.MAX_VALUE;
someNumber ==> 2147483647
```

les nombre depassant `MAX_VALUE`, doivent avoir le suffix **`L`** (_pour Long_)

```shell
long someNumber = 2147483649L;
# ou alors :
someNumber = 2147483649L;

long someNumber =2147483649; # throw an error

someNumber ==> 2147483649
```

nous pouvons avoir la taille du type de donnée en y ajoutant _.SIZE_ :

```shell
jshell> System.out.print(Long.SIZE);
64
```

## Casting

```shell
jshell> byte minByteValue = Byte.MIN_VALUE;
minByteValue ==> -128

jshell> byte total = (minByteValue / 2);
|  Error:
|  incompatible types: possible lossy conversion from int to byte
|  byte total = (minByteValue / 2);
|                ^--------------^
```

jshell retourne une erreur par ce que`(minByteValue / 2);` est traité comme un **Integer**, c'est la qu'intervient le **Casting** : **`(byte)`**
>Convertir d'un type a un autre (ici **Integer** vers **Byte**)

```shell
jshell> byte total = (byte) (minByteValue / 2);
total ==> -64
```

Même chose ici :

```shell
jshell> short minShortValue = Short.MIN_VALUE
minShortValue ==> -32768
###
jshell> short shortValue = (minShortValue / 2);
|  Error:
|  incompatible types: possible lossy conversion from int to short
|  short shortValue = (minShortValue / 2);
|                      ^---------------^
```

devra etre transformé :

```shell
jshell> short shortValue = (short) (minShortValue / 2);
shortValue ==> -16384                  
```

### Float & Double

```shell
jshell> System.out.print(Float.MIN_VALUE + " to " + Float.MAX_VALUE);
1.4E-45 to 3.4028235E38

jshell> System.out.print(Double.MIN_VALUE + " to " + Double.MAX_VALUE);
4.9E-324 to 1.7976931348623157E308
```

`1.4E-45`: pourra etre traduit par : 1.4 x 10⁻⁴⁵ (1.4 x 10 puissance -45)
`3.4028235E38`: pourra etre traduit par : 1.4 x 10³⁸ (1.4 x 10 puissance 38)

```shell
jshell> int intValue = 5; float floatValue = 5; double doubleValue = 5;
intValue ==> 5
floatValue ==> 5.0
doubleValue ==> 5.0
```

---

```shell
jshell> float someFloatValue = 5.25
|  Error:
|  incompatible types: possible lossy conversion from double to float
|  float someFloatValue = 5.25;
|                         ^--^
```

ici `5.25` est interpreté comme un Double, le Casting revient
> **Double** est type par defaut, et il est preféré a **Float**, parce que **Double** est plus precis.

```shell
jshell> float someFloatValue = (float) 5.25;
someFloatValue ==> 5.25

jshell> float someFloatValue =  5.25f;
someFloatValue ==> 5.25
```

---

```shell
jshell> anyVariable = 5 / 2;
intValue ==> 2

jshell> anyVariable = 5f / 2f;
floatValue ==> 2.5
```

Même chose que precedement: `5 / 2;` est traité comme un **Integer** peu importe le type initial de la variable.
`5f / 2f;` (**f** pour **Float**) _ou `5d / 2d;` (**d** pour **Double**)_ fera le calcul en considerant le type du suffix

```shell
jshell> double anyVariable = 5d / 3d;
# jshell> double anyVariable = 5.00 / 3.00; 
anyVariable ==> 1.6666666666666667

jshell> float anyVariable = 5f / 3f;
anyVariable ==> 1.6666666
```

**Double** represente plus precisement le décimaux.

---

## Primitive Data Types : char

char **_Character_**, ne peu contenir qu'un seul element, en simple quotes:

```shell
jshell> char anyChar = 'TEST'
|  Error:
|  unclosed character literal
|  char anyChar = 'TEST'
|                 ^

jshell> char anyChar = "D"
|  Error:
|  incompatible types: java.lang.String cannot be converted to char
|  char anyChar = "D";
|                 ^-^

jshell> char anyChar = 'D'
anyChar ==> 'D'

jshell> char anyChar = 68
anyChar ==> 'D'
```

char n'est pas un String, il fait reference a son [unicode](https://symbl.cc/fr/) : '**[D](https://symbl.cc/fr/0044/)**'

voici l'exemple des possibilitées '**?**':

```shell
jshell> char simpleChar= '?';
simpleChar ==> '?'

jshell> char unicodeChar = '\u003F';
unicodeChar ==> '?'

jshell> char decimalChar= 63;
decimalChar ==> '?'
```
