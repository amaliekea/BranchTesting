public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if (mood) {
            System.out.println("spinning");
        } else {
            System.out.println("hvæser");
        }
    }
}
