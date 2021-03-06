/*
 * Dive EA REST API
 * Dive Experience Amplifier REST API provides a set of services which leverage obtaining catalog and TV grid info, contextual items (cards) information and saving and a static (scene by scene) version of the card carousel for linear TV and video on demand
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.touchvie.sdk.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * ChannelStatus
 */

public class ChannelStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("channel_id")
  private String channelId = null;

  @SerializedName("ready")
  private Boolean ready = null;

  public ChannelStatus channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * Provided channel ID
   * @return channelId
  **/
  @ApiModelProperty(value = "Provided channel ID")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public ChannelStatus ready(Boolean ready) {
    this.ready = ready;
    return this;
  }

   /**
   * True if channel is broadcasting synchronizable content, False otherwise
   * @return ready
  **/
  @ApiModelProperty(value = "True if channel is broadcasting synchronizable content, False otherwise")
  public Boolean getReady() {
    return ready;
  }

  public void setReady(Boolean ready) {
    this.ready = ready;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelStatus channelStatus = (ChannelStatus) o;
    return Objects.equals(this.channelId, channelStatus.channelId) &&
        Objects.equals(this.ready, channelStatus.ready);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, ready);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelStatus {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    ready: ").append(toIndentedString(ready)).append("\n");
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

