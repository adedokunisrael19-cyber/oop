package ng.rideHailing.data.repositories;

import ng.rideHailing.data.models.Payment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepositoryImpl implements PaymentRepository {

    private final List<Payment> payments = new ArrayList<>();

    @Override
    public Payment save(Payment payment) {
        if (payment.getId() == null || payment.getId().isEmpty()) {
            payment.setId(String.valueOf(payments.size() + 1));
        }

        payments.add(payment);

        return payment;
    }

    @Override
    public Payment findById(String id) {
        for (Payment payment : payments) {

            if (payment.getId().equals(id)) {
                return payment;
            }
        }

        return null;
    }

    @Override
    public List<Payment> findAll() {
        return List.of();
    }

    @Override
    public List<Payment> findByDate(LocalDate date) {
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
