*Note:* For slideshows, go to the StuyPulse GitHub with the Newbie Ed slides 

**Java `Math`**
Use the Math.<function_name> to use the following:

| Func          | Param       | Desc                    |
|---------------|-------------|-------------------------|
| .max(x, y)    | x, y -> num | Returns largest #       |
| .min(x, y)    | x, y -> num | Returns smallest #      |
| .sqrt(x)      | x -> num    | Returns sqrt of #       |
| .abs(x)       | x -> num    | Returns absolute val #  |
| .random()     | none        | Returns random #        |

## Arrays
* use brackets [] after stating the data type, followed by the values being in {}
* changing the values: `arrayName[index] = value;`

`.length` returns the length of the array
**Syntax:** `arr.length`

## Loops
**`while` loops**
```java
while (anyBool) {
    code
}
```

**`for` loops**
```java
for (declaration; check; increment) {
    code
}
```

**for-each loop**
* used to iterate through elements of arrays


## Selected Object-Oriented Programming Notes
**`static` methods**
* static methods --> available at class level so you do __NOT__ need an instance to use them
* static fields --> when assigned a value, it will be the SAME for __EVERY__ object of the class

static --> you don't need to make an object to use the function

**Access Modifiers**
1. public -> anywhere
2. default -> same folder 
3. private -> used within the class

**Extending Classes**
Syntax: 
```java
// Parent.java
public class Parent {
    // code
}

// Child.java
public class Child extends Parent {
    // Child.java specific code
}
```

* subclasses will NOT inherit the constructor of the superclass (parent class)
* use the `super.propertyName` to bypass this

**Overriding Methods**
    