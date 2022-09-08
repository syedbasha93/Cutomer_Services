package com.example.demo.api;


import com.example.demo.api.model.JwtRequest;
import com.example.demo.model.JwtResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-01-15T12:51:43.809971036+01:00[Europe/Amsterdam]")
@Validated
@Api(value = "JwtRequest", description = "the customer API")
public interface JWTAPI {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customer : Create Customer
     *
     * @param customer  (optional)
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Create Jwt", nickname = "createJwtToken", notes = "", response = JwtResponse.class, tags={ "Customer", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK", response = JwtResponse.class) })
    @RequestMapping(
            method = RequestMethod.POST,
            value = "/customer",
            produces = { "application/json" },
            consumes = { "application/json" }
    )
    default ResponseEntity<JwtResponse> createJwtToken(@ApiParam(value = "") @Valid @RequestBody(required = false) JwtRequest customer) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                        break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }}