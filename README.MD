# **Predicate**

Predicate is a functional interface that is introduced in Java 8. It is present in the package **java.util.function**. It has a single abstract method `test(T)` method that returns boolean value.

We can implement this functional interface using lambda expressions and can use it in our programming.

&nbsp;&nbsp;

**Predicate Joining**

Predicate interface contains three _default_ methods. They are `negate()`, `and()` and `or()` methods. These three methods are used in Predicate joining.

i. `negate()` - It returns a predicate that represents logical negation of the called Predicate.
    
    Eg: Predicate<Integer> p1 = I -> I>10; // this predicate returns true for any integer that is greater than 10
        Predicate<Integer> p2 = p1.negate() // p2 predicate returns true for any integer that is not greater than 10

ii. `and()` - Returns a composed predicate that represents a short-circuiting logical AND of this predicate and another. When evaluating the composed predicate, if this predicate is false, then the other predicate is not evaluated.

    Eg: 
        Predicate<Integer> p1 = I -> I>10; // this predicate returns true for any integer that is greater than 10
        Predicate<Integer> p2 = I -> I % 2 == 0; // p2 predicate returns true for any integer that is divisible by 2
        
        Predicate<Integer> p3 = p1.and(p2) // p3 is the composed predicate that represents logical AND of p1 and p2.


iii. `or()` - Returns a composed predicate that represents a short-circuiting logical OR of this predicate and another. When evaluating the composed predicate, if this predicate is true, then the other predicate is not evaluated.

    Eg: Predicate<Integer> p1 = I -> I>10; // this predicate returns true for any integer that is greater than 10
        Predicate<Integer> p2 = I -> I % 2 == 0; // p2 predicate returns true for any integer that is divisible by 2
        
        Predicate<Integer> p3 = p1.or(p2) // p3 is the composed predicate that represents logical OR of p1 and p2.
        