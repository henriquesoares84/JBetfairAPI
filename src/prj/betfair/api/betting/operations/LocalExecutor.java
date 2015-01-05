package prj.betfair.api.betting.operations;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;

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

public class LocalExecutor implements Executor {

  @Override
  public CancelExecutionReport execute(CancelOrdersOperation operation) throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ClearedOrderSummaryReport execute(ListClearedOrdersOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<CompetitionResult> execute(ListCompetitionsOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<CountryCodeResult> execute(ListCountriesOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public CurrentOrderSummaryReport execute(ListCurrentOrdersOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<EventResult> execute(ListEventsOperation operation) throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<EventTypeResult> execute(ListEventTypesOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<MarketBook> execute(ListMarketBookOperation operation) throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<MarketCatalogue> execute(ListMarketCatalogueOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<MarketProfitAndLoss> execute(ListMarketProfitAndLossOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<MarketTypeResult> execute(ListMarketTypesOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<TimeRangeResult> execute(ListTimeRangesOperation operation)
      throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ArrayList<VenueResult> execute(ListVenuesOperation operation) throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public PlaceExecutionReport execute(PlaceOrdersOperation operation) throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ReplaceExecutionReport execute(ReplaceOrdersOperation operation) throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UpdateExecutionReport execute(UpdateOrdersOperation operation) throws APINGException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public NavigationItem getNavigationData() {
    ObjectMapper mapper = new ObjectMapper();
    try {
      return mapper.readValue(new File("./menu.txt"), NavigationItem.class);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      System.exit(0);
    }
    return null;
  }

  @Override
  public ApplicationToken getApplicationToken() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void setApplicationToken(ApplicationToken applicationToken) {
    // TODO Auto-generated method stub

  }

}