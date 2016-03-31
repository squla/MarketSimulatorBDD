package CrudOption;

import Model.Option;
import Model.OptionType;
import Repository.OptionRepository;
import org.hamcrest.core.IsEqual;
import org.jbehave.core.annotations.BeforeScenario;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import java.util.Date;

/**
 * Created by Michal on 2016-03-31.
 */
public class CrudOptionSteps {
    OptionRepository optionRepository;

    @BeforeScenario
    public void BeforeEachScenerio(){
        optionRepository = new OptionRepository();
    }


    @Given("storage containing $count option")
    public void givenEmptyStorage(int count){
        Assert.assertEquals(optionRepository.getOptions().size(),count);
    }

    @Given("storage containing $count $optionType options with stike $strike")
    public void givenStorageWithOnePutOption(int count, OptionType optionType, double strike){
        optionRepository.addOption(new Option("", optionType, null, strike,0));
        Assert.assertEquals(optionRepository.getOptions().size(),count);
    }

    @When("user add new $optionType option with strike $strike")
    public void whenUserAddPutOptionWithStrike1(OptionType optionType, double strike){
        optionRepository.addOption(new Option("", optionType, null, strike,0));
    }

    @When("user remove $optionType option with strike $strike")
    public void whenUserRemovePutOptionWithStrike0(OptionType optionType, double strike){

        optionRepository.removeOption(new Option("", optionType, null, strike,0));
    }

    @Then("storage contains $count option")
    public void storageContainOptions(int count){
        Assert.assertEquals(optionRepository.getOptions().size(),count);
    }
}

