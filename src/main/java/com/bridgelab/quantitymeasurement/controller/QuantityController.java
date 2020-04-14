package com.bridgelab.quantitymeasurement.controller;

import com.bridgelab.quantitymeasurement.enumeration.UnitType;
import com.bridgelab.quantitymeasurement.service.QuantityMeasurementServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuantityController {
    @Autowired
    QuantityMeasurementServices quantityMeasurementServices;

    @GetMapping("/all/UnitType")
    public List<UnitType> getAllUnitType(){
        return quantityMeasurementServices.getAllUnitType();
    }

    @GetMapping("/unit/type/{unitType}")
    public List<UnitType> getSubUnitType(){
        return quantityMeasurementServices.getSubUnitType();
    }
}
