package io.swagger.petstore.tests.pet;

import org.testng.annotations.Test;

import static io.swagger.petstore.conditions.Conditions.generalResponse;
import static io.swagger.petstore.conditions.Conditions.statusCode;
import static io.swagger.petstore.constants.GeneralConstants.TYPE_UNKNOWN;
import static org.apache.http.HttpStatus.SC_OK;

public class PetIdUploadImageTest extends PetBaseTest {
    @Test
    public void testPostPetPetIdUploadImage() {
        String filePath = "src/test/resources/io/swagger/petstore/tests/pet/file.png";

        petApiService.postPetPetIdUploadImage(5, "metadata", filePath)
                .shouldHave(statusCode(SC_OK))
                .shouldHave(generalResponse(SC_OK, TYPE_UNKNOWN));
    }
}
