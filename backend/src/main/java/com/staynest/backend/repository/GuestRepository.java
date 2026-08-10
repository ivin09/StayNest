package com.staynest.backend.repository;


import com.staynest.backend.entity.Guest;
import com.staynest.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}