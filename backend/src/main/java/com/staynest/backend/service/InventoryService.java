package com.staynest.backend.service;


import com.staynest.backend.dto.HotelPriceResponseDto;
import com.staynest.backend.dto.HotelSearchRequest;
import com.staynest.backend.dto.InventoryDto;
import com.staynest.backend.dto.UpdateInventoryRequestDto;
import com.staynest.backend.entity.Room;
import org.springframework.data.domain.Page;

import java.util.List;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceResponseDto> searchHotels(HotelSearchRequest hotelSearchRequest);

    List<InventoryDto> getAllInventoryByRoom(Long roomId);

    void updateInventory(Long roomId, UpdateInventoryRequestDto updateInventoryRequestDto);
}
