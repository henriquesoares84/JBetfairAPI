package prj.betfair.api.betting.datatypes;

import prj.betfair.api.betting.datatypes.PlaceInstruction;
import prj.betfair.api.betting.datatypes.PlaceInstructionReport;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/***
 * Response to a PlaceInstruction
 */
@JsonDeserialize(builder = PlaceInstructionReport.Builder.class)
public class PlaceInstructionReport {
  private final String status;
  private final double sizeMatched;
  private final String betId;
  private final PlaceInstruction instruction;
  private final String errorCode;
  private final Date placedDate;
  private final double averagePriceMatched;

  public PlaceInstructionReport(Builder builder) {
    this.status = builder.status;
    this.sizeMatched = builder.sizeMatched;
    this.betId = builder.betId;
    this.instruction = builder.instruction;
    this.errorCode = builder.errorCode;
    this.placedDate = builder.placedDate;
    this.averagePriceMatched = builder.averagePriceMatched;
  }

  /**
   * @return status whether the command succeeded or failed
   */
  public String getStatus() {
    return this.status;
  }

  /**
   * @return errorCode cause of failure, or null if command succeeds
   */
  public String getErrorCode() {
    return this.errorCode;
  }

  /**
   * @return instruction The instruction that was requested
   */
  public PlaceInstruction getInstruction() {
    return this.instruction;
  }

  /**
   * @return betId The bet ID of the new bet. May be null on failure.
   */
  public String getBetId() {
    return this.betId;
  }

  /**
   * @return placedDate
   */
  public Date getPlacedDate() {
    return this.placedDate;
  }

  /**
   * @return averagePriceMatched
   */
  public double getAveragePriceMatched() {
    return this.averagePriceMatched;
  }

  /**
   * @return sizeMatched
   */
  public double getSizeMatched() {
    return this.sizeMatched;
  }

  public static class Builder {
    private String status;
    private double sizeMatched;
    private String betId;
    private PlaceInstruction instruction;
    private String errorCode;
    private Date placedDate;
    private double averagePriceMatched;

    /**
     * @param status : whether the command succeeded or failed
     * @param instruction : The instruction that was requested
     */
    public Builder(@JsonProperty("status") String status,
        @JsonProperty("instruction") PlaceInstruction instruction) {
      this.status = status;
      this.instruction = instruction;
    }

    /**
     * Use this function to set errorCode
     * 
     * @param errorCode cause of failure, or null if command succeeds
     * @return Builder
     */
    public Builder withErrorCode(String errorCode) {
      this.errorCode = errorCode;
      return this;
    }

    /**
     * Use this function to set betId
     * 
     * @param betId The bet ID of the new bet. May be null on failure.
     * @return Builder
     */
    public Builder withBetId(String betId) {
      this.betId = betId;
      return this;
    }

    /**
     * Use this function to set placedDate
     * 
     * @param placedDate
     * @return Builder
     */
    public Builder withPlacedDate(Date placedDate) {
      this.placedDate = placedDate;
      return this;
    }

    /**
     * Use this function to set averagePriceMatched
     * 
     * @param averagePriceMatched
     * @return Builder
     */
    public Builder withAveragePriceMatched(double averagePriceMatched) {
      this.averagePriceMatched = averagePriceMatched;
      return this;
    }

    /**
     * Use this function to set sizeMatched
     * 
     * @param sizeMatched
     * @return Builder
     */
    public Builder withSizeMatched(double sizeMatched) {
      this.sizeMatched = sizeMatched;
      return this;
    }

    public PlaceInstructionReport build() {
      return new PlaceInstructionReport(this);
    }
  }
}
