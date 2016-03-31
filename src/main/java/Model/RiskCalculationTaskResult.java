package Model;

/**
 * Created by Michal on 2016-03-24.
 */
public class RiskCalculationTaskResult {
    private double presentValue;
    private double delta;


    public double getPresentValue() {
        return presentValue;
    }

    public void setPresentValue(double presentValue) {
        this.presentValue = presentValue;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }
}
