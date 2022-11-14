package io.swagger.petstore.utils;

import com.github.javafaker.Faker;
import io.swagger.petstore.config.ProjectConfigImpl;
import io.swagger.petstore.payloads.store.StoreRequest;
import lombok.experimental.UtilityClass;

import java.util.Date;
import java.util.Locale;

@UtilityClass
public class StoreRequestUtil implements ProjectConfigImpl {
    private final Faker faker = new Faker(new Locale(config.locale()));

    public static StoreRequest getRandomStore() {
        StoreRequest storeRequest = new StoreRequest();
        storeRequest.setId(0);
        storeRequest.setPetId(0);
        return storeRequest;


    }
}
