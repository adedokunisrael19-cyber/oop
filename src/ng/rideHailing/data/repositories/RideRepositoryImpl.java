package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Driver;
import ng.rideHailing.data.models.Ride;
import ng.rideHailing.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class RideRepositoryImpl implements RideRepository {

    private final List<Ride> rides = new ArrayList<>();
    @Override
    public Ride save(Ride ride) {
        if (ride.getId() == null || ride.getId().isEmpty()) {
            ride.setId(String.valueOf(rides.size() + 1));
        }

        rides.add(ride);

        return ride;
    }

    @Override
    public Ride findById(String id) {

        for (Ride ride : rides) {

            if (ride.getId().equals(id)) {
                return ride;
            }
        }

        return null;
    }

    @Override
    public List<Ride> findAll() {
        return List.of();
    }

    @Override
    public List<Ride> findByUser(User user) {
        return List.of();
    }

    @Override
    public List<Ride> findByDriver(Driver driver) {
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
