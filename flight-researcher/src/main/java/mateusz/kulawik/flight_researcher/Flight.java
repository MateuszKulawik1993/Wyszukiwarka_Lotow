package mateusz.kulawik.flight_researcher;

import jakarta.persistence.*;

@Entity
@Table(name="flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String departure;
    private String arrival;
    private String flightNumber;
    private String date;

    public Flight(int id, String departure, String arrival, String flightNumber, String date) {
        this.id = id;
        this.departure = departure;
        this.arrival = arrival;
        this.flightNumber = flightNumber;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
