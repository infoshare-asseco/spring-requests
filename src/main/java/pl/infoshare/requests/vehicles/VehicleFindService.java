package pl.infoshare.requests.vehicles;

import org.springframework.stereotype.Component;
import pl.infoshare.requests.vehicles.model.Vehicle;

import java.util.List;

@Component
public class VehicleFindService {

    private final VehicleRepository vehicleRepository;

    public VehicleFindService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> findVehicles() {
        return vehicleRepository.findAll();
    }
}
