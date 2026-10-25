package strategy;

public class FastestRoute implements RouteStrategy {

    @Override
    public String buildRoute(String start, String destination) {
        return "Fastest route from " + start + " to " + destination;
    }
}
