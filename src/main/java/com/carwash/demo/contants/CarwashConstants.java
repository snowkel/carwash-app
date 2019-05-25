package com.carwash.demo.contants;

import org.springframework.stereotype.Component;

import java.util.HashMap;

    /*
    enum String WASH = "wash";

    private final String WAX = "wax";

    private final String AIR = "air";

    private final int WASH_TIME = 5;

    private final int WAX_TIME = 7;

    private final int AIR_TIME = 2;

    private final String[] actions = {WASH,WAX,AIR};

    private final int[] times = {WASH_TIME, WAX_TIME, AIR_TIME};

    static private
     */
    public enum CarwashConstants{
        WASH(10), WAX(15), AIR(5);
        private final int time;

        //private static HashMap<String, CarwashConstants> map = new HashMap<>();


        CarwashConstants(int time){
            this.time = time;
           // initMap();
        }

        public int getTime(){
            return time;
        }

/*
        private void initMap(){
            map.put("wash",CarwashConstants.WASH);
            map.put("wax",CarwashConstants.WAX);
            map.put("air",CarwashConstants.AIR);
        }

        */

    }

