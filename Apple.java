import java.util.ArrayList;
import java.util.List;

public class Apple
{
    enum Color {RED, GREEN};

    public Color color;
    public int weight;

    public Apple()
    {
        this.color = Color.RED;
        this.weight = 0;
    }

    public Apple(int weight, Color color)
    {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight()
    {
        return weight;
    }

    public static List<Apple> filterGreenApple(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (Apple.Color.GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    public static List<Apple> fillterAppleByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }

        return result;
    }
}