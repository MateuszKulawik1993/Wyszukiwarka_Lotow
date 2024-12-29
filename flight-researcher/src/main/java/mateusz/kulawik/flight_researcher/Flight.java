package mateusz.kulawik.flight_researcher;

public class Flight {
    private String departure;
    private String arrival;
    private String flightNumber;
    private String date;

    public Flight(String departure, String arrival, String flightNumber, String date) {
        this.departure = departure;
        this.arrival = arrival;
        this.flightNumber = flightNumber;
        this.date = date;
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
