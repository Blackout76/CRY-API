/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterOrdersResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("account_id")
    private Integer accountId = null;

    @JsonProperty("duration")
    private Integer duration = null;

    @JsonProperty("escrow")
    private Float escrow = null;

    @JsonProperty("is_buy_order")
    private Boolean isBuyOrder = null;

    @JsonProperty("is_corp")
    private Boolean isCorp = null;

    @JsonProperty("issued")
    private OffsetDateTime issued = null;

    @JsonProperty("location_id")
    private Long locationId = null;

    @JsonProperty("min_volume")
    private Integer minVolume = null;

    @JsonProperty("order_id")
    private Long orderId = null;

    @JsonProperty("price")
    private Float price = null;

    /**
     * Valid order range, numbers are ranges in jumps
     */
    public enum RangeEnum {
        STATION("station"),

        REGION("region"),

        SOLARSYSTEM("solarsystem"),

        _1("1"),

        _2("2"),

        _3("3"),

        _4("4"),

        _5("5"),

        _10("10"),

        _20("20"),

        _30("30"),

        _40("40");

        private String value;

        RangeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RangeEnum fromValue(String text) {
            for (RangeEnum b : RangeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("range")
    private RangeEnum range = null;

    @JsonProperty("region_id")
    private Integer regionId = null;

    /**
     * Current order state
     */
    public enum StateEnum {
        OPEN("open"),

        CLOSED("closed"),

        EXPIRED("expired"),

        CANCELLED("cancelled"),

        PENDING("pending"),

        CHARACTER_DELETED("character_deleted");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("state")
    private StateEnum state = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    @JsonProperty("volume_remain")
    private Integer volumeRemain = null;

    @JsonProperty("volume_total")
    private Integer volumeTotal = null;

    public CharacterOrdersResponse accountId(Integer accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Wallet division for the buyer or seller of this order. Always 1000 for
     * characters. Currently 1000 through 1006 for corporations
     * 
     * @return accountId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Wallet division for the buyer or seller of this order. Always 1000 for characters. Currently 1000 through 1006 for corporations")
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public CharacterOrdersResponse duration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Numer of days for which order is valid (starting from the issued date).
     * An order expires at time issued + duration
     * 
     * @return duration
     **/
    @ApiModelProperty(example = "null", required = true, value = "Numer of days for which order is valid (starting from the issued date). An order expires at time issued + duration")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public CharacterOrdersResponse escrow(Float escrow) {
        this.escrow = escrow;
        return this;
    }

    /**
     * For buy orders, the amount of ISK in escrow
     * 
     * @return escrow
     **/
    @ApiModelProperty(example = "null", required = true, value = "For buy orders, the amount of ISK in escrow")
    public Float getEscrow() {
        return escrow;
    }

    public void setEscrow(Float escrow) {
        this.escrow = escrow;
    }

    public CharacterOrdersResponse isBuyOrder(Boolean isBuyOrder) {
        this.isBuyOrder = isBuyOrder;
        return this;
    }

    /**
     * True for a bid (buy) order. False for an offer (sell) order
     * 
     * @return isBuyOrder
     **/
    @ApiModelProperty(example = "null", required = true, value = "True for a bid (buy) order. False for an offer (sell) order")
    public Boolean getIsBuyOrder() {
        return isBuyOrder;
    }

    public void setIsBuyOrder(Boolean isBuyOrder) {
        this.isBuyOrder = isBuyOrder;
    }

    public CharacterOrdersResponse isCorp(Boolean isCorp) {
        this.isCorp = isCorp;
        return this;
    }

    /**
     * is_corp boolean
     * 
     * @return isCorp
     **/
    @ApiModelProperty(example = "null", required = true, value = "is_corp boolean")
    public Boolean getIsCorp() {
        return isCorp;
    }

    public void setIsCorp(Boolean isCorp) {
        this.isCorp = isCorp;
    }

    public CharacterOrdersResponse issued(OffsetDateTime issued) {
        this.issued = issued;
        return this;
    }

    /**
     * Date and time when this order was issued
     * 
     * @return issued
     **/
    @ApiModelProperty(example = "null", required = true, value = "Date and time when this order was issued")
    public OffsetDateTime getIssued() {
        return issued;
    }

    public void setIssued(OffsetDateTime issued) {
        this.issued = issued;
    }

    public CharacterOrdersResponse locationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * ID of the location where order was placed
     * 
     * @return locationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of the location where order was placed")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CharacterOrdersResponse minVolume(Integer minVolume) {
        this.minVolume = minVolume;
        return this;
    }

    /**
     * For bids (buy orders), the minimum quantity that will be accepted in a
     * matching offer (sell order)
     * 
     * @return minVolume
     **/
    @ApiModelProperty(example = "null", required = true, value = "For bids (buy orders), the minimum quantity that will be accepted in a matching offer (sell order)")
    public Integer getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(Integer minVolume) {
        this.minVolume = minVolume;
    }

    public CharacterOrdersResponse orderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Unique order ID
     * 
     * @return orderId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique order ID")
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public CharacterOrdersResponse price(Float price) {
        this.price = price;
        return this;
    }

    /**
     * Cost per unit for this order
     * 
     * @return price
     **/
    @ApiModelProperty(example = "null", required = true, value = "Cost per unit for this order")
    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public CharacterOrdersResponse range(RangeEnum range) {
        this.range = range;
        return this;
    }

    /**
     * Valid order range, numbers are ranges in jumps
     * 
     * @return range
     **/
    @ApiModelProperty(example = "null", required = true, value = "Valid order range, numbers are ranges in jumps")
    public RangeEnum getRange() {
        return range;
    }

    public void setRange(RangeEnum range) {
        this.range = range;
    }

    public CharacterOrdersResponse regionId(Integer regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * ID of the region where order was placed
     * 
     * @return regionId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of the region where order was placed")
    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public CharacterOrdersResponse state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Current order state
     * 
     * @return state
     **/
    @ApiModelProperty(example = "null", required = true, value = "Current order state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public CharacterOrdersResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * The type ID of the item transacted in this order
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "The type ID of the item transacted in this order")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public CharacterOrdersResponse volumeRemain(Integer volumeRemain) {
        this.volumeRemain = volumeRemain;
        return this;
    }

    /**
     * Quantity of items still required or offered
     * 
     * @return volumeRemain
     **/
    @ApiModelProperty(example = "null", required = true, value = "Quantity of items still required or offered")
    public Integer getVolumeRemain() {
        return volumeRemain;
    }

    public void setVolumeRemain(Integer volumeRemain) {
        this.volumeRemain = volumeRemain;
    }

    public CharacterOrdersResponse volumeTotal(Integer volumeTotal) {
        this.volumeTotal = volumeTotal;
        return this;
    }

    /**
     * Quantity of items required or offered at time order was placed
     * 
     * @return volumeTotal
     **/
    @ApiModelProperty(example = "null", required = true, value = "Quantity of items required or offered at time order was placed")
    public Integer getVolumeTotal() {
        return volumeTotal;
    }

    public void setVolumeTotal(Integer volumeTotal) {
        this.volumeTotal = volumeTotal;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterOrdersResponse characterOrdersResponse = (CharacterOrdersResponse) o;
        return Objects.equals(this.accountId, characterOrdersResponse.accountId)
                && Objects.equals(this.duration, characterOrdersResponse.duration)
                && Objects.equals(this.escrow, characterOrdersResponse.escrow)
                && Objects.equals(this.isBuyOrder, characterOrdersResponse.isBuyOrder)
                && Objects.equals(this.isCorp, characterOrdersResponse.isCorp)
                && Objects.equals(this.issued, characterOrdersResponse.issued)
                && Objects.equals(this.locationId, characterOrdersResponse.locationId)
                && Objects.equals(this.minVolume, characterOrdersResponse.minVolume)
                && Objects.equals(this.orderId, characterOrdersResponse.orderId)
                && Objects.equals(this.price, characterOrdersResponse.price)
                && Objects.equals(this.range, characterOrdersResponse.range)
                && Objects.equals(this.regionId, characterOrdersResponse.regionId)
                && Objects.equals(this.state, characterOrdersResponse.state)
                && Objects.equals(this.typeId, characterOrdersResponse.typeId)
                && Objects.equals(this.volumeRemain, characterOrdersResponse.volumeRemain)
                && Objects.equals(this.volumeTotal, characterOrdersResponse.volumeTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, duration, escrow, isBuyOrder, isCorp, issued, locationId, minVolume, orderId,
                price, range, regionId, state, typeId, volumeRemain, volumeTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterOrdersResponse {\n");

        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    escrow: ").append(toIndentedString(escrow)).append("\n");
        sb.append("    isBuyOrder: ").append(toIndentedString(isBuyOrder)).append("\n");
        sb.append("    isCorp: ").append(toIndentedString(isCorp)).append("\n");
        sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    range: ").append(toIndentedString(range)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    volumeRemain: ").append(toIndentedString(volumeRemain)).append("\n");
        sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
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
