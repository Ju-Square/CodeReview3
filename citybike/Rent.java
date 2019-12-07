// Julia Hinterecker
package citybike;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rent {
     int rentID = 0;
     static int nextRentID = 0;
     int bikeID;
     LocalDateTime rentStart;
     LocalDateTime rentEnd = null;

    public Rent (int bikeID, LocalDateTime rentStart){
        rentID = nextRentID;
        nextRentID++;
        this.bikeID = bikeID;
        this.rentStart = rentStart;
    }

    public void setRentEnd(LocalDateTime rentEnd) {
        this.rentEnd = rentEnd;
    }

    public int getRentID (){
        return rentID;
    }
}
