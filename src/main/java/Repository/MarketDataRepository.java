package Repository;

import Model.MarketData;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Michal on 2016-03-31.
 */
public class MarketDataRepository implements IMarketDataRepository {
    private List<MarketData> marketDataList;

    public void setMarketData(List<MarketData> marketDataList) {
        this.marketDataList = marketDataList;
    }

    public List<MarketData> getMarketData() {
        return this.marketDataList;
    }


    public void refresh() {
        Random generator = new Random();
        for(MarketData m : marketDataList){
            m.setOldPrice(m.getPrice());
            m.setPrice(generator.nextDouble()* 100);
            Date in = new Date();
            LocalDateTime ldt = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
            m.setTimestamp(Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant()));
        }
    }
}
