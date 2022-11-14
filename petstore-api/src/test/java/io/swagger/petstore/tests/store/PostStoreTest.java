package io.swagger.petstore.tests.store;

import org.testng.annotations.Test;

import static io.swagger.petstore.conditions.Conditions.statusCode;
import static io.swagger.petstore.utils.StoreRequestUtil.getRandomStore;
import static org.apache.http.HttpStatus.SC_OK;

public class PostStoreTest extends StoreBaseTest {
    @Test
    public void testPostStore() {
        storeApiService.testPostStore(getRandomStore())
                .shouldHave(statusCode(SC_OK));

    }
}
