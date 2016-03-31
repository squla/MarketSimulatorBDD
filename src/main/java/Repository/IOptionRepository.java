package Repository;

import Model.Option;

import java.util.Map;

/**
 * Created by Michal on 2016-03-24.
 */
public interface IOptionRepository {
    public void addOption(Option option);

    public void removeOption(Option option);

    public Map<Option, Integer> getOptions();

    public void setOptions(Map<Option, Integer> options);

}
