package com.oyo.HotelManagement2.service;


import com.oyo.HotelManagement2.dto.RequestDto;
import com.oyo.HotelManagement2.entiry.Hotel;
import com.oyo.HotelManagement2.reop.HotelRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HotelService {


    @Autowired
    HotelRepository hotelRepository;

    public Boolean createHotel(Hotel hotel){
        Hotel hotel = new Hotel();

        requestDto.setName(hotel.getName());
        requestDto.setHotelId(hotel.getHotelId());
        requestDto.setContactNumber(hotel.getContactNumber());
        requestDto.setStatus(hotel.getStatus());

        hotelRepository.save(requestDto);

        return true;
    }


}
