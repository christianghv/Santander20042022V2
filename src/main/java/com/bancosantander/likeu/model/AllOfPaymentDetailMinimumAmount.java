/*
 * Credits
 * The Credits API provides information about customer credit lines.
 *
 * OpenAPI spec version: 2.2.0
 * Contact: gipinacho@santander.com.mx
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.bancosantander.likeu.model;

import java.util.Objects;
/**
 * Indicates the minimum payment amount
 * @param   o
 * @return
 */
public class AllOfPaymentDetailMinimumAmount extends Money {

  @Override
  /**
 * Indicates the minimum payment amount
 * @param   o
 * @return
 */
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return super.equals(o);
  }

  @Override
  /**
 * Indicates the minimum payment amount
 * @return
 */
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }


  @Override
  /**
 * Indicates the minimum payment amount
 * @return
 */
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllOfPaymentDetailMinimumAmount {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   * @param   o
   * @return
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
