package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Payment;

import java.time.LocalDate;
import java.util.List;

public interface PaymentRepository {
    Payment save(Payment payment);

    Payment findById(String id);

    List<Payment> findAll();

    List<Payment> findByDate(LocalDate date);

    void deleteById(String id);

    long count();
}
