# Homework 01

This homework contains three tasks.

## Task 01

### Description

Let's start with a program that makes you a coffee – virtual coffee, of course. But in this project, you will implement
 functionality that simulates a real coffee machine. It can run out of milk, it can run out of coffee beans, it can make
  different varieties of coffee, and it can take the money for making a coffee.

The first version of the program just makes you a coffee. It prints to the standard output what it is doing as it makes
 a coffee.

### Instruction

- [ ] Open the file [Task01.java](src/main/java/com/softserveinc/Task01.java).
- [ ] Write a program that prints the steps necessary to make coffee.

### Example

**Write the program** that prints all lines as in the example below:

```text
Starting to make a coffee
Grinding coffee beans
Boiling water
Mixing boiled water with crushed coffee beans
Pouring coffee into the cup
Pouring some milk into the cup
Coffee is ready!
```

<details>
    <summary>Hint</summary>
    <p>File <a href="src/main/java/com/softserveinc/Task01.java">Task01.java</a> contains static method <code>main()</code></p>.
    <p>Inside <code>main()</code>, add statement which prints to the standard output what coffee machine is doing as it makes a coffee</p> 
    <p>Simple use <a href="https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/io/PrintStream.html#println(java.lang.String)">System.out.println()</a> 
    method to print the text.</p>
</details>

## Task 02

### Description

Now let's consider a case where you need a lot of coffee. Maybe, for example, you’re hosting a party with a lot of guests. 

The program should calculate how much water, coffee, and milk are necessary to make the specified amount of coffee. 

One cup of coffee made on this coffee machine contains `200 ml` of water, `50 ml` of milk, and `15 g` of coffee beans.

The user should input the amount of coffee he needs, in cups, for all the guests.

Of course, all this coffee is not needed right now, so at this stage, the coffee machine doesn’t actually make any coffee.

### Instruction

- [ ] Open the file [Task02.java](src/main/java/com/softserveinc/Task02.java).
- [ ] Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.

<details>
    <summary>Hint</summary>
    <ul>
        <li>To read a number of cups you can use the method <code>scanner.nextInt()</code></li>
        <li>Use <a href="https://www.javatpoint.com/string-concatenation-in-java">string concatenation</a> to join a string and value of variable</li>
    </ul>
</details>

### Examples

The example below shows how your output might look.
The symbol `>>>` represents the user input. Notice that it's not the part of the input.

#### Example 1

```text
Write how many cups of coffee you will need: 
>>> 25
For 25 cups of coffee you will need:
5000 ml of water
1250 ml of milk
375 g of coffee beans
```

#### Example 2

```text
Write how many cups of coffee you will need: 
>>> 125
For 125 cups of coffee you will need:
25000 ml of water
6250 ml of milk
1875 g of coffee beans
```

## Task 03

### Description

A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, 
it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans 
that your coffee machine has at the moment.

<p>If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, 
I can make that amount of coffee". If the coffee machine can make more than that, the program should output 
"Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee
 that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the 
 program should output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs `200 ml` of water, `50 ml` of milk, and `15 g` of coffee beans to make one cup of coffee.

### Instruction

- [ ] Open the file [Task03.java](src/main/java/com/softserveinc/Task03.java).
- [ ] Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.

<details>
    <summary>Hint</summary>
    <ul>
        <li>Use static method <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#min-int-int-">Math.min()</a> to find how many cups of coffee it is possible to make </li>
        <li>Use <code>if ... else if ... else</code> operator to print right message</li>
    </ul>
</details>

### Examples

The program should firstly request for water, then milk, then beans, then amount of cups.

The symbol `>>>` represents the user input. Notice that it's not the part of the input.

#### Example 1

```text
Write how many ml of water the coffee machine has: 
>>> 300
Write how many ml of milk the coffee machine has: 
>>> 65
Write how many grams of coffee beans the coffee machine has: 
>>> 100
Write how many cups of coffee you will need: 
>>> 1
Yes, I can make that amount of coffee
```

#### Example 2

```text
Write how many ml of water the coffee machine has: 
>>> 500
Write how many ml of milk the coffee machine has: 
>>> 250
Write how many grams of coffee beans the coffee machine has: 
>>> 200
Write how many cups of coffee you will need: 
>>> 10
No, I can make only 2 cup(s) of coffee
```

#### Example 3

```text
Write how many ml of water the coffee machine has: 
>>> 1550
Write how many ml of milk the coffee machine has: 
>>> 299
Write how many grams of coffee beans the coffee machine has: 
>>> 300
Write how many cups of coffee you will need: 
>>> 3
Yes, I can make that amount of coffee (and even 2 more than that)
```

#### Example 4

```text
Write how many ml of water the coffee machine has: 
>>> 0
Write how many ml of milk the coffee machine has: 
>>> 0
Write how many grams of coffee beans the coffee machine has: 
>>> 0
Write how many cups of coffee you will need: 
>>> 1
No, I can make only 0 cup(s) of coffee
```

#### Example 5

```text
Write how many ml of water the coffee machine has: 
>>> 0
Write how many ml of milk the coffee machine has: 
>>> 0
Write how many grams of coffee beans the coffee machine has: 
>>> 0
Write how many cups of coffee you will need: 
>>> 0
Yes, I can make that amount of coffee
```

#### Example 6

```text
Write how many ml of water the coffee machine has: 
>>> 200
Write how many ml of milk the coffee machine has: 
>>> 50
Write how many grams of coffee beans the coffee machine has: 
>>> 15
Write how many cups of coffee you will need: 
>>> 0
Yes, I can make that amount of coffee (and even 1 more than that)
```

## Useful links

1. [Java Language Basics](https://dev.java/learn/java-language-basics/)
2. [Numbers and Strings](https://dev.java/learn/numbers-and-strings/)
3. [Formatting](https://docs.oracle.com/javase/tutorial/essential/io/formatting.html)