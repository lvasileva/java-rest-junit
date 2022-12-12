package example.qa.steps;

import example.qa.data.Collection;
import io.qameta.allure.Step;

import java.time.ZonedDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateCollectionSteps extends BaseCollectionSteps {

    @Step("User creates a new collection")
    public Collection userCreatesNewCollection() throws Exception {
        return createCollectionWithName("j-test " + ZonedDateTime.now());
    }

    @Step("New collection is added")
    public void newCollectionIsAdded(Collection collection) throws Exception {
        List<Collection> list = getAllUserCollections(InitializerSteps.username);
        assertThat(list).as("No expected collection found").contains(collection);
    }
}
