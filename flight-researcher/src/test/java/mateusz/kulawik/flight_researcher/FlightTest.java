package mateusz.kulawik.flight_researcher;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {
    @Test
    void testFlightConstructorAndGetters() {
        //given
        Flight flight = new Flight(1, "New York", "Warsaw", "AA123","05-12-2024");
        //when & then
        assertEquals("New York", flight.getDeparture());
        assertEquals("Warsaw", flight.getArrival());
        assertEquals("AA123", flight.getFlightNumber());
        assertEquals("05-12-2024", flight.getDate());
    }
    @Test
    void testToString() {
        //given
        Flight flight = new Flight(1, "New York", "Warsaw", "AA123","05-12-2024");;
        //when
        String expected = "Flight{departure='New York', arrival='Warsaw', flightNumber='AA123', date='05-12-2024'}";
        //then
        assertEquals(expected, flight.toString());
    }
    @Test
    void testFlightWithEmptyValues() {
        //given
        Flight flight = new Flight(1, "", "", "","");
        //when & then
        assertEquals("", flight.getDeparture());
        assertEquals("", flight.getArrival());
        assertEquals("", flight.getFlightNumber());
        assertEquals("", flight.getDate());
    }

}