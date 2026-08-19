package com.staynest.backend.service;

import com.staynest.backend.dto.BookingDto;
import com.staynest.backend.dto.BookingRequest;
import com.staynest.backend.dto.BookingsTableResponseDto;
import com.staynest.backend.dto.HotelReportDto;
import com.stripe.model.Event;

import java.time.LocalDate;
import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<Long> guestIdList);

    BookingDto removeGuestFromBooking(Long bookingId, List<Long> guestIdList);

    String initiatePayments(Long bookingId);

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    BookingDto getBookingById(Long bookingId);

    List<BookingsTableResponseDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();
}
