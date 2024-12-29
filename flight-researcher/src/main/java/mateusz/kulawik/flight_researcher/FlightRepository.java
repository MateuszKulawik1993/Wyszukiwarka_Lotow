package mateusz.kulawik.flight_researcher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.scheduling.config.Task;

@RepositoryRestResource(path="flights")
public interface FlightRepository extends JpaRepository<Flight, Integer> {


}
