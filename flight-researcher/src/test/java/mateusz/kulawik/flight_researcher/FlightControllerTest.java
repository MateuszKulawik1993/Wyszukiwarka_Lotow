package mateusz.kulawik.flight_researcher;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightControllerTest {

    @Test
    public void searchValidFlights(){
        //given
        FlightController controller =new FlightController();
        //when
        List<Flight> results= controller.searchFlights("New York","Warsaw","05-12-2024");
        //then
        assertEquals(1,results.size());
        assertEquals("New York", results.get(0).getDeparture());
        assertEquals("Warsaw", results.get(0).getArrival());
        assertEquals("PL405",results.get(0).getFlightNumber());
    }
    @Test
    public void searchNotActualFlights() {
        //given
        FlightController controller =new FlightController();
        //when
        List<Flight> results = controller.searchFlights("Tokio", "Sydney", "05-05-2024");
        //then
        assertTrue(results.isEmpty());
    }
    @Test
    public void searchFlights_CaseInsensitiveQuery_ReturnsResults(){
        //given
        FlightController controller =new FlightController();
        //when
        List<Flight>results = controller.searchFlights("new york","warsaw","05-12-2024");
        //then
        assertEquals(1,results.size());
        assertEquals("New York",results.get(0).getDeparture());
        assertEquals("Warsaw",results.get(0).getArrival());
    }
    @Test
    void testSearchFlights_MultipleResults_ReturnsCorrectCount() {
        //given
        FlightController controller =new FlightController();
        //when
        List<Flight> results = controller.searchFlights("New York", "Warsaw", "05-12-2024");
        //then
        assertEquals(1, results.size());
    }
}