import java.util.Arrays;
import java.util.List;

public class PrintApple {

    public static List<Apple> inventory = Arrays.asList(
        new Apple(80,Apple.Color.GREEN),
        new Apple(155,Apple.Color.GREEN),
        new Apple(120,Apple.Color.RED)
    );
    
    public static void main(String[] args) {
        prettyPrintApple(inventory, new AppleFancyFormatter());
        prettyPrintApple(inventory, new AppleSimpleFormatter());
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter) {
        for(Apple apple : inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
