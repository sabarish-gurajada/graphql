package com.virtualcodemonkeys.project2.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SuperCustomer {

    private String id;
    private Integer sortcode;
    private Integer accno;
    private String title;
    private String fname;
    private String sname;
    private Integer abalance;
    private Integer cbalance;
    private String postcode;
    private Integer dob;
    private String custtype;
    private String mandate;

}
