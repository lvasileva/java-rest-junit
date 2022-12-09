package example.qa.steps;

import example.qa.data.Collection;

import java.time.ZonedDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateCollectionSteps extends BaseCollectionSteps {

    public Collection userCreatesNewCollection() throws Exception {
        return createCollectionWithName("j-test " + ZonedDateTime.now());
    }

    public void newCollectionIsAdded(Collection collection) throws Exception {
        List<Collection> list = getAllUserCollections(InitializerSteps.username);
        assertThat(list).as("No expected collection found").contains(collection);
    }
}
