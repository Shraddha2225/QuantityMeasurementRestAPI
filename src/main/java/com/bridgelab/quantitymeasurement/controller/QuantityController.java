package com.bridgelab.quantitymeasurement.controller;

import com.bridgelab.quantitymeasurement.enumeration.UnitType;
import com.bridgelab.quantitymeasurement.Implementation.IQuantityMeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuantityController {
    @Autowired
    IQuantityMeasurementService iQuantityMeasurementService;
    @RequestMapping("/allUnitType")
    public List<UnitType> getAllUnitType(){
        return iQuantityMeasurementService.getAllUnitType();
    }
}
