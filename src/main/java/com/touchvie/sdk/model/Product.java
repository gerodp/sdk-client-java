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
import java.io.Serializable;

/**
 * Commercial product data
 */
@ApiModel(description = "Commercial product data")

public class Product implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("product_id")
  private String productId = null;

  /**
   * Merchant category
   */
  @JsonAdapter(CategoryEnum.Adapter.class)
  public enum CategoryEnum {
    FASHION("fashion"),
    
    ELECTRO("electro"),
    
    MERCH("merch"),
    
    TRAVEL("travel");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("category")
  private CategoryEnum category = null;

  @SerializedName("source")
  private SourceData source = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("is_up_to_date")
  private Boolean isUpToDate = null;

  @SerializedName("is_exact")
  private Boolean isExact = null;

  @SerializedName("country")
  private String country = null;

  @SerializedName("region")
  private String region = null;

  @SerializedName("city")
  private String city = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("postal_code")
  private String postalCode = null;

  @SerializedName("rating")
  private Double rating = null;

  public Product productId(String productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Product identifier
   * @return productId
  **/
  @ApiModelProperty(required = true, value = "Product identifier")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public Product category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Merchant category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "Merchant category")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public Product source(SourceData source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public SourceData getSource() {
    return source;
  }

  public void setSource(SourceData source) {
    this.source = source;
  }

  public Product title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Product title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "Product title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Product image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Product image URL
   * @return image
  **/
  @ApiModelProperty(required = true, value = "Product image URL")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Product url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Merchant store URL
   * @return url
  **/
  @ApiModelProperty(required = true, value = "Merchant store URL")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Product price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Product price
   * @return price
  **/
  @ApiModelProperty(value = "Product price")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Product currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Product price currency
   * @return currency
  **/
  @ApiModelProperty(value = "Product price currency")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Product isUpToDate(Boolean isUpToDate) {
    this.isUpToDate = isUpToDate;
    return this;
  }

   /**
   * Indicates if product in up to date on Dive database
   * @return isUpToDate
  **/
  @ApiModelProperty(value = "Indicates if product in up to date on Dive database")
  public Boolean getIsUpToDate() {
    return isUpToDate;
  }

  public void setIsUpToDate(Boolean isUpToDate) {
    this.isUpToDate = isUpToDate;
  }

  public Product isExact(Boolean isExact) {
    this.isExact = isExact;
    return this;
  }

   /**
   * Indicates if product is an exact match
   * @return isExact
  **/
  @ApiModelProperty(value = "Indicates if product is an exact match")
  public Boolean getIsExact() {
    return isExact;
  }

  public void setIsExact(Boolean isExact) {
    this.isExact = isExact;
  }

  public Product country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Country information. Only for travel products
   * @return country
  **/
  @ApiModelProperty(value = "Country information. Only for travel products")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Product region(String region) {
    this.region = region;
    return this;
  }

   /**
   * Region information. Only for travel products
   * @return region
  **/
  @ApiModelProperty(value = "Region information. Only for travel products")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public Product city(String city) {
    this.city = city;
    return this;
  }

   /**
   * City information. Only for travel products
   * @return city
  **/
  @ApiModelProperty(value = "City information. Only for travel products")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Product address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address information. Only for travel products
   * @return address
  **/
  @ApiModelProperty(value = "Address information. Only for travel products")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Product postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal code information. Only for travel products
   * @return postalCode
  **/
  @ApiModelProperty(value = "Postal code information. Only for travel products")
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public Product rating(Double rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Rating information. Only for travel products
   * @return rating
  **/
  @ApiModelProperty(value = "Rating information. Only for travel products")
  public Double getRating() {
    return rating;
  }

  public void setRating(Double rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.productId, product.productId) &&
        Objects.equals(this.category, product.category) &&
        Objects.equals(this.source, product.source) &&
        Objects.equals(this.title, product.title) &&
        Objects.equals(this.image, product.image) &&
        Objects.equals(this.url, product.url) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.currency, product.currency) &&
        Objects.equals(this.isUpToDate, product.isUpToDate) &&
        Objects.equals(this.isExact, product.isExact) &&
        Objects.equals(this.country, product.country) &&
        Objects.equals(this.region, product.region) &&
        Objects.equals(this.city, product.city) &&
        Objects.equals(this.address, product.address) &&
        Objects.equals(this.postalCode, product.postalCode) &&
        Objects.equals(this.rating, product.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, category, source, title, image, url, price, currency, isUpToDate, isExact, country, region, city, address, postalCode, rating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isUpToDate: ").append(toIndentedString(isUpToDate)).append("\n");
    sb.append("    isExact: ").append(toIndentedString(isExact)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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
