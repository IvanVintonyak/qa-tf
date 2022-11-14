package io.swagger.petstore.tests.pet;

import org.testng.annotations.Test;

public class PetIdUploadImageTest extends PetBaseTest {
    @Test
    public void testPostPetPetIdUploadImage() {
        String filePath = "src/test/resources/io/swagger/petstore/tests/pet/file.png";

        petApiService.postPetPetIdUploadImage(5, "metadata", filePath);
    }
}
