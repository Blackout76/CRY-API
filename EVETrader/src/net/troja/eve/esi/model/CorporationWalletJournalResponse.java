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
import net.troja.eve.esi.model.CorporationWalletJournalExtraInfoResponse;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CorporationWalletJournalResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("amount")
    private Float amount = null;

    @JsonProperty("balance")
    private Float balance = null;

    @JsonProperty("date")
    private OffsetDateTime date = null;

    @JsonProperty("extra_info")
    private CorporationWalletJournalExtraInfoResponse extraInfo = null;

    @JsonProperty("first_party_id")
    private Integer firstPartyId = null;

    /**
     * first_party_type string
     */
    public enum FirstPartyTypeEnum {
        CHARACTER("character"),

        CORPORATION("corporation"),

        ALLIANCE("alliance"),

        FACTION("faction");

        private String value;

        FirstPartyTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FirstPartyTypeEnum fromValue(String text) {
            for (FirstPartyTypeEnum b : FirstPartyTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("first_party_type")
    private FirstPartyTypeEnum firstPartyType = null;

    @JsonProperty("reason")
    private String reason = null;

    @JsonProperty("ref_id")
    private Long refId = null;

    /**
     * Transaction type, different type of transaction will populate different
     * fields in `extra_info`
     */
    public enum RefTypeEnum {
        PLAYER_TRADING("player_trading"),

        MARKET_TRANSACTION("market_transaction"),

        GM_CASH_TRANSFER("gm_cash_transfer"),

        MISSION_REWARD("mission_reward"),

        CLONE_ACTIVATION("clone_activation"),

        INHERITANCE("inheritance"),

        PLAYER_DONATION("player_donation"),

        CORPORATION_PAYMENT("corporation_payment"),

        DOCKING_FEE("docking_fee"),

        OFFICE_RENTAL_FEE("office_rental_fee"),

        FACTORY_SLOT_RENTAL_FEE("factory_slot_rental_fee"),

        REPAIR_BILL("repair_bill"),

        BOUNTY("bounty"),

        BOUNTY_PRIZE("bounty_prize"),

        INSURANCE("insurance"),

        MISSION_EXPIRATION("mission_expiration"),

        MISSION_COMPLETION("mission_completion"),

        SHARES("shares"),

        COURIER_MISSION_ESCROW("courier_mission_escrow"),

        MISSION_COST("mission_cost"),

        AGENT_MISCELLANEOUS("agent_miscellaneous"),

        LP_STORE("lp_store"),

        AGENT_LOCATION_SERVICES("agent_location_services"),

        AGENT_DONATION("agent_donation"),

        AGENT_SECURITY_SERVICES("agent_security_services"),

        AGENT_MISSION_COLLATERAL_PAID("agent_mission_collateral_paid"),

        AGENT_MISSION_COLLATERAL_REFUNDED("agent_mission_collateral_refunded"),

        AGENTS_PREWARD("agents_preward"),

        AGENT_MISSION_REWARD("agent_mission_reward"),

        AGENT_MISSION_TIME_BONUS_REWARD("agent_mission_time_bonus_reward"),

        CSPA("cspa"),

        CSPAOFFLINEREFUND("cspaofflinerefund"),

        CORPORATION_ACCOUNT_WITHDRAWAL("corporation_account_withdrawal"),

        CORPORATION_DIVIDEND_PAYMENT("corporation_dividend_payment"),

        CORPORATION_REGISTRATION_FEE("corporation_registration_fee"),

        CORPORATION_LOGO_CHANGE_COST("corporation_logo_change_cost"),

        RELEASE_OF_IMPOUNDED_PROPERTY("release_of_impounded_property"),

        MARKET_ESCROW("market_escrow"),

        AGENT_SERVICES_RENDERED("agent_services_rendered"),

        MARKET_FINE_PAID("market_fine_paid"),

        CORPORATION_LIQUIDATION("corporation_liquidation"),

        BROKERS_FEE("brokers_fee"),

        CORPORATION_BULK_PAYMENT("corporation_bulk_payment"),

        ALLIANCE_REGISTRATION_FEE("alliance_registration_fee"),

        WAR_FEE("war_fee"),

        ALLIANCE_MAINTAINANCE_FEE("alliance_maintainance_fee"),

        CONTRABAND_FINE("contraband_fine"),

        CLONE_TRANSFER("clone_transfer"),

        ACCELERATION_GATE_FEE("acceleration_gate_fee"),

        TRANSACTION_TAX("transaction_tax"),

        JUMP_CLONE_INSTALLATION_FEE("jump_clone_installation_fee"),

        MANUFACTURING("manufacturing"),

        RESEARCHING_TECHNOLOGY("researching_technology"),

        RESEARCHING_TIME_PRODUCTIVITY("researching_time_productivity"),

        RESEARCHING_MATERIAL_PRODUCTIVITY("researching_material_productivity"),

        COPYING("copying"),

        REVERSE_ENGINEERING("reverse_engineering"),

        CONTRACT_AUCTION_BID("contract_auction_bid"),

        CONTRACT_AUCTION_BID_REFUND("contract_auction_bid_refund"),

        CONTRACT_COLLATERAL("contract_collateral"),

        CONTRACT_REWARD_REFUND("contract_reward_refund"),

        CONTRACT_AUCTION_SOLD("contract_auction_sold"),

        CONTRACT_REWARD("contract_reward"),

        CONTRACT_COLLATERAL_REFUND("contract_collateral_refund"),

        CONTRACT_COLLATERAL_PAYOUT("contract_collateral_payout"),

        CONTRACT_PRICE("contract_price"),

        CONTRACT_BROKERS_FEE("contract_brokers_fee"),

        CONTRACT_SALES_TAX("contract_sales_tax"),

        CONTRACT_DEPOSIT("contract_deposit"),

        CONTRACT_DEPOSIT_SALES_TAX("contract_deposit_sales_tax"),

        CONTRACT_AUCTION_BID_CORP("contract_auction_bid_corp"),

        CONTRACT_COLLATERAL_DEPOSITED_CORP("contract_collateral_deposited_corp"),

        CONTRACT_PRICE_PAYMENT_CORP("contract_price_payment_corp"),

        CONTRACT_BROKERS_FEE_CORP("contract_brokers_fee_corp"),

        CONTRACT_DEPOSIT_CORP("contract_deposit_corp"),

        CONTRACT_DEPOSIT_REFUND("contract_deposit_refund"),

        CONTRACT_REWARD_DEPOSITED("contract_reward_deposited"),

        CONTRACT_REWARD_DEPOSITED_CORP("contract_reward_deposited_corp"),

        BOUNTY_PRIZES("bounty_prizes"),

        ADVERTISEMENT_LISTING_FEE("advertisement_listing_fee"),

        MEDAL_CREATION("medal_creation"),

        MEDAL_ISSUED("medal_issued"),

        DNA_MODIFICATION_FEE("dna_modification_fee"),

        SOVEREIGNITY_BILL("sovereignity_bill"),

        BOUNTY_PRIZE_CORPORATION_TAX("bounty_prize_corporation_tax"),

        AGENT_MISSION_REWARD_CORPORATION_TAX("agent_mission_reward_corporation_tax"),

        AGENT_MISSION_TIME_BONUS_REWARD_CORPORATION_TAX("agent_mission_time_bonus_reward_corporation_tax"),

        UPKEEP_ADJUSTMENT_FEE("upkeep_adjustment_fee"),

        PLANETARY_IMPORT_TAX("planetary_import_tax"),

        PLANETARY_EXPORT_TAX("planetary_export_tax"),

        PLANETARY_CONSTRUCTION("planetary_construction"),

        CORPORATE_REWARD_PAYOUT("corporate_reward_payout"),

        BOUNTY_SURCHARGE("bounty_surcharge"),

        CONTRACT_REVERSAL("contract_reversal"),

        CORPORATE_REWARD_TAX("corporate_reward_tax"),

        STORE_PURCHASE("store_purchase"),

        STORE_PURCHASE_REFUND("store_purchase_refund"),

        DATACORE_FEE("datacore_fee"),

        WAR_FEE_SURRENDER("war_fee_surrender"),

        WAR_ALLY_CONTRACT("war_ally_contract"),

        BOUNTY_REIMBURSEMENT("bounty_reimbursement"),

        KILL_RIGHT_FEE("kill_right_fee"),

        SECURITY_PROCESSING_FEE("security_processing_fee"),

        INDUSTRY_JOB_TAX("industry_job_tax"),

        INFRASTRUCTURE_HUB_MAINTENANCE("infrastructure_hub_maintenance"),

        ASSET_SAFETY_RECOVERY_TAX("asset_safety_recovery_tax"),

        OPPORTUNITY_REWARD("opportunity_reward"),

        PROJECT_DISCOVERY_REWARD("project_discovery_reward"),

        PROJECT_DISCOVERY_TAX("project_discovery_tax"),

        REPROCESSING_TAX("reprocessing_tax"),

        JUMP_CLONE_ACTIVATION_FEE("jump_clone_activation_fee"),

        OPERATION_BONUS("operation_bonus");

        private String value;

        RefTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RefTypeEnum fromValue(String text) {
            for (RefTypeEnum b : RefTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("ref_type")
    private RefTypeEnum refType = null;

    @JsonProperty("second_party_id")
    private Integer secondPartyId = null;

    /**
     * second_party_type string
     */
    public enum SecondPartyTypeEnum {
        CHARACTER("character"),

        CORPORATION("corporation"),

        ALLIANCE("alliance"),

        FACTION("faction");

        private String value;

        SecondPartyTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SecondPartyTypeEnum fromValue(String text) {
            for (SecondPartyTypeEnum b : SecondPartyTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("second_party_type")
    private SecondPartyTypeEnum secondPartyType = null;

    @JsonProperty("tax")
    private Float tax = null;

    @JsonProperty("tax_reciever_id")
    private Integer taxRecieverId = null;

    public CorporationWalletJournalResponse amount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Transaction amount. Positive when value transferred to the first party.
     * Negative otherwise
     * 
     * @return amount
     **/
    @ApiModelProperty(example = "null", value = "Transaction amount. Positive when value transferred to the first party. Negative otherwise")
    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public CorporationWalletJournalResponse balance(Float balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Wallet balance after transaction occurred
     * 
     * @return balance
     **/
    @ApiModelProperty(example = "null", value = "Wallet balance after transaction occurred")
    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public CorporationWalletJournalResponse date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Date and time of transaction
     * 
     * @return date
     **/
    @ApiModelProperty(example = "null", required = true, value = "Date and time of transaction")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public CorporationWalletJournalResponse extraInfo(CorporationWalletJournalExtraInfoResponse extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    /**
     * Get extraInfo
     * 
     * @return extraInfo
     **/
    @ApiModelProperty(example = "null", value = "")
    public CorporationWalletJournalExtraInfoResponse getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(CorporationWalletJournalExtraInfoResponse extraInfo) {
        this.extraInfo = extraInfo;
    }

    public CorporationWalletJournalResponse firstPartyId(Integer firstPartyId) {
        this.firstPartyId = firstPartyId;
        return this;
    }

    /**
     * first_party_id integer
     * 
     * @return firstPartyId
     **/
    @ApiModelProperty(example = "null", value = "first_party_id integer")
    public Integer getFirstPartyId() {
        return firstPartyId;
    }

    public void setFirstPartyId(Integer firstPartyId) {
        this.firstPartyId = firstPartyId;
    }

    public CorporationWalletJournalResponse firstPartyType(FirstPartyTypeEnum firstPartyType) {
        this.firstPartyType = firstPartyType;
        return this;
    }

    /**
     * first_party_type string
     * 
     * @return firstPartyType
     **/
    @ApiModelProperty(example = "null", value = "first_party_type string")
    public FirstPartyTypeEnum getFirstPartyType() {
        return firstPartyType;
    }

    public void setFirstPartyType(FirstPartyTypeEnum firstPartyType) {
        this.firstPartyType = firstPartyType;
    }

    public CorporationWalletJournalResponse reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * reason string
     * 
     * @return reason
     **/
    @ApiModelProperty(example = "null", value = "reason string")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public CorporationWalletJournalResponse refId(Long refId) {
        this.refId = refId;
        return this;
    }

    /**
     * Unique journal reference ID
     * 
     * @return refId
     **/
    @ApiModelProperty(example = "null", required = true, value = "Unique journal reference ID")
    public Long getRefId() {
        return refId;
    }

    public void setRefId(Long refId) {
        this.refId = refId;
    }

    public CorporationWalletJournalResponse refType(RefTypeEnum refType) {
        this.refType = refType;
        return this;
    }

    /**
     * Transaction type, different type of transaction will populate different
     * fields in `extra_info`
     * 
     * @return refType
     **/
    @ApiModelProperty(example = "null", required = true, value = "Transaction type, different type of transaction will populate different fields in `extra_info`")
    public RefTypeEnum getRefType() {
        return refType;
    }

    public void setRefType(RefTypeEnum refType) {
        this.refType = refType;
    }

    public CorporationWalletJournalResponse secondPartyId(Integer secondPartyId) {
        this.secondPartyId = secondPartyId;
        return this;
    }

    /**
     * second_party_id integer
     * 
     * @return secondPartyId
     **/
    @ApiModelProperty(example = "null", value = "second_party_id integer")
    public Integer getSecondPartyId() {
        return secondPartyId;
    }

    public void setSecondPartyId(Integer secondPartyId) {
        this.secondPartyId = secondPartyId;
    }

    public CorporationWalletJournalResponse secondPartyType(SecondPartyTypeEnum secondPartyType) {
        this.secondPartyType = secondPartyType;
        return this;
    }

    /**
     * second_party_type string
     * 
     * @return secondPartyType
     **/
    @ApiModelProperty(example = "null", value = "second_party_type string")
    public SecondPartyTypeEnum getSecondPartyType() {
        return secondPartyType;
    }

    public void setSecondPartyType(SecondPartyTypeEnum secondPartyType) {
        this.secondPartyType = secondPartyType;
    }

    public CorporationWalletJournalResponse tax(Float tax) {
        this.tax = tax;
        return this;
    }

    /**
     * Tax amount received for tax related transactions
     * 
     * @return tax
     **/
    @ApiModelProperty(example = "null", value = "Tax amount received for tax related transactions")
    public Float getTax() {
        return tax;
    }

    public void setTax(Float tax) {
        this.tax = tax;
    }

    public CorporationWalletJournalResponse taxRecieverId(Integer taxRecieverId) {
        this.taxRecieverId = taxRecieverId;
        return this;
    }

    /**
     * the corporation ID receiving any tax paid
     * 
     * @return taxRecieverId
     **/
    @ApiModelProperty(example = "null", value = "the corporation ID receiving any tax paid")
    public Integer getTaxRecieverId() {
        return taxRecieverId;
    }

    public void setTaxRecieverId(Integer taxRecieverId) {
        this.taxRecieverId = taxRecieverId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationWalletJournalResponse corporationWalletJournalResponse = (CorporationWalletJournalResponse) o;
        return Objects.equals(this.amount, corporationWalletJournalResponse.amount)
                && Objects.equals(this.balance, corporationWalletJournalResponse.balance)
                && Objects.equals(this.date, corporationWalletJournalResponse.date)
                && Objects.equals(this.extraInfo, corporationWalletJournalResponse.extraInfo)
                && Objects.equals(this.firstPartyId, corporationWalletJournalResponse.firstPartyId)
                && Objects.equals(this.firstPartyType, corporationWalletJournalResponse.firstPartyType)
                && Objects.equals(this.reason, corporationWalletJournalResponse.reason)
                && Objects.equals(this.refId, corporationWalletJournalResponse.refId)
                && Objects.equals(this.refType, corporationWalletJournalResponse.refType)
                && Objects.equals(this.secondPartyId, corporationWalletJournalResponse.secondPartyId)
                && Objects.equals(this.secondPartyType, corporationWalletJournalResponse.secondPartyType)
                && Objects.equals(this.tax, corporationWalletJournalResponse.tax)
                && Objects.equals(this.taxRecieverId, corporationWalletJournalResponse.taxRecieverId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, balance, date, extraInfo, firstPartyId, firstPartyType, reason, refId, refType,
                secondPartyId, secondPartyType, tax, taxRecieverId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationWalletJournalResponse {\n");

        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
        sb.append("    firstPartyId: ").append(toIndentedString(firstPartyId)).append("\n");
        sb.append("    firstPartyType: ").append(toIndentedString(firstPartyType)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
        sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
        sb.append("    secondPartyId: ").append(toIndentedString(secondPartyId)).append("\n");
        sb.append("    secondPartyType: ").append(toIndentedString(secondPartyType)).append("\n");
        sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
        sb.append("    taxRecieverId: ").append(toIndentedString(taxRecieverId)).append("\n");
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
