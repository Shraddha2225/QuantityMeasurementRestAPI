package com.bridgelab.quantitymeasurement;

import com.bridgelab.quantitymeasurement.enumeration.UnitType;
import com.bridgelab.quantitymeasurement.Implementation.IQuantityMeasurementService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class QuantitymeasurementApplicationTests {

    @Autowired
    IQuantityMeasurementService iQuantityMeasurementService;

    @Test
    void contextLoads() {
    }

    @Test
    void testForGettingAllUnitType() {
        List<UnitType> typeList=new ArrayList<>();
        typeList.add(UnitType.TEMPERATURE);
        typeList.add(UnitType.LENGTH);
        typeList.add(UnitType.VOLUME);
        typeList.add(UnitType.WEIGHT);
        List<UnitType> expectedList = iQuantityMeasurementService.getAllUnitType();
        Assertions.assertEquals(typeList,expectedList);
    }

}
