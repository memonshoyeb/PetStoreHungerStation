package com.hunger.shoyeb.petAPI.PetTest.Scenarios;


import com.hunger.shoyeb.petAPI.PetTest.Test.PetAPI;
import com.hunger.shoyeb.petAPI.Utilities.core.Common;
import com.hunger.shoyeb.petAPI.Utilities.core.Global;
import io.restassured.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TestScenarios {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestScenarios.class);

    @Test
    public void validateGetPetByID() {
        try {
            Response response= PetAPI.ExecuteRequest(Global.Test.TestDataRow);
            PetAPI.verifyResponseExpectedResult(response,Global.Test.TestDataRow.get("ExpectedResultJsonPAth".toUpperCase()),Global.Test.TestDataRow.get("ExpectedResult".toUpperCase()));
        } catch (Exception ex) {
            LOGGER.error(Common.getStackTrace(ex));
        }
    }


    @Test
    public void validateGetPetByStatus() {
        try {
            Response response= PetAPI.ExecuteRequest(Global.Test.TestDataRow);
            PetAPI.verifyResponseExpectedResult(response,Global.Test.TestDataRow.get("ExpectedResultJsonPAth".toUpperCase()),Global.Test.TestDataRow.get("ExpectedResult".toUpperCase()));
        } catch (Exception ex) {
            LOGGER.error(Common.getStackTrace(ex));
        }
    }


    @Test
    public void validateDeletePetByID() {
        try {
            Response response= PetAPI.ExecuteRequest(Global.Test.TestDataRow);
            PetAPI.verifyResponseStatus(response,Global.Test.TestDataRow.get("ExpectedStatus".toUpperCase()));
        } catch (Exception ex) {
            LOGGER.error(Common.getStackTrace(ex));
        }
    }


    @Test
    public void validateAddNewPet() {
        try {
            Response response= PetAPI.ExecuteRequest(Global.Test.TestDataRow);
            PetAPI.verifyResponseExpectedResult(response,Global.Test.TestDataRow.get("ExpectedResultJsonPAth".toUpperCase()),Global.Test.TestDataRow.get("ExpectedResult".toUpperCase()));
        } catch (Exception ex) {
            LOGGER.error(Common.getStackTrace(ex));
        }
    }


    @Test
    public void validateUpdateExistingPET() {
        try {
            Response response= PetAPI.ExecuteRequest(Global.Test.TestDataRow);
            PetAPI.verifyResponseExpectedResult(response,Global.Test.TestDataRow.get("ExpectedResultJsonPAth".toUpperCase()),Global.Test.TestDataRow.get("ExpectedResult".toUpperCase()));
        } catch (Exception ex) {
            LOGGER.error(Common.getStackTrace(ex));
        }
    }


    @Test
    public void validateUpdateExistingPETByFormData() {
        try {
            Response response= PetAPI.ExecuteRequest(Global.Test.TestDataRow);
            PetAPI.verifyResponseExpectedResult(response,Global.Test.TestDataRow.get("ExpectedResultJsonPAth".toUpperCase()),Global.Test.TestDataRow.get("ExpectedResult".toUpperCase()));
        } catch (Exception ex) {
            LOGGER.error(Common.getStackTrace(ex));
        }
    }

}
