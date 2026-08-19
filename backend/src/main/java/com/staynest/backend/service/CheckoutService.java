package com.staynest.backend.service;

import com.staynest.backend.entity.Booking;

public interface CheckoutService {

    String getCheckoutSession(Booking booking, String successUrl, String failureUrl);

}
