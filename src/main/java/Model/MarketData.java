package Model;

import java.util.Date;

/**
 * Created by Michal on 2016-03-24.
 */
public class MarketData {
    private String underlying;
    private double price;
    private double oldPrice;
    private Date timestamp;

    public MarketData(String underlying, double price, double oldPrice, Date timestamp) {
        this.underlying = underlying;
        this.price = price;
        this.oldPrice = oldPrice;
        this.timestamp = timestamp;
    }

    public String getUnderlying() {
        return underlying;
    }

    public void setUnderlying(String underlying) {
        this.underlying = underlying;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String toString() {
        return "\nMarketData{" +
                "underlying='" + underlying + '\'' +
                ", price=" + price +
                ", oldPrice=" + oldPrice +
                ", timestamp=" + timestamp +
                '}';
    }
}
