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
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.SystemCostIndice;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class IndustrySystemsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("cost_indices")
    private List<SystemCostIndice> costIndices = new ArrayList<SystemCostIndice>();

    @JsonProperty("solar_system_id")
    private Integer solarSystemId = null;

    public IndustrySystemsResponse costIndices(List<SystemCostIndice> costIndices) {
        this.costIndices = costIndices;
        return this;
    }

    public IndustrySystemsResponse addCostIndicesItem(SystemCostIndice costIndicesItem) {
        this.costIndices.add(costIndicesItem);
        return this;
    }

    /**
     * cost_indices array
     * 
     * @return costIndices
     **/
    @ApiModelProperty(example = "null", required = true, value = "cost_indices array")
    public List<SystemCostIndice> getCostIndices() {
        return costIndices;
    }

    public void setCostIndices(List<SystemCostIndice> costIndices) {
        this.costIndices = costIndices;
    }

    public IndustrySystemsResponse solarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * solar_system_id integer
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "solar_system_id integer")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndustrySystemsResponse industrySystemsResponse = (IndustrySystemsResponse) o;
        return Objects.equals(this.costIndices, industrySystemsResponse.costIndices)
                && Objects.equals(this.solarSystemId, industrySystemsResponse.solarSystemId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(costIndices, solarSystemId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndustrySystemsResponse {\n");

        sb.append("    costIndices: ").append(toIndentedString(costIndices)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
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
