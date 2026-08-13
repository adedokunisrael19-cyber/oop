package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Driver;

import java.util.ArrayList;
import java.util.List;

public class DriveRepositoryImpl implements DriveRepository {

    private final List<Driver> drivers = new ArrayList<>();

    @Override
    public Driver save(Driver driver) {
        if (driver.getId() == null || driver.getId().isEmpty()) {
            driver.setId(String.valueOf(drivers.size() + 1));
        }

        drivers.add(driver);

        return driver;
    }

    @Override
    public Driver findById(String id) {

        for (Driver driver : drivers) {

            if (driver.getId().equals(id)) {
                return driver;
            }
        }

        return null;
    }

    @Override
    public Driver findByEmail(String email) {
        return null;
    }

    @Override
    public List<Driver> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public long count() {
        return 0;
    }
}
