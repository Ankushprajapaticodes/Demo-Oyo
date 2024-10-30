package com.oyo.HotelManagement2.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RequestDto {


    int  hotelId;
    String name;
    String contactNumber;
    String status;

}
