package io.swagger.petstore.tests.user;

import io.swagger.petstore.conditions.Conditions;
import io.swagger.petstore.payloads.user.UserRequest;
import org.testng.annotations.Test;

import java.util.Arrays;

import static io.swagger.petstore.constants.GeneralConstants.TYPE_UNKNOWN;
import static io.swagger.petstore.utils.TestDataProvider.getTestData;
import static io.swagger.petstore.utils.UserRequestUtil.getRandomUser;
import static org.apache.http.HttpStatus.SC_OK;

public class PostUserTest extends UserBaseTest {
    @Test
    public void testPostUser() {
        userApiService.postCreateUser(getRandomUser())
                .shouldHave(Conditions.statusCode(SC_OK))
                .shouldHave(Conditions.generalResponse(SC_OK, TYPE_UNKNOWN));
    }

    @Test
    public void testPostUserWithTestData() {
        UserRequest[] userRequests = getTestData(PostUserTest.class, UserRequest[].class);
        Arrays.asList(userRequests).forEach(userRequest ->
                userApiService.postCreateUser(userRequest)
                        .shouldHave(Conditions.statusCode(SC_OK))
                        .shouldHave(Conditions.generalResponse(SC_OK, TYPE_UNKNOWN)));

    }
}
