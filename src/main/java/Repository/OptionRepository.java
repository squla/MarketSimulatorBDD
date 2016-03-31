package Repository;

import Model.Option;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Michal on 2016-03-24.
 */
public class OptionRepository implements IOptionRepository {
    private Map<Option, Integer> options;

    public OptionRepository() {
        options = new HashMap<>();
    }

    public void addOption(Option option) {
        options.compute(option, (k,v) -> v == null ? 1 : v+1);
    }

    public void removeOption(Option option) {
        options.computeIfPresent(option, (k,v)->v == 1? null : v-1);
    }

    public Map<Option, Integer> getOptions() {
        return options;
    }

    public void setOptions(Map<Option, Integer> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Options :" + options ;
    }
}
