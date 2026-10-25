package strategy;

public class Main {

    public static void main(String[] args) {

        Navigator navigator = new Navigator(new FastestRoute());

        System.out.println("Strategy 1:");
        navigator.navigate("Astana", "Almaty");

        System.out.println();

        System.out.println("Strategy 2:");
        navigator.setStrategy(new ShortestRoute());
        navigator.navigate("Astana", "Almaty");

        System.out.println();

        System.out.println("Strategy 3:");
        navigator.setStrategy(new ScenicRoute());
        navigator.navigate("Astana", "Almaty");
    }
}
