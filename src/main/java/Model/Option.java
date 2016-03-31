package Model;

import java.util.Date;

/**
 * Created by Michal on 2016-03-24.
 */
public class Option {
    private String underlyingInstrument;
    private OptionType optionType;
    private Date maturity;
    private double strikePrice;
    private double notionalValue;

    public Option() {
    }

    public Option(String underlyingInstrument, OptionType optionType, Date maturity, double strikePrice, double notionalValue) {
        this.underlyingInstrument = underlyingInstrument;
        this.optionType = optionType;
        this.maturity = maturity;
        this.strikePrice = strikePrice;
        this.notionalValue = notionalValue;
    }

    public String getUnderlyingInstrument() {
        return underlyingInstrument;
    }

    public void setUnderlyingInstrument(String underlyingInstrument) {
        this.underlyingInstrument = underlyingInstrument;
    }

    public OptionType getOptionType() {
        return optionType;
    }

    public void setOptionType(OptionType optionType) {
        this.optionType = optionType;
    }

    public double getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(double strikePrice) {
        this.strikePrice = strikePrice;
    }

    public Date getMaturity() {
        return maturity;
    }

    public void setMaturity(Date maturity) {
        this.maturity = maturity;
    }

    public double getNotionalValue() {
        return notionalValue;
    }

    public void setNotionalValue(double notionalValue) {
        this.notionalValue = notionalValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Option option = (Option) o;

        if (Double.compare(option.getStrikePrice(), getStrikePrice()) != 0) return false;
        if (Double.compare(option.getNotionalValue(), getNotionalValue()) != 0) return false;
        if (getUnderlyingInstrument() != null ? !getUnderlyingInstrument().equals(option.getUnderlyingInstrument()) : option.getUnderlyingInstrument() != null)
            return false;
        if (getOptionType() != option.getOptionType()) return false;
        return !(getMaturity() != null ? !getMaturity().equals(option.getMaturity()) : option.getMaturity() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getUnderlyingInstrument() != null ? getUnderlyingInstrument().hashCode() : 0;
        result = 31 * result + (getOptionType() != null ? getOptionType().hashCode() : 0);
        result = 31 * result + (getMaturity() != null ? getMaturity().hashCode() : 0);
        temp = Double.doubleToLongBits(getStrikePrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getNotionalValue());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "\nOption{" +
                "underlyingInstrument='" + underlyingInstrument + '\'' +
                ", optionType=" + optionType +
                ", maturity=" + maturity +
                ", strikePrice=" + strikePrice +
                ", notionalValue=" + notionalValue +
                "}";
    }
}
