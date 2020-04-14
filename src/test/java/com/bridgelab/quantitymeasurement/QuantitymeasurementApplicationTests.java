package com.bridgelab.quantitymeasurement;

import com.bridgelab.quantitymeasurement.enumeration.UnitType;
import com.bridgelab.quantitymeasurement.service.QuantityMeasurementServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class QuantitymeasurementApplicationTests {

    @Autowired
    QuantityMeasurementServices quantityMeasurementServices;

    @Test
    public void givenUnitType_ShouldReturnListOfAllUnitType() {
        List<UnitType> typeList=new ArrayList<>();
        typeList.add(UnitType.TEMPERATURE);
        typeList.add(UnitType.LENGTH);
        typeList.add(UnitType.VOLUME);
        typeList.add(UnitType.WEIGHT);
        List<UnitType> expectedList = quantityMeasurementServices.getAllUnitType();
        Assertions.assertEquals(typeList,expectedList);
    }

    @Test
    public void givenSubUnitType_ShouldReturnListOfAllSubUnitType() {
        List<UnitType> subUnitTypes=new ArrayList<>();
        subUnitTypes.add(UnitType.INCH);
        subUnitTypes.add(UnitType.FEET);
        subUnitTypes.add(UnitType.YARD);
        subUnitTypes.add(UnitType.CENTIMETER);
        subUnitTypes.add(UnitType.GALLON);
        subUnitTypes.add(UnitType.LITRE);
        List<UnitType> expectedList = quantityMeasurementServices.getSubUnitType();
        Assertions.assertEquals(subUnitTypes,expectedList);
    }

}
