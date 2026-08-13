package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private final List<User> users = new ArrayList<>();

    @Override
    public User save(User user) {
        if (user.getId() == null || user.getId().isEmpty()) {
            user.setId(String.valueOf(users.size() + 1));
        }

        users.add(user);

        return user;
    }

    @Override
    public User findById(String id) {
        for (User user : users) {

            if (user.getId().equals(id)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public User findByEmail(String email) {
        return null;
    }

    @Override
    public List<User> findAll() {
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
