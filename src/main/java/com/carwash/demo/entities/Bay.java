package com.carwash.demo.entities;

import com.carwash.demo.contants.CarwashConstants;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bay {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private boolean occupied;

    @Column
    private long timestamp;

    @Column
    private String type;

}
