package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Driver;
import ng.rideHailing.data.models.Ride;
import ng.rideHailing.data.models.User;

import java.util.List;

public interface RideRepository {
    Ride save(Ride ride);

    Ride findById(String id);

    List<Ride> findAll();

    List<Ride> findByUser(User user);

    List<Ride> findByDriver(Driver driver);

    void deleteById(String id);

    long count();
}
