# Assignments

# Ex. 1 Equals

Create a `Person` class that can be consumed in the following manner:

```java
var p = new Person("Tom", "Thumb", 11, "123-45-1234");
var p1 = new Person("Jon", "Smith", 22, "123-45-1234");
var p2 = new Person("Jon", "Smith", 22, "000-00-0000");

if (p.equals(p1)) {
    System.out.printf("Yes");
}
if (p1.equals(p2)) {
    System.out.println("Here");
}
```

Output:
```
Yes
```

The `Person` class overrides the equals method.

# Ex. 2 WordCounting

Create a class called `WordCounter` that can be consumed in this manner:

```java
var inputString = "The water main broke on water street on the day before my birthday";
var wordCounter = new WordCounter(inputString);
wordCounter.countWords();
System.out.println(wordCounter.getWordCount());
```

Output:
```
the 2
birthday 1
broke 1
before 1
street 1
main 1
my 1
water 2
day 1
on 2
```

The `WordCounter` contains a `HashMap` which contains the number of occurrances for each word in the sentence.

# Ex. 3 PersonDeDuper
Create a class called `PersonDeDuper` that can be consumed in the following manner:

```java
var p = new Person("Alice", "Jones", 11, "111-11-1111");
var p1 = new Person("Alice", "Jones", 11, "111-11-1111");
var p2 = new Person("Bob", "Smith", 22, "222-22-2222");
var p3 = new Person("Bob", "Smith", 22, "222-22-2222");

var personDeDuper = new PersonDeDuper();
personDeDuper.addPerson(p);
personDeDuper.addPerson(p1);
personDeDuper.addPerson(p2);
personDeDuper.addPerson(p3);

System.out.println(personDeDuper.getUniquePeople());
```

Output:
```
Bob Smith, 22, 222-22-2222
Alice Jones, 11, 111-11-1111
```

The `PersonDeDeuper` wraps (contains) a `HashSet` that performs the de-duping logic. Remember to update the `Person` class
so that the `HashSet` can identity unique persons.

# Ex. 4 WordReverser

Create a class called `WordReverser` that can be consumed in the following manner:

```java
var wordReverser = new WordReverser("This is a test");
wordReverser.reverseWords();
System.out.println(wordReverser.getReversedWords());
```

Output:
```
test a is This 
```

The `WordReverser` wraps (contains) a stack to aid in reversing the words.

# Ex. 5 




# Ex. 6 
