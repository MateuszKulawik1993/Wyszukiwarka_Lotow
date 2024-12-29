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
        flights.add(new Flight("New York", "Warsaw", "PL405", "05-12-2024"));
        flights.add(new Flight("New York", "Rome", "US205", "06-12-2024"));
        flights.add(new Flight("Paris", "Rio de Janeiro", "FR455", "06-12-2024"));
        flights.add(new Flight("Paris", "Warsaw", "FR705", "07-12-2024"));
        flights.add(new Flight("Rome", "Madrid", "IT200", "08-12-2024"));
        flights.add(new Flight("London", "Toronto", "UK755", "08-12-2024"));
    }
    @GetMapping
    public List<Flight> searchFlights(@RequestParam String departure,
                                      @RequestParam String arrival,
                                      @RequestParam String date){
        return (List<Flight>) flights.stream()
                .filter(flight -> flight.getDeparture().equalsIgnoreCase(departure))
                .filter(flight -> flight.getArrival().equalsIgnoreCase(arrival))
                .filter(flight -> flight.getDate().equals(date))
                .collect(Collectors.toList());

    }

}
