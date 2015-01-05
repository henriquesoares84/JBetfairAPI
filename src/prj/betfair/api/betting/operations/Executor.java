package prj.betfair.api.betting.operations;

import java.util.ArrayList;

import prj.betfair.api.betting.datatypes.CancelExecutionReport;
import prj.betfair.api.betting.datatypes.ClearedOrderSummaryReport;
import prj.betfair.api.betting.datatypes.CompetitionResult;
import prj.betfair.api.betting.datatypes.CountryCodeResult;
import prj.betfair.api.betting.datatypes.CurrentOrderSummaryReport;
import prj.betfair.api.betting.datatypes.EventResult;
import prj.betfair.api.betting.datatypes.EventTypeResult;
import prj.betfair.api.betting.datatypes.MarketBook;
import prj.betfair.api.betting.datatypes.MarketCatalogue;
import prj.betfair.api.betting.datatypes.MarketProfitAndLoss;
import prj.betfair.api.betting.datatypes.MarketTypeResult;
import prj.betfair.api.betting.datatypes.PlaceExecutionReport;
import prj.betfair.api.betting.datatypes.ReplaceExecutionReport;
import prj.betfair.api.betting.datatypes.TimeRangeResult;
import prj.betfair.api.betting.datatypes.UpdateExecutionReport;
import prj.betfair.api.betting.datatypes.VenueResult;
import prj.betfair.api.betting.exceptions.APINGException;
import prj.betfair.api.betting.navigation.NavigationItem;
import prj.betfair.api.login.ApplicationToken;



public interface Executor {

  public abstract CancelExecutionReport execute(CancelOrdersOperation operation)
      throws APINGException;

  public abstract ClearedOrderSummaryReport execute(ListClearedOrdersOperation operation)
      throws APINGException;

  public abstract ArrayList<CompetitionResult> execute(ListCompetitionsOperation operation)
      throws APINGException;

  public abstract ArrayList<CountryCodeResult> execute(ListCountriesOperation operation)
      throws APINGException;

  public abstract CurrentOrderSummaryReport execute(ListCurrentOrdersOperation operation)
      throws APINGException;

  public abstract ArrayList<EventResult> execute(ListEventsOperation operation)
      throws APINGException;

  public abstract ArrayList<EventTypeResult> execute(ListEventTypesOperation operation)
      throws APINGException;

  public abstract ArrayList<MarketBook> execute(ListMarketBookOperation operation)
      throws APINGException;

  public abstract ArrayList<MarketCatalogue> execute(ListMarketCatalogueOperation operation)
      throws APINGException;

  public abstract ArrayList<MarketProfitAndLoss> execute(ListMarketProfitAndLossOperation operation)
      throws APINGException;

  public abstract ArrayList<MarketTypeResult> execute(ListMarketTypesOperation operation)
      throws APINGException;

  public abstract ArrayList<TimeRangeResult> execute(ListTimeRangesOperation operation)
      throws APINGException;

  public abstract ArrayList<VenueResult> execute(ListVenuesOperation operation)
      throws APINGException;

  public abstract PlaceExecutionReport execute(PlaceOrdersOperation operation)
      throws APINGException;

  public abstract ReplaceExecutionReport execute(ReplaceOrdersOperation operation)
      throws APINGException;

  public abstract UpdateExecutionReport execute(UpdateOrdersOperation operation)
      throws APINGException;

  public abstract NavigationItem getNavigationData() throws APINGException;

  public abstract ApplicationToken getApplicationToken();

  public abstract void setApplicationToken(ApplicationToken applicationToken);

}