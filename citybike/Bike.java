package citybike;

// Julia Hinterecker
// Creating a Java Class citybike.Bike with parameters:
public class Bike {
    int bikeID = 0;
    static int nextBikeID = 0;
    String color;
    ERentalState state;
    // Create a citybike.Bike constructor:
    public Bike (String color, ERentalState state) {
        bikeID = nextBikeID;
        nextBikeID++;
        this.color = color;
        this.state = state;



    }
    public int getBikeID(){
        return bikeID;
    }
    public ERentalState getRentalState(){
        return state;
    }
    public void setRentalState(ERentalState bikeState){
        state = bikeState;
    }
}
