public class AppleFancyFormatter implements AppleFormatter {
    public String accept(Apple apple) {
        String c = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + c + " " + apple.getColor() + " apple.";
    }
}
