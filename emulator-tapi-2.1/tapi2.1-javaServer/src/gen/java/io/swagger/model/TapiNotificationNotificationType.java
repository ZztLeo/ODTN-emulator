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
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets tapi.notification.NotificationType
 */
public enum TapiNotificationNotificationType {
  
  OBJECT_CREATION("OBJECT_CREATION"),
  
  OBJECT_DELETION("OBJECT_DELETION"),
  
  ATTRIBUTE_VALUE_CHANGE("ATTRIBUTE_VALUE_CHANGE"),
  
  ALARM_EVENT("ALARM_EVENT"),
  
  THRESHOLD_CROSSING_ALERT("THRESHOLD_CROSSING_ALERT");

  private String value;

  TapiNotificationNotificationType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TapiNotificationNotificationType fromValue(String text) {
    for (TapiNotificationNotificationType b : TapiNotificationNotificationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
