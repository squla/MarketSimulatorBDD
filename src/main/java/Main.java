import Model.MarketData;
import Model.Option;
import Model.OptionType;
import Repository.MarketDataRepository;
import Repository.OptionRepository;
import View.mainCliView;

import java.util.*;
import java.util.concurrent.Exchanger;

/**
 * Created by Michal on 2016-03-24.
 */
public class Main {
    public static void main(String[] args) {
//        List<MarketData> marketDatas= new LinkedList<>();
//        marketDatas.add(new MarketData("Euro", 0,0,new Date()));
//        marketDatas.add(new MarketData("Euro2", 2,0,new Date()));
//        marketDatas.add(new MarketData("Euro3", 2,0,new Date()));
//        marketDatas.add(new MarketData("Euro4", 4,0,new Date()));
//        marketDatas.add(new MarketData("Euro5", 5,0,new Date()));
//        MarketDataRepository marketDataRepository = new MarketDataRepository();
//        marketDataRepository.setMarketData(marketDatas);
//        System.out.println(marketDataRepository.getMarketData().toString());
//        marketDataRepository.refresh();
//        System.out.println(marketDataRepository.getMarketData().toString());
//        marketDataRepository.refresh();
//        System.out.println(marketDataRepository.getMarketData().toString());
        try {
            mainCliView.run();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
