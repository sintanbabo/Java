public class AppleGreenColorPredicate implements ApplePredicate
{
    public boolean test(Apple apple)
    {
        return Apple.Color.GREEN.equals(apple.getColor());
    }
}