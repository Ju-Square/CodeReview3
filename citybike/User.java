package citybike;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Julia Hinterecker
// Creating a citybike.User Class with specific parameters:
public class User {
    int userID = 0;
    static int nextUserID = 0;
    String name, surname;
    Bike currentlyRentedBike;
    int currentRentID;
    HashMap<Integer, Rent> rentedBikeHistory = new HashMap<Integer, Rent> ();

    public User(String name, String surname, Bike currentlyRentedBike){
        userID = nextUserID;
        nextUserID++;
        this.name = name;
        this.surname = surname;
        this.currentlyRentedBike = currentlyRentedBike;
    }
    public void setCurrentlyRentedBike(Bike rentedBike){
        System.out.println("Der User " + name + " " + surname + " hat das Rad " + rentedBike.getBikeID() + " ausgeborgt.");
        currentlyRentedBike = rentedBike;
        Rent rent = new Rent(rentedBike.getBikeID(), LocalDateTime.now());
        currentRentID = rent.getRentID();
        rentedBikeHistory.put(currentRentID, rent);
    }
    public Bike returnBike(){
        System.out.println("Der User " + name + " " + surname + " gibt das Bike " +currentlyRentedBike.getBikeID()+ " zurück.");
        Bike returnBike = currentlyRentedBike;
        currentlyRentedBike = null;
        rentedBikeHistory.get(currentRentID).setRentEnd(LocalDateTime.now());
        return returnBike;
    }
}
