package Model;

/**
 * Created by Michal on 2016-03-24.
 */
public class RiskCalculationTaskObject {
    private Option option;
    private double newPrice;

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }
}
