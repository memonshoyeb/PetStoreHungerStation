package com.java.PetRestAssured.PetTest.Main;


import com.java.PetRestAssured.Utilities.core.Driver;
import com.java.PetRestAssured.Utilities.core.Common;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Runner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Runner.class);

    public static void main(String[] args) {
        try {

            Driver.ExecuteTestSuite();
        } catch (Exception e) {
            LOGGER.error(Common.getStackTrace(e));
        }
    }

}
