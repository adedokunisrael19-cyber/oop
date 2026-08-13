package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.User;

import java.util.List;

public interface UserRepository {
    User save(User user);

    User findById(String id);

    User findByEmail(String email);

    List<User> findAll();

    void deleteById(String id);

    long count();
}
