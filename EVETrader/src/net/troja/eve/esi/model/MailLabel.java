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
import java.io.Serializable;

/**
 * label object
 */
@ApiModel(description = "label object")
public class MailLabel implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * color string
     */
    public enum ColorEnum {
        FFFFFF("#ffffff"),

        FFFF01("#ffff01"),

        FF6600("#ff6600"),

        FE0000("#fe0000"),

        _9A0000("#9a0000"),

        _660066("#660066"),

        _0000FE("#0000fe"),

        _0099FF("#0099ff"),

        _01FFFF("#01ffff"),

        _00FF33("#00ff33"),

        _349800("#349800"),

        _006634("#006634"),

        _666666("#666666"),

        _999999("#999999"),

        E6E6E6("#e6e6e6"),

        FFFFCD("#ffffcd"),

        _99FFFF("#99ffff"),

        CCFF9A("#ccff9a");

        private String value;

        ColorEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ColorEnum fromValue(String text) {
            for (ColorEnum b : ColorEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("color")
    private ColorEnum color = ColorEnum.FFFFFF;

    @JsonProperty("label_id")
    private Integer labelId = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("unread_count")
    private Integer unreadCount = null;

    public MailLabel color(ColorEnum color) {
        this.color = color;
        return this;
    }

    /**
     * color string
     * 
     * @return color
     **/
    @ApiModelProperty(example = "null", value = "color string")
    public ColorEnum getColor() {
        return color;
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public MailLabel labelId(Integer labelId) {
        this.labelId = labelId;
        return this;
    }

    /**
     * label_id integer minimum: 0
     * 
     * @return labelId
     **/
    @ApiModelProperty(example = "null", value = "label_id integer")
    public Integer getLabelId() {
        return labelId;
    }

    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    public MailLabel name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(example = "null", value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MailLabel unreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }

    /**
     * unread_count integer minimum: 0
     * 
     * @return unreadCount
     **/
    @ApiModelProperty(example = "null", value = "unread_count integer")
    public Integer getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MailLabel mailLabel = (MailLabel) o;
        return Objects.equals(this.color, mailLabel.color) && Objects.equals(this.labelId, mailLabel.labelId)
                && Objects.equals(this.name, mailLabel.name) && Objects.equals(this.unreadCount, mailLabel.unreadCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, labelId, name, unreadCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MailLabel {\n");

        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
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
