package strategy;

public class ScenicRoute implements RouteStrategy {

    @Override
    public String buildRoute(String start, String destination) {
        return "Scenic route from " + start + " to " + destination;
    }
}
