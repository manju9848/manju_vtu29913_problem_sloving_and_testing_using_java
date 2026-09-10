import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {
    private Map<Integer, CheckInInfo> checkIns;
    private Map<String, TravelInfo> travels;
    static class CheckInInfo {
        String station;
        int time;

        CheckInInfo(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }
    static class TravelInfo {
        int totalTime;
        int count;

        TravelInfo() {
            totalTime = 0;
            count = 0;
        }
    }
    public UndergroundSystem() {
        checkIns = new HashMap<>();
        travels = new HashMap<>();
    }
    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckInInfo(stationName, t));
    }
    public void checkOut(int id, String stationName, int t) {

        CheckInInfo info = checkIns.get(id);

        String startStation = info.station;
        int startTime = info.time;

        int travelTime = t - startTime;

        String key = startStation + "#" + stationName;

        if (!travels.containsKey(key)) {
            travels.put(key, new TravelInfo());
        }

        TravelInfo travel = travels.get(key);

        travel.totalTime += travelTime;
        travel.count++;
        checkIns.remove(id);
    }
    public double getAverageTime(String startStation, String endStation) {

        String key = startStation + "#" + endStation;

        TravelInfo travel = travels.get(key);

        return (double) travel.totalTime / travel.count;
    }
    public static void main(String[] args) {

        UndergroundSystem undergroundSystem = new UndergroundSystem();

        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);

        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);

        System.out.println(
            undergroundSystem.getAverageTime("Paradise", "Cambridge")
        );

        System.out.println(
            undergroundSystem.getAverageTime("Leyton", "Waterloo")
        );

        undergroundSystem.checkIn(10, "Leyton", 24);

        System.out.println(
            undergroundSystem.getAverageTime("Leyton", "Waterloo")
        );

        undergroundSystem.checkOut(10, "Waterloo", 38);

        System.out.println(
            undergroundSystem.getAverageTime("Leyton", "Waterloo")
        );
    }
}