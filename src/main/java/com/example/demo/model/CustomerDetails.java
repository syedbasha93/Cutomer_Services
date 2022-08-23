package com.example.demo.model;

import com.example.demo.constants.CustomerConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerDetails {
    @NotEmpty (message = "CustomerNumber should not be Empty")
    @Pattern(regexp = CustomerConstants.ALPHA_NUMBERS, message = CustomerConstants.CUST_NUM_VALIDATE)
    @Size(min = CustomerConstants.CUSTNO_MIN, max = CustomerConstants.CUSTNO_MAX, message = CustomerConstants.CUSTNO_VALIDATION)
    private String customerNumber;

    @Size(min = CustomerConstants.NAME_VAL_MIN, max = CustomerConstants.NAME_VAL_MAX, message = CustomerConstants.NAME_VALIDATION)
    private String firstName;

    @Size(min = CustomerConstants.NAME_VAL_MIN, max = CustomerConstants.NAME_VAL_MAX, message = CustomerConstants.NAME_VALIDATION)
    private String lastName;

    @DateTimeFormat(pattern = CustomerConstants.DATE_FORMAT)
    private Date birthDate;

    private String country;
    @Size(min = 2, max = 2, message = "Country should allow 2Charaters")
    private String countryCode;
    @Size(min = 10, max = 10, message = "mobile number should be 10 digits length")
    private String mobileNumber;
    //private String customerStatus;//
    //private String address;

}

