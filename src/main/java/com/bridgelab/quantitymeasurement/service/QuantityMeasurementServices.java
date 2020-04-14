package com.bridgelab.quantitymeasurement.service;

import com.bridgelab.quantitymeasurement.enumeration.UnitType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuantityMeasurementServices  {

    public List<UnitType> getAllUnitType() {
        List<UnitType> unitTypes=new ArrayList<>();
        unitTypes.add(UnitType.TEMPERATURE);
        unitTypes.add(UnitType.LENGTH);
        unitTypes.add(UnitType.VOLUME);
        unitTypes.add(UnitType.WEIGHT);
        return unitTypes;
    }

    public List<UnitType> getSubUnitType() {
        List<UnitType> subUnitTypes=new ArrayList<>();
        subUnitTypes.add(UnitType.INCH);
        subUnitTypes.add(UnitType.FEET);
        subUnitTypes.add(UnitType.YARD);
        subUnitTypes.add(UnitType.CENTIMETER);
        subUnitTypes.add(UnitType.GALLON);
        subUnitTypes.add(UnitType.LITRE);
        return subUnitTypes;
    }
}
