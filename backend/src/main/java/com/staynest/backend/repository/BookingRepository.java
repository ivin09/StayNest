package com.staynest.backend.repository;


import com.staynest.backend.entity.Booking;
import com.staynest.backend.entity.Hotel;
import com.staynest.backend.entity.User;
import com.staynest.backend.entity.enums.BookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    Optional<Booking> findByPaymentSessionId(String sessionId);

    List<Booking> findByHotel(Hotel hotel);

    List<Booking> findByHotelAndCreatedAtBetween(Hotel hotel, LocalDateTime startDateTime, LocalDateTime endDateTime);

    List<Booking> findByUser(User user);

    List<Booking> findByUserAndBookingStatusIn(User user, Collection<BookingStatus> statuses);

    List<Booking> findByHotelAndBookingStatusInOrderByCreatedAtDesc(Hotel hotel, Collection<BookingStatus> statuses);
}
