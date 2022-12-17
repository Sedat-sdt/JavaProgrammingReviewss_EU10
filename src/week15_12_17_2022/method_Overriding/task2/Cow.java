package week15_12_17_2022.method_Overriding.task2;

public class Cow extends Animal {
    @Override
    public void move() {
        super.move();
        System.out.println("Cows are walking");
    }
}
