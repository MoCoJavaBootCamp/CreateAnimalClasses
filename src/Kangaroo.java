public class Kangaroo extends Animal {
    public Kangaroo() {
        super();
        System.out.println("I'm a kangaroo!");
    }

    @Override
    public String sleep() {
        return "A kangaroo sleeps...";
    }

    @Override
    public String eat() {
        return "A kangaroo eats...";
    }

    public String hop() {
        return "A kangaroo hops...";
    }
}
