package com.oyo.HotelManagement2.reop;

import com.oyo.HotelManagement2.entiry.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

}
