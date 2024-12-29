package mateusz.kulawik.flight_researcher;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/flights")
public class FlightController {
    public final List<Flight> flights = new ArrayList<>();

    public FlightController() {
        flights.add(new Flight(1 ,"New York", "Warsaw", "PL405", "05-12-2024"));
        flights.add(new Flight(2, "Paris", "Rio de Janeiro", "FR455", "06-12-2024"));;
        flights.add(new Flight(3, "Paris", "Warsaw", "FR705", "07-12-2024"));
        flights.add(new Flight(4 ,"Rome", "Madrid", "IT200", "08-12-2024"));
        flights.add(new Flight(5, "Madrid", "Rome", "ES505","09-12-2024"));

    }
    @GetMapping
    public List<Flight> searchFlights(@RequestParam String departure,
                                      @RequestParam String arrival,
                                      @RequestParam String date){
        return flights.stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(departure))
                .filter(flight -> flight.getArrival().equalsIgnoreCase(arrival))
                .filter(flight -> flight.getDate().equals(date))
                .collect(Collectors.toList());

    }

}
