package com.carwash.demo.services;

import com.carwash.demo.contants.CarwashConstants;
import com.carwash.demo.entities.Bay;
import com.carwash.demo.repository.CarwashRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarwashService {

    private final CarwashRepo carwashRepo;

    //private final CarwashConstants constants;

    public CarwashService(CarwashRepo carwashRepo) {
        this.carwashRepo = carwashRepo;
    }

    public Bay getBay(String action){
        List<Bay> bays = carwashRepo.findAll();

        for (Bay bay: bays){
            //Bay bay = bays.get(i);
            //LocalTime expireTime =
            long timestamp = bay.getTimestamp();

            long x = Instant.now().getEpochSecond();

            if(Instant.now().getEpochSecond()>=timestamp){
                return bay;
            }

        }

        return null;
    }


    public List<Bay> getBays(String action){
        //checks all bays to see which ones are free

        //List<Bay> bays = carwashRepo.findByOccupiedFalse();

        //return Math.toIntExact(bays.get(0).getId());
        List<Bay> bays = carwashRepo.findAll();
        List<Bay> resultBays = new ArrayList<Bay>();

        for (Bay bay: bays){
            //Bay bay = bays.get(i);

            long timestamp = bay.getTimestamp();

            if(Instant.now().getEpochSecond()>=timestamp){
                resultBays.add(bay);
            }

        }

        return resultBays;
    }

    public Long insertBay(){
        Bay bay = new Bay();
        bay.setTimestamp(Instant.now().getEpochSecond());

        carwashRepo.save(bay);

        return bay.getId();
    }

    public long useBay(String action){
        //use the bay but do
        //it asynchornously

        Bay bay = getBay(action);
        bay.setTimestamp(bay.getTimestamp() + CarwashConstants.valueOf(action).getTime());

        //bay.setType(action);

        //return Math.toIntExact(bay.getId());
        return bay.getId();
    }

}
