
public class Bird extends Animal {
    private String name;

    public Bird (String name) {
        this.name = name;
    }

    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }

    void whoareyou() {
        System.out.println("I am " + this.name);
    }

}