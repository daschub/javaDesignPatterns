package creationalPatterns.singleton;
/*

The Singleton Design Pattern is a Creational pattern, whose objective is to create only one instance of a
class and to provide only one global access point to that object. One commonly used example of such a class
in Java is Calendar, where you cannot make an instance of that class. It also uses its own getInstance()method
to get the object to be used.

A class using the singleton design pattern will include:

1. A private static variable, holding the only instance of the class.
2. A private constructor, so it cannot be instantiated anywhere else.
3. A public static method, to return the single instance of the class.


There are many different implementations of singleton design. Today,
I’ll be going through the implementations of;

1. Eager Instantiation

2. Lazy Instantiation

3. Thread-safe Instantiation

 */
public class MainSingleton {
    public static void main(String[] args) {

    }
}
