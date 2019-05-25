package com.carwash.demo.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateCarwashRequest {

    /*
    private boolean needsWash;

    private boolean needsWax;

    private boolean needsAirTire;
     */

    @NotNull
    private String action;
}
