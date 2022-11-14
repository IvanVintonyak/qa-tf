package io.swagger.petstore.services.user;

import io.qameta.allure.Step;
import io.swagger.petstore.assertions.AssertableResponse;
import io.swagger.petstore.payloads.user.UserRequest;
import io.swagger.petstore.services.ApiService;

public class UserApiService extends ApiService {

    @Step
    public AssertableResponse getUserLogout(){
        return new AssertableResponse(request()
                .get("user/logout"));
    }

    @Step
    public AssertableResponse postCreateUser(UserRequest userRequest){
        return new AssertableResponse(request()

                .body(userRequest)
                .when()
                .post("user"));
    }
}
