package io.swagger.petstore.payloads.store;

import lombok.Data;

import java.util.Date;

@Data
public class StoreRequest {

    private int id;
    private int petId;
    private int quantity;
    private Date shipDate;
    private String status;
    private String complete;

}
