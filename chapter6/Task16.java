package chapter6;

interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}
class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat) {
            // put gorilla food into cage
            System.out.println("Putting food into the gorilla's cage.");
            return true;
        }
        System.out.println("It is not time to eat.");
        return false;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla: lather, rinse, repeat.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("pet at your own risk.");
    }
}

public class Task16 {
    public static void main(String[] args) {
        Gorilla koko = new Gorilla();

        // Feed the gorilla
        koko.feed(true);
        koko.feed(false);

        // Groom the gorilla
        koko.groom();

        // Pet the gorilla
        koko.pet();
    }
}