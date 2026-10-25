package strategy;

public class ShortestRoute implements RouteStrategy {

    @Override
    public String buildRoute(String start, String destination) {
        return "Shortest route from " + start + " to " + destination;
    }
}
