package citybike;

import java.util.HashMap;

// Julia Hinterecker
public class Main {
    public static void main(String[] args) {
        // Create citybike.Bike objects:
        Bike bike1 = new Bike("red", ERentalState.CANBERENTED);
        Bike bike2 = new Bike("blue", ERentalState.CANBERENTED);
        Bike bike3 = new Bike("white", ERentalState.CANBERENTED);
        Bike bike4 = new Bike("yellow", ERentalState.CANBERENTED);
        Bike bike5 = new Bike("pink", ERentalState.CANBERENTED);
        Bike bike6 = new Bike("green", ERentalState.CANBERENTED);
        Bike bike7 = new Bike("black", ERentalState.CANBERENTED);
        Bike bike8 = new Bike("red", ERentalState.CANBERENTED);
        Bike bike9 = new Bike("blue", ERentalState.CANBERENTED);
        Bike bike10 = new Bike("white", ERentalState.CANBERENTED);


        // Put existing Bikes in a HashMap, using bikeID as source for key value
        HashMap<Integer, Bike> bikesMap = new HashMap<>();
        bikesMap.put(bike1.getBikeID() ,bike1);
        bikesMap.put(bike2.getBikeID(), bike2);
        bikesMap.put(bike3.getBikeID(), bike3);
        bikesMap.put(bike4.getBikeID(), bike4);
        bikesMap.put(bike5.getBikeID(), bike5);
        bikesMap.put(bike6.getBikeID(), bike6);
        bikesMap.put(bike7.getBikeID(), bike7);
        bikesMap.put(bike8.getBikeID(), bike8);
        bikesMap.put(bike9.getBikeID(), bike9);
        bikesMap.put(bike10.getBikeID(), bike10);

        // Create 3 Station objects and put them in a HashMap
        Stations station1 = new Stations("Westbahnhof");
        Stations station2 = new Stations("Stephansplatz");
        Stations station3 = new Stations("Karlsplatz");

        HashMap<Integer, Stations> stations = new HashMap<>();
        stations.put(station1.getStationID(),station1);
        stations.put(station2.getStationID(), station2);
        stations.put(station3.getStationID(), station3);

        // addBike method used
        station1.addBike(bike1);
        station1.addBike(bike2);
        station1.addBike(bike3);

        station2.addBike(bike4);
        station2.addBike(bike5);
        station2.addBike(bike6);
        station2.addBike(bike7);
        station2.addBike(bike8);
        // sollte Error hervorrufen da Station voll ist
        station2.addBike(bike9);


        // Creating users
        User user1 = new User("John","Doe", bike10);
        User user2 = new User("Jane","Dough", null);
        User user3 = new User("Julius","Ceasar", null);
        User user4 = new User("Alexander","der Große",null);

        // Rental procedure
        // take bike from station
        Bike rental1 = station1.rentBike(bike1.getBikeID());
        // set rental state to rented
        rental1.setRentalState(ERentalState.INSERVICE);
        // give bike to user
        user2.setCurrentlyRentedBike(rental1);
        // take bike from user
        Bike returnBike = user2.returnBike();
        // set rental state to canberented
        returnBike.setRentalState(ERentalState.CANBERENTED);
        // put bike into station
        station2.addBike(returnBike);




    }
}
