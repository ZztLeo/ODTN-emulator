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
import io.swagger.model.TapiCommonGlobalClass;
import io.swagger.model.TapiCommonLayerProtocolName;
import io.swagger.model.TapiCommonNameAndValue;
import io.swagger.model.TapiNotificationAlarmInfo;
import io.swagger.model.TapiNotificationNameAndValueChange;
import io.swagger.model.TapiNotificationNotificationType;
import io.swagger.model.TapiNotificationObjectType;
import io.swagger.model.TapiNotificationSourceIndicator;
import io.swagger.model.TapiNotificationTcaInfo;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * TapiNotificationNotification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-11-14T14:58:12.974+01:00")
public class TapiNotificationNotification   {
  @JsonProperty("name")
  private List<TapiCommonNameAndValue> name = null;

  @JsonProperty("uuid")
  private String uuid = null;

  @JsonProperty("target-object-type")
  private TapiNotificationObjectType targetObjectType = null;

  @JsonProperty("additional-text")
  private String additionalText = null;

  @JsonProperty("event-time-stamp")
  private String eventTimeStamp = null;

  @JsonProperty("additional-info")
  private List<TapiCommonNameAndValue> additionalInfo = null;

  @JsonProperty("sequence-number")
  private Integer sequenceNumber = null;

  @JsonProperty("tca-info")
  private TapiNotificationTcaInfo tcaInfo = null;

  @JsonProperty("target-object-identifier")
  private String targetObjectIdentifier = null;

  @JsonProperty("notification-type")
  private TapiNotificationNotificationType notificationType = null;

  @JsonProperty("target-object-name")
  private List<TapiCommonNameAndValue> targetObjectName = null;

  @JsonProperty("layer-protocol-name")
  private TapiCommonLayerProtocolName layerProtocolName = null;

  @JsonProperty("source-indicator")
  private TapiNotificationSourceIndicator sourceIndicator = null;

  @JsonProperty("alarm-info")
  private TapiNotificationAlarmInfo alarmInfo = null;

  @JsonProperty("changed-attributes")
  private List<TapiNotificationNameAndValueChange> changedAttributes = null;

  public TapiNotificationNotification name(List<TapiCommonNameAndValue> name) {
    this.name = name;
    return this;
  }

  public TapiNotificationNotification addNameItem(TapiCommonNameAndValue nameItem) {
    if (this.name == null) {
      this.name = new ArrayList<TapiCommonNameAndValue>();
    }
    this.name.add(nameItem);
    return this;
  }

  /**
   * List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(value = "List of names. A property of an entity with a value that is unique in some namespace but may change during the life of the entity. A name carries no semantics with respect to the purpose of the entity.")
  public List<TapiCommonNameAndValue> getName() {
    return name;
  }

  public void setName(List<TapiCommonNameAndValue> name) {
    this.name = name;
  }

  public TapiNotificationNotification uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

  /**
   * UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-&#39; + &#39;[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6
   * @return uuid
   **/
  @JsonProperty("uuid")
  @ApiModelProperty(value = "UUID: An identifier that is universally unique within an identifier space, where the identifier space is itself globally unique, and immutable. An UUID carries no semantics with respect to the purpose or state of the entity.                      UUID here uses string representation as defined in RFC 4122.  The canonical representation uses lowercase characters.                      Pattern: [0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-' + '[0-9a-fA-F]{4}-[0-9a-fA-F]{12}                       Example of a UUID in string representation: f81d4fae-7dec-11d0-a765-00a0c91e6bf6")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public TapiNotificationNotification targetObjectType(TapiNotificationObjectType targetObjectType) {
    this.targetObjectType = targetObjectType;
    return this;
  }

  /**
   * none
   * @return targetObjectType
   **/
  @JsonProperty("target-object-type")
  @ApiModelProperty(value = "none")
  public TapiNotificationObjectType getTargetObjectType() {
    return targetObjectType;
  }

  public void setTargetObjectType(TapiNotificationObjectType targetObjectType) {
    this.targetObjectType = targetObjectType;
  }

  public TapiNotificationNotification additionalText(String additionalText) {
    this.additionalText = additionalText;
    return this;
  }

  /**
   * none
   * @return additionalText
   **/
  @JsonProperty("additional-text")
  @ApiModelProperty(value = "none")
  public String getAdditionalText() {
    return additionalText;
  }

  public void setAdditionalText(String additionalText) {
    this.additionalText = additionalText;
  }

  public TapiNotificationNotification eventTimeStamp(String eventTimeStamp) {
    this.eventTimeStamp = eventTimeStamp;
    return this;
  }

