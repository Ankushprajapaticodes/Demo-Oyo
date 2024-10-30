package com.oyo.HotelManagement2.controler;


import com.oyo.HotelManagement2.entiry.Hotel;
import com.oyo.HotelManagement2.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/oyo/v1")
public class HotelControler {


    @Autowired
    HotelService hotelService;


    @PutMapping("{/add}")
    public Boolean  createHotel(@RequestBody Re  hotel){
        return hotelService.createHotel(hotel);
    }
}
