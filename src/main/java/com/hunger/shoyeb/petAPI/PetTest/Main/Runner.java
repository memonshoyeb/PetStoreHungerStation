package com.hunger.shoyeb.petAPI.PetTest.Main;


import com.hunger.shoyeb.petAPI.Utilities.core.Common;
import com.hunger.shoyeb.petAPI.Utilities.core.Driver;
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
