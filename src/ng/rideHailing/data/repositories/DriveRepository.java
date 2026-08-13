package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Driver;

import java.util.List;

public interface DriveRepository {
    Driver save(Driver driver);

    Driver findById(String id);

    Driver findByEmail(String email);

    List<Driver> findAll();

    void deleteById(String id);

    long count();
}
