import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfPeopleOnTheBus {

    public static void main(String[] args) {
        ArrayList<int[]> busStops = new ArrayList<>();
        busStops.add(new int[]{10, 0});
        busStops.add(new int[]{3, 5});
        busStops.add(new int[]{2, 5});

        System.out.println(countPassengers(busStops));
}
    public static int countPassengers(ArrayList<int[]>stops) {
int numOfPeople=0;

// Runs in O(n) complexity because it is a single loop with size n
        for (int i = 0; i < stops.size(); i++) {
numOfPeople=numOfPeople+stops.get(i)[0]-stops.get(i)[1];
        }
        return numOfPeople;
    }
}
