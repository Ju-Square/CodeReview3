package citybike;

import java.util.HashMap;

//Julia Hinterecker
// Creating a Java Class citybike.Stations containing parameters
public class Stations {
    int stationID = 0;
    static int nextStationID = 0;
    String location;
    HashMap<Integer, Bike> bikes = new HashMap<>();
    public Stations(String location){
        stationID = nextStationID;
        nextStationID++;
        this.location = location;

    }
    public int getStationID(){
        return stationID;
    }
    // Create addBike method
    public void addBike(Bike bike){
        if(bikes.size() >= 5) {
            System.out.println("Die Station ist voll - Rad kann nicht abgestellt werden.");
            return;
        }
        System.out.println("Das Rad " +bike.getBikeID()+ " wird in die Station " + location + " gestellt.");
        bikes.put(bike.getBikeID(), bike);
    }
    // Create rent citybike.Bike method
    public Bike rentBike(int bikeID){
        System.out.println("Das Rad mit der ID " +bikeID + " wird aus der Station " + location + " entfernt.");
        return bikes.remove(bikeID);
    }
}
