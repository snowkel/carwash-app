package com.carwash.demo.repository;


import com.carwash.demo.entities.Bay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarwashRepo extends JpaRepository<Bay, Long> {

    List<Bay> findByOccupiedFalse();


}
