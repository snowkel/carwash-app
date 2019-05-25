package com.carwash.demo.controllers;

import com.carwash.demo.models.CreateCarwashRequest;
import com.carwash.demo.models.CreateCarwashResponse;
import com.carwash.demo.services.CarwashService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController

@RequestMapping("/api")
public class CarwashController {

    @Autowired
    CarwashService carwashService;

    @GetMapping("/addBay")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCarwashResponse createBay(){

        long num = carwashService.insertBay();

        return CreateCarwashResponse.builder().bayNumber(num).build();
    }

    @PostMapping("/getBay")
    @ResponseStatus(HttpStatus.CREATED)
    public CreateCarwashResponse getBay(@RequestBody @Valid CreateCarwashRequest carwashRequest){

        long num = carwashService.useBay(carwashRequest.getAction());

        return CreateCarwashResponse.builder().bayNumber(num).build();
    }
}
