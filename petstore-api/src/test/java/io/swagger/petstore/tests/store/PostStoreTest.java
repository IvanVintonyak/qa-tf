package io.swagger.petstore.tests.store;

import io.swagger.petstore.conditions.Conditions;
import io.swagger.petstore.services.store.StoreApiService;
import org.testng.annotations.Test;

import static io.swagger.petstore.conditions.Conditions.statusCode;
import static io.swagger.petstore.constants.GeneralConstants.TYPE_UNKNOWN;
import static io.swagger.petstore.utils.StoreRequestUtil.getRandomStore;
import static org.apache.http.HttpStatus.SC_OK;

public class PostStoreTest extends StoreBaseTest {
    @Test
    public void testPostStore(){
        storeApiService.testPostStore(getRandomStore())
                .shouldHave(statusCode(SC_OK));
    }
}
