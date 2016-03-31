package Repository;

import Model.MarketData;

import java.util.List;

/**
 * Created by Michal on 2016-03-31.
 */
public interface IMarketDataRepository {
    List<MarketData> getMarketData();
    void refresh();
}