  /**
   * none
   * @return eventTimeStamp
   **/
  @JsonProperty("event-time-stamp")
  @ApiModelProperty(value = "none")
  public String getEventTimeStamp() {
    return eventTimeStamp;
  }

  public void setEventTimeStamp(String eventTimeStamp) {
    this.eventTimeStamp = eventTimeStamp;
  }

  public TapiNotificationNotification additionalInfo(List<TapiCommonNameAndValue> additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  public TapiNotificationNotification addAdditionalInfoItem(TapiCommonNameAndValue additionalInfoItem) {
    if (this.additionalInfo == null) {
      this.additionalInfo = new ArrayList<TapiCommonNameAndValue>();
    }
    this.additionalInfo.add(additionalInfoItem);
    return this;
  }

  /**
   * none
   * @return additionalInfo
   **/
  @JsonProperty("additional-info")
  @ApiModelProperty(value = "none")
  public List<TapiCommonNameAndValue> getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(List<TapiCommonNameAndValue> additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public TapiNotificationNotification sequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
    return this;
  }

  /**
   * A monotonous increasing sequence number associated with the notification.                      The exact semantics of how this sequence number is assigned (per channel or subscription or source or system) is left undefined.
   * @return sequenceNumber
   **/
  @JsonProperty("sequence-number")
  @ApiModelProperty(value = "A monotonous increasing sequence number associated with the notification.                      The exact semantics of how this sequence number is assigned (per channel or subscription or source or system) is left undefined.")
  public Integer getSequenceNumber() {
    return sequenceNumber;
  }

  public void setSequenceNumber(Integer sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }

  public TapiNotificationNotification tcaInfo(TapiNotificationTcaInfo tcaInfo) {
    this.tcaInfo = tcaInfo;
    return this;
  }

  /**
   * none
   * @return tcaInfo
   **/
  @JsonProperty("tca-info")
  @ApiModelProperty(value = "none")
  public TapiNotificationTcaInfo getTcaInfo() {
    return tcaInfo;
  }

  public void setTcaInfo(TapiNotificationTcaInfo tcaInfo) {
    this.tcaInfo = tcaInfo;
  }

  public TapiNotificationNotification targetObjectIdentifier(String targetObjectIdentifier) {
    this.targetObjectIdentifier = targetObjectIdentifier;
    return this;
  }

  /**
   * none
   * @return targetObjectIdentifier
   **/
  @JsonProperty("target-object-identifier")
  @ApiModelProperty(value = "none")
  public String getTargetObjectIdentifier() {
    return targetObjectIdentifier;
  }

  public void setTargetObjectIdentifier(String targetObjectIdentifier) {
    this.targetObjectIdentifier = targetObjectIdentifier;
  }

  public TapiNotificationNotification notificationType(TapiNotificationNotificationType notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * none
   * @return notificationType
   **/
  @JsonProperty("notification-type")
  @ApiModelProperty(value = "none")
  public TapiNotificationNotificationType getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(TapiNotificationNotificationType notificationType) {
    this.notificationType = notificationType;
  }

  public TapiNotificationNotification targetObjectName(List<TapiCommonNameAndValue> targetObjectName) {
    this.targetObjectName = targetObjectName;
    return this;
  }

  public TapiNotificationNotification addTargetObjectNameItem(TapiCommonNameAndValue targetObjectNameItem) {
    if (this.targetObjectName == null) {
      this.targetObjectName = new ArrayList<TapiCommonNameAndValue>();
    }
    this.targetObjectName.add(targetObjectNameItem);
    return this;
  }

  /**
   * none
   * @return targetObjectName
   **/
  @JsonProperty("target-object-name")
  @ApiModelProperty(value = "none")
  public List<TapiCommonNameAndValue> getTargetObjectName() {
    return targetObjectName;
  }

  public void setTargetObjectName(List<TapiCommonNameAndValue> targetObjectName) {
    this.targetObjectName = targetObjectName;
  }

  public TapiNotificationNotification layerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
    return this;
  }

  /**
   * none
   * @return layerProtocolName
   **/
  @JsonProperty("layer-protocol-name")
  @ApiModelProperty(value = "none")
  public TapiCommonLayerProtocolName getLayerProtocolName() {
    return layerProtocolName;
  }

  public void setLayerProtocolName(TapiCommonLayerProtocolName layerProtocolName) {
    this.layerProtocolName = layerProtocolName;
  }

  public TapiNotificationNotification sourceIndicator(TapiNotificationSourceIndicator sourceIndicator) {
    this.sourceIndicator = sourceIndicator;
    return this;
  }

  /**
   * none
   * @return sourceIndicator
   **/
  @JsonProperty("source-indicator")
  @ApiModelProperty(value = "none")
  public TapiNotificationSourceIndicator getSourceIndicator() {
    return sourceIndicator;
  }

  public void setSourceIndicator(TapiNotificationSourceIndicator sourceIndicator) {
    this.sourceIndicator = sourceIndicator;
  }

  public TapiNotificationNotification alarmInfo(TapiNotificationAlarmInfo alarmInfo) {
    this.alarmInfo = alarmInfo;
    return this;
  }

  /**
   * none
   * @return alarmInfo
   **/
  @JsonProperty("alarm-info")
  @ApiModelProperty(value = "none")
  public TapiNotificationAlarmInfo getAlarmInfo() {
    return alarmInfo;
  }

  public void setAlarmInfo(TapiNotificationAlarmInfo alarmInfo) {
    this.alarmInfo = alarmInfo;
  }

  public TapiNotificationNotification changedAttributes(List<TapiNotificationNameAndValueChange> changedAttributes) {
    this.changedAttributes = changedAttributes;
    return this;
  }

  public TapiNotificationNotification addChangedAttributesItem(TapiNotificationNameAndValueChange changedAttributesItem) {
    if (this.changedAttributes == null) {
      this.changedAttributes = new ArrayList<TapiNotificationNameAndValueChange>();
    }
    this.changedAttributes.add(changedAttributesItem);
    return this;
  }

  /**
   * none
   * @return changedAttributes
   **/
  @JsonProperty("changed-attributes")
  @ApiModelProperty(value = "none")
  public List<TapiNotificationNameAndValueChange> getChangedAttributes() {
    return changedAttributes;
  }

  public void setChangedAttributes(List<TapiNotificationNameAndValueChange> changedAttributes) {
    this.changedAttributes = changedAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TapiNotificationNotification tapiNotificationNotification = (TapiNotificationNotification) o;
    return Objects.equals(this.name, tapiNotificationNotification.name) &&
        Objects.equals(this.uuid, tapiNotificationNotification.uuid) &&
        Objects.equals(this.targetObjectType, tapiNotificationNotification.targetObjectType) &&
        Objects.equals(this.additionalText, tapiNotificationNotification.additionalText) &&
        Objects.equals(this.eventTimeStamp, tapiNotificationNotification.eventTimeStamp) &&
        Objects.equals(this.additionalInfo, tapiNotificationNotification.additionalInfo) &&
        Objects.equals(this.sequenceNumber, tapiNotificationNotification.sequenceNumber) &&
        Objects.equals(this.tcaInfo, tapiNotificationNotification.tcaInfo) &&
        Objects.equals(this.targetObjectIdentifier, tapiNotificationNotification.targetObjectIdentifier) &&
        Objects.equals(this.notificationType, tapiNotificationNotification.notificationType) &&
        Objects.equals(this.targetObjectName, tapiNotificationNotification.targetObjectName) &&
        Objects.equals(this.layerProtocolName, tapiNotificationNotification.layerProtocolName) &&
        Objects.equals(this.sourceIndicator, tapiNotificationNotification.sourceIndicator) &&
        Objects.equals(this.alarmInfo, tapiNotificationNotification.alarmInfo) &&
        Objects.equals(this.changedAttributes, tapiNotificationNotification.changedAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, uuid, targetObjectType, additionalText, eventTimeStamp, additionalInfo, sequenceNumber, tcaInfo, targetObjectIdentifier, notificationType, targetObjectName, layerProtocolName, sourceIndicator, alarmInfo, changedAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TapiNotificationNotification {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
    sb.append("    targetObjectType: ").append(toIndentedString(targetObjectType)).append("\n");
    sb.append("    additionalText: ").append(toIndentedString(additionalText)).append("\n");
    sb.append("    eventTimeStamp: ").append(toIndentedString(eventTimeStamp)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    tcaInfo: ").append(toIndentedString(tcaInfo)).append("\n");
    sb.append("    targetObjectIdentifier: ").append(toIndentedString(targetObjectIdentifier)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    targetObjectName: ").append(toIndentedString(targetObjectName)).append("\n");
    sb.append("    layerProtocolName: ").append(toIndentedString(layerProtocolName)).append("\n");
    sb.append("    sourceIndicator: ").append(toIndentedString(sourceIndicator)).append("\n");
    sb.append("    alarmInfo: ").append(toIndentedString(alarmInfo)).append("\n");
    sb.append("    changedAttributes: ").append(toIndentedString(changedAttributes)).append("\n");
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

