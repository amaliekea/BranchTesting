//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.makeSound();
        c.makeSound();

        d.eat("fish");
        c.eat("dogfood");


        d.showMood(true);
        c.showMood(false);
    }
}