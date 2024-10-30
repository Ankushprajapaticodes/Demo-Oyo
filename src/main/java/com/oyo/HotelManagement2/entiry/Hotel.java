package com.oyo.HotelManagement2.entiry;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity1
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "Hotel_id", nullable = false)
    int  hotelId;

    @Column(name = "Hotel_name", nullable = false)
    String name;

    @Column(name = "Contact_number")
    String contactNumber;

    @Column(name = "Status")
    String status;
}
