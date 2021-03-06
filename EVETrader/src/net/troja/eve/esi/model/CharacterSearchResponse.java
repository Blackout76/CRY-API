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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterSearchResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("agent")
    private List<Integer> agent = new ArrayList<Integer>();

    @JsonProperty("alliance")
    private List<Integer> alliance = new ArrayList<Integer>();

    @JsonProperty("character")
    private List<Integer> character = new ArrayList<Integer>();

    @JsonProperty("constellation")
    private List<Integer> constellation = new ArrayList<Integer>();

    @JsonProperty("corporation")
    private List<Integer> corporation = new ArrayList<Integer>();

    @JsonProperty("faction")
    private List<Integer> faction = new ArrayList<Integer>();

    @JsonProperty("inventorytype")
    private List<Integer> inventorytype = new ArrayList<Integer>();

    @JsonProperty("region")
    private List<Integer> region = new ArrayList<Integer>();

    @JsonProperty("solarsystem")
    private List<Integer> solarsystem = new ArrayList<Integer>();

    @JsonProperty("station")
    private List<Integer> station = new ArrayList<Integer>();

    @JsonProperty("structure")
    private List<Long> structure = new ArrayList<Long>();

    @JsonProperty("wormhole")
    private List<Integer> wormhole = new ArrayList<Integer>();

    public CharacterSearchResponse agent(List<Integer> agent) {
        this.agent = agent;
        return this;
    }

    public CharacterSearchResponse addAgentItem(Integer agentItem) {
        this.agent.add(agentItem);
        return this;
    }

    /**
     * agent array
     * 
     * @return agent
     **/
    @ApiModelProperty(example = "null", value = "agent array")
    public List<Integer> getAgent() {
        return agent;
    }

    public void setAgent(List<Integer> agent) {
        this.agent = agent;
    }

    public CharacterSearchResponse alliance(List<Integer> alliance) {
        this.alliance = alliance;
        return this;
    }

    public CharacterSearchResponse addAllianceItem(Integer allianceItem) {
        this.alliance.add(allianceItem);
        return this;
    }

    /**
     * alliance array
     * 
     * @return alliance
     **/
    @ApiModelProperty(example = "null", value = "alliance array")
    public List<Integer> getAlliance() {
        return alliance;
    }

    public void setAlliance(List<Integer> alliance) {
        this.alliance = alliance;
    }

    public CharacterSearchResponse character(List<Integer> character) {
        this.character = character;
        return this;
    }

    public CharacterSearchResponse addCharacterItem(Integer characterItem) {
        this.character.add(characterItem);
        return this;
    }

    /**
     * character array
     * 
     * @return character
     **/
    @ApiModelProperty(example = "null", value = "character array")
    public List<Integer> getCharacter() {
        return character;
    }

    public void setCharacter(List<Integer> character) {
        this.character = character;
    }

    public CharacterSearchResponse constellation(List<Integer> constellation) {
        this.constellation = constellation;
        return this;
    }

    public CharacterSearchResponse addConstellationItem(Integer constellationItem) {
        this.constellation.add(constellationItem);
        return this;
    }

    /**
     * constellation array
     * 
     * @return constellation
     **/
    @ApiModelProperty(example = "null", value = "constellation array")
    public List<Integer> getConstellation() {
        return constellation;
    }

    public void setConstellation(List<Integer> constellation) {
        this.constellation = constellation;
    }

    public CharacterSearchResponse corporation(List<Integer> corporation) {
        this.corporation = corporation;
        return this;
    }

    public CharacterSearchResponse addCorporationItem(Integer corporationItem) {
        this.corporation.add(corporationItem);
        return this;
    }

    /**
     * corporation array
     * 
     * @return corporation
     **/
    @ApiModelProperty(example = "null", value = "corporation array")
    public List<Integer> getCorporation() {
        return corporation;
    }

    public void setCorporation(List<Integer> corporation) {
        this.corporation = corporation;
    }

    public CharacterSearchResponse faction(List<Integer> faction) {
        this.faction = faction;
        return this;
    }

    public CharacterSearchResponse addFactionItem(Integer factionItem) {
        this.faction.add(factionItem);
        return this;
    }

    /**
     * faction array
     * 
     * @return faction
     **/
    @ApiModelProperty(example = "null", value = "faction array")
    public List<Integer> getFaction() {
        return faction;
    }

    public void setFaction(List<Integer> faction) {
        this.faction = faction;
    }

    public CharacterSearchResponse inventorytype(List<Integer> inventorytype) {
        this.inventorytype = inventorytype;
        return this;
    }

    public CharacterSearchResponse addInventorytypeItem(Integer inventorytypeItem) {
        this.inventorytype.add(inventorytypeItem);
        return this;
    }

    /**
     * inventorytype array
     * 
     * @return inventorytype
     **/
    @ApiModelProperty(example = "null", value = "inventorytype array")
    public List<Integer> getInventorytype() {
        return inventorytype;
    }

    public void setInventorytype(List<Integer> inventorytype) {
        this.inventorytype = inventorytype;
    }

    public CharacterSearchResponse region(List<Integer> region) {
        this.region = region;
        return this;
    }

    public CharacterSearchResponse addRegionItem(Integer regionItem) {
        this.region.add(regionItem);
        return this;
    }

    /**
     * region array
     * 
     * @return region
     **/
    @ApiModelProperty(example = "null", value = "region array")
    public List<Integer> getRegion() {
        return region;
    }

    public void setRegion(List<Integer> region) {
        this.region = region;
    }

    public CharacterSearchResponse solarsystem(List<Integer> solarsystem) {
        this.solarsystem = solarsystem;
        return this;
    }

    public CharacterSearchResponse addSolarsystemItem(Integer solarsystemItem) {
        this.solarsystem.add(solarsystemItem);
        return this;
    }

    /**
     * solarsystem array
     * 
     * @return solarsystem
     **/
    @ApiModelProperty(example = "null", value = "solarsystem array")
    public List<Integer> getSolarsystem() {
        return solarsystem;
    }

    public void setSolarsystem(List<Integer> solarsystem) {
        this.solarsystem = solarsystem;
    }

    public CharacterSearchResponse station(List<Integer> station) {
        this.station = station;
        return this;
    }

    public CharacterSearchResponse addStationItem(Integer stationItem) {
        this.station.add(stationItem);
        return this;
    }

    /**
     * station array
     * 
     * @return station
     **/
    @ApiModelProperty(example = "null", value = "station array")
    public List<Integer> getStation() {
        return station;
    }

    public void setStation(List<Integer> station) {
        this.station = station;
    }

    public CharacterSearchResponse structure(List<Long> structure) {
        this.structure = structure;
        return this;
    }

    public CharacterSearchResponse addStructureItem(Long structureItem) {
        this.structure.add(structureItem);
        return this;
    }

    /**
     * structure array
     * 
     * @return structure
     **/
    @ApiModelProperty(example = "null", value = "structure array")
    public List<Long> getStructure() {
        return structure;
    }

    public void setStructure(List<Long> structure) {
        this.structure = structure;
    }

    public CharacterSearchResponse wormhole(List<Integer> wormhole) {
        this.wormhole = wormhole;
        return this;
    }

    public CharacterSearchResponse addWormholeItem(Integer wormholeItem) {
        this.wormhole.add(wormholeItem);
        return this;
    }

    /**
     * wormhole array
     * 
     * @return wormhole
     **/
    @ApiModelProperty(example = "null", value = "wormhole array")
    public List<Integer> getWormhole() {
        return wormhole;
    }

    public void setWormhole(List<Integer> wormhole) {
        this.wormhole = wormhole;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterSearchResponse characterSearchResponse = (CharacterSearchResponse) o;
        return Objects.equals(this.agent, characterSearchResponse.agent)
                && Objects.equals(this.alliance, characterSearchResponse.alliance)
                && Objects.equals(this.character, characterSearchResponse.character)
                && Objects.equals(this.constellation, characterSearchResponse.constellation)
                && Objects.equals(this.corporation, characterSearchResponse.corporation)
                && Objects.equals(this.faction, characterSearchResponse.faction)
                && Objects.equals(this.inventorytype, characterSearchResponse.inventorytype)
                && Objects.equals(this.region, characterSearchResponse.region)
                && Objects.equals(this.solarsystem, characterSearchResponse.solarsystem)
                && Objects.equals(this.station, characterSearchResponse.station)
                && Objects.equals(this.structure, characterSearchResponse.structure)
                && Objects.equals(this.wormhole, characterSearchResponse.wormhole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agent, alliance, character, constellation, corporation, faction, inventorytype, region,
                solarsystem, station, structure, wormhole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterSearchResponse {\n");

        sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
        sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
        sb.append("    character: ").append(toIndentedString(character)).append("\n");
        sb.append("    constellation: ").append(toIndentedString(constellation)).append("\n");
        sb.append("    corporation: ").append(toIndentedString(corporation)).append("\n");
        sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
        sb.append("    inventorytype: ").append(toIndentedString(inventorytype)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    solarsystem: ").append(toIndentedString(solarsystem)).append("\n");
        sb.append("    station: ").append(toIndentedString(station)).append("\n");
        sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
        sb.append("    wormhole: ").append(toIndentedString(wormhole)).append("\n");
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
