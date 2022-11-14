package io.swagger.petstore.payloads.user;

import lombok.Data;

@Data
public class StoreRequest {
    private String firstName;
    private String lastName;
    private String password;
    private int userStatus;
    private String phone;
    private int id;
    private String email;
    private String username;
}
