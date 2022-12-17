package week12_11_26_2022;

public class HouseItems {

    public String name, color;
    public int amount;

    public HouseItems(String name, String color, int amount) {
        this.name = name;
        this.color = color;
        this.amount = amount;
    }

    public String toString() {
        return "HouseItems{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }
}
