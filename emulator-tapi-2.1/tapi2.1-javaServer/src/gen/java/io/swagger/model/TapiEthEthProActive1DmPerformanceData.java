/*
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API
 * tapi-common,tapi-dsr,tapi-path-computation,tapi-eth,tapi-virtual-network,tapi-topology,tapi-notification,tapi-oam,tapi-photonic-media,tapi-connectivity API generated from yang definitions
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TapiEthStatisticalDmPerformanceParameters;
import javax.validation.constraints.*;

/**
 * TapiEthEthProActive1DmPerformanceData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiEthEthProActive1DmPerformanceData   {
  @JsonProperty("pro-active-near-end-1-dm-parameters")
  private TapiEthStatisticalDmPerformanceParameters proActiveNearEnd1DmParameters = null;

  public TapiEthEthProActive1DmPerformanceData proActiveNearEnd1DmParameters(TapiEthStatisticalDmPerformanceParameters proActiveNearEnd1DmParameters) {
    this.proActiveNearEnd1DmParameters = proActiveNearEnd1DmParameters;
    return this;
  }

  /**
   * This attribute contains the statistical near end performnace parameters.
   * @return proActiveNearEnd1DmParameters
   **/
  @JsonProperty("pro-active-near-end-1-dm-parameters")
  @ApiModelProperty(value = "This attribute contains the statistical near end performnace parameters.")
  public TapiEthStatisticalDmPerformanceParameters getProActiveNearEnd1DmParameters() {
    return proActiveNearEnd1DmParameters;
  }

  public void setProActiveNearEnd1DmParameters(TapiEthStatisticalDmPerformanceParameters proActiveNearEnd1DmParameters) {
    this.proActiveNearEnd1DmParameters = proActiveNearEnd1DmParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiEthEthProActive1DmPerformanceData tapiEthEthProActive1DmPerformanceData = (TapiEthEthProActive1DmPerformanceData) o;
    return Objects.equals(this.proActiveNearEnd1DmParameters, tapiEthEthProActive1DmPerformanceData.proActiveNearEnd1DmParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proActiveNearEnd1DmParameters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiEthEthProActive1DmPerformanceData {\n");
    
    sb.append("    proActiveNearEnd1DmParameters: ").append(toIndentedString(proActiveNearEnd1DmParameters)).append("\n");
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
