/*
Four new animals were created using the Animal Class.

Each animal inherited sleep and sleep methods from its parent class, but were modified.

The encapsulation isn't very strong due to no private variables.

However, methods were overridden to cater to the exact subclass.

This is called polymorphism, where the subclass takes on a new form.

 */

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.woof());

        Kangaroo k = new Kangaroo();
        print(k.eat());
        print(k.sleep());
        print(k.hop());
    }

    private static void print(String s) {
        System.out.println(s);
    }
}