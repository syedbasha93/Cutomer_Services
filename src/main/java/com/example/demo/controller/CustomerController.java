package com.example.demo.controller;

import com.example.demo.exception.CustomException;
import com.example.demo.model.CustomerDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customers")
//@SecurityRequirement(name = "customer-api")
public class CustomerController {
    @PostMapping(path = "/customerData",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Object> intiatePaymentTranscation( @Valid @RequestBody CustomerDetails customerDetails) throws CustomException {
            CustomerDetails customerDetail =new CustomerDetails();;
            if (customerDetails != null) {
                customerDetail.setCustomerNumber(customerDetails.getCustomerNumber());
                customerDetail.setFirstName(customerDetails.getFirstName());
                customerDetail.setLastName(customerDetails.getLastName());
                customerDetail.setBirthDate(customerDetails.getBirthDate());
                customerDetail.setCountry(customerDetails.getCountry());
                customerDetail.setCountryCode(customerDetails.getCountryCode());
                customerDetail.setMobileNumber(customerDetails.getMobileNumber());
            }
            return new ResponseEntity<>(customerDetail, HttpStatus.OK);
    }

}
