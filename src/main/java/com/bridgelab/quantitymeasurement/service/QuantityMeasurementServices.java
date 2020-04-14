package com.bridgelab.quantitymeasurement.service;

import com.bridgelab.quantitymeasurement.enumeration.UnitType;
import com.bridgelab.quantitymeasurement.Implementation.IQuantityMeasurementService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuantityMeasurementServices implements IQuantityMeasurementService {
    @Override
    public List<UnitType> getAllUnitType() {
        List<UnitType> unitTypes=new ArrayList<>();
        unitTypes.add(UnitType.TEMPERATURE);
        unitTypes.add(UnitType.LENGTH);
        unitTypes.add(UnitType.VOLUME);
        unitTypes.add(UnitType.WEIGHT);
        return unitTypes;
    }
}
