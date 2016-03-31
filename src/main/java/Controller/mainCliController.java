package Controller;

import Model.MarketData;
import Model.Option;
import Model.OptionType;
import Repository.IMarketDataRepository;
import Repository.MarketDataRepository;
import Repository.OptionRepository;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Michal on 2016-03-31.
 */
public class mainCliController {
    private MarketDataRepository dataRepository;
    private OptionRepository optionRepository;
    private boolean exit;

    public mainCliController() {
        dataRepository = new MarketDataRepository();
        optionRepository = new OptionRepository();
        this.exit = false;
    }

    public void menuParser(String s) throws Exception{
        String[] split = s.split(" ");
        switch (split[0]) {
            case "p":
            case "print":
                this.printParser(split);
                break;
            case "a":
            case "add":
                System.out.println("add");
                this.addParser(split);
                break;
            case "r":
            case "refresh":
                System.out.println("refresh");
                dataRepository.refresh();

                break;
            case "e":
            case "exit":
                System.out.println("exit");
                this.exit = true;
                break;

            case "g":
                generateData();
                break;

        }
    }

    public boolean exit() {
        return exit;
    }

    public void generateData() {
        List<MarketData> marketDataList = new LinkedList<>();
        marketDataList.add(new MarketData("Euro", 0, 0, new Date()));
        marketDataList.add(new MarketData("Euro2", 2, 0, new Date()));
        marketDataList.add(new MarketData("Euro3", 2, 0, new Date()));
        marketDataList.add(new MarketData("Euro4", 4, 0, new Date()));
        marketDataList.add(new MarketData("Euro5", 5, 0, new Date()));
        dataRepository.setMarketData(marketDataList);
    }

    public void printParser(String[] strings) {
        switch (strings[1]) {
            case "o":
            case "option":
                System.out.println("print options");
                System.out.println(optionRepository.toString());
                break;
            case "d":
            case "data":
                System.out.println("print data");
                System.out.println(dataRepository.toString());
                break;

        }
    }

    public void addParser(String[] strings) throws Exception{
        Option option = new Option();
        for (int i = 1; i < strings.length; i++) {
            String[] split = strings[i].split("=");
            if (split[1] == null || split[1].equals("")) return;
            switch (split[0]) {
                case "strikePrice":
                    option.setStrikePrice(new Double(split[1]));
                    break;
                case "notionalValue":
                    option.setNotionalValue(new Double(split[1]));
                    break;
                case "underlyingInstrument":
                    option.setUnderlyingInstrument(split[1]);
                    break;
                case "optionType":
                    if (split[1].equals("PUT")) {
                        option.setOptionType(OptionType.PUT);
                    } else if (split[1].equals("CALL")) {
                        option.setOptionType(OptionType.CALL);
                    }
                    break;
                case "maturity":
                    option.setMaturity(new SimpleDateFormat("dd.MM.yyyy").parse(split[1]));
                    break;

            }
        }
        System.out.println(option.toString());
    }
}
