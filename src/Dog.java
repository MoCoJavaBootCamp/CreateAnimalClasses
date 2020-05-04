public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Hi. I'm a dog");
    }

    @Override
    public String sleep() {
        return "A dog sleeps...";
    }

    @Override
    public String eat() {
        return "A dog eats...";
    }

    public String woof() {
        return "woooof...";
    }
}
