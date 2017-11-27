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
import com.touchvie.sdk.model.SourceData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.io.Serializable;

/**
 * Linked image URL and additional information
 */
@ApiModel(description = "Linked image URL and additional information")

public class ImageData implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("thumb")
  private String thumb = null;

  @SerializedName("full")
  private String full = null;

  @SerializedName("anchor_x")
  private BigDecimal anchorX = null;

  @SerializedName("anchor_y")
  private BigDecimal anchorY = null;

  @SerializedName("source")
  private SourceData source = null;

  public ImageData thumb(String thumb) {
    this.thumb = thumb;
    return this;
  }

   /**
   * Image thumbnail URL
   * @return thumb
  **/
  @ApiModelProperty(required = true, value = "Image thumbnail URL")
  public String getThumb() {
    return thumb;
  }

  public void setThumb(String thumb) {
    this.thumb = thumb;
  }

  public ImageData full(String full) {
    this.full = full;
    return this;
  }

   /**
   * Full size image URL
   * @return full
  **/
  @ApiModelProperty(required = true, value = "Full size image URL")
  public String getFull() {
    return full;
  }

  public void setFull(String full) {
    this.full = full;
  }

  public ImageData anchorX(BigDecimal anchorX) {
    this.anchorX = anchorX;
    return this;
  }

   /**
   * Image anchor X axis (percent)
   * minimum: 0
   * maximum: 100
   * @return anchorX
  **/
  @ApiModelProperty(required = true, value = "Image anchor X axis (percent)")
  public BigDecimal getAnchorX() {
    return anchorX;
  }

  public void setAnchorX(BigDecimal anchorX) {
    this.anchorX = anchorX;
  }

  public ImageData anchorY(BigDecimal anchorY) {
    this.anchorY = anchorY;
    return this;
  }

   /**
   * Image anchor Y axis (percent)
   * minimum: 0
   * maximum: 100
   * @return anchorY
  **/
  @ApiModelProperty(required = true, value = "Image anchor Y axis (percent)")
  public BigDecimal getAnchorY() {
    return anchorY;
  }

  public void setAnchorY(BigDecimal anchorY) {
    this.anchorY = anchorY;
  }

  public ImageData source(SourceData source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(required = true, value = "")
  public SourceData getSource() {
    return source;
  }

  public void setSource(SourceData source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageData imageData = (ImageData) o;
    return Objects.equals(this.thumb, imageData.thumb) &&
        Objects.equals(this.full, imageData.full) &&
        Objects.equals(this.anchorX, imageData.anchorX) &&
        Objects.equals(this.anchorY, imageData.anchorY) &&
        Objects.equals(this.source, imageData.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thumb, full, anchorX, anchorY, source);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageData {\n");
    
    sb.append("    thumb: ").append(toIndentedString(thumb)).append("\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    anchorX: ").append(toIndentedString(anchorX)).append("\n");
    sb.append("    anchorY: ").append(toIndentedString(anchorY)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
