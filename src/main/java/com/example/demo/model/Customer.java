package io.swagger.model;

import java.util.Objects;

import com.example.demo.constants.CustomerConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-08-30T04:28:50.126Z[GMT]")


public class Customer   {
  @JsonProperty("customerNumber")
  @NotEmpty (message = "CustomerNumber should not be Empty")
  @Pattern(regexp = CustomerConstants.ALPHA_NUMBERS, message = CustomerConstants.CUST_NUM_VALIDATE)
  @Size(min = CustomerConstants.CUSTNO_MIN, max = CustomerConstants.CUSTNO_MAX, message = CustomerConstants.CUSTNO_VALIDATION)
  private String customerNumber = null;

  @JsonProperty("firstName")
  @Size(min = CustomerConstants.NAME_VAL_MIN, max = CustomerConstants.NAME_VAL_MAX, message = CustomerConstants.NAME_VALIDATION)
  private String firstName = null;

  @JsonProperty("lastName")
  @Size(min = CustomerConstants.NAME_VAL_MIN, max = CustomerConstants.NAME_VAL_MAX, message = CustomerConstants.NAME_VALIDATION)

  private String lastName = null;

  @JsonProperty("birthDate")
  @DateTimeFormat(pattern = CustomerConstants.DATE_FORMAT)
  private String birthDate = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("countryCode")
  @Size(min = 2, max = 2, message = "Country should allow 2Charaters")
  private String countryCode = null;

  @JsonProperty("mobileNumber")
  @Size(min = 10, max = 10, message = "mobile number should be 10 digits length")
  private String mobileNumber = null;

  public Customer customerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
    return this;
  }

  /**
   * Get customerNumber
   * @return customerNumber
   **/
  @Schema(description = "")
  
    public String getCustomerNumber() {
    return customerNumber;
  }

  public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   **/
  @Schema(description = "")
  
    public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
   **/
  @Schema(description = "")
  
    public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  /**
   * Get birthDate
   * @return birthDate
   **/
  @Schema(example = "Date(YYYY-MM-YY)", description = "")
  
    public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }

  public Customer country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(description = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Customer countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Get countryCode
   * @return countryCode
   **/
  @Schema(example = "IN", description = "")
  
    public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public Customer mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Get mobileNumber
   * @return mobileNumber
   **/
  @Schema(description = "")
  
    public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerNumber, customer.customerNumber) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.birthDate, customer.birthDate) &&
        Objects.equals(this.country, customer.country) &&
        Objects.equals(this.countryCode, customer.countryCode) &&
        Objects.equals(this.mobileNumber, customer.mobileNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerNumber, firstName, lastName, birthDate, country, countryCode, mobileNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerNumber: ").append(toIndentedString(customerNumber)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
