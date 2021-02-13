import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class FilteringApples {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(
			new Apple(80,Apple.Color.GREEN),
			new Apple(155,Apple.Color.GREEN),
			new Apple(120,Apple.Color.RED)
		);

		List<Apple> heavyApples = filterApples(inventory, new AppleHeavyWeightPredicate());
		List<Apple> greenApples = filterApples(inventory, new AppleGreenColorPredicate());

		System.out.println(heavyApples);
		System.out.println(greenApples);
	}

	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) {
		List<Apple> result = new ArrayList<>();

		for(Apple apple : inventory) {
			if (p.test(apple)) {
				result.add(apple);
			}
		}

		return result;
	}
}
