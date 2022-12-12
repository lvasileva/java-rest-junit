package example.qa.steps;

import example.qa.data.Collection;
import io.qameta.allure.Step;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DeleteCollectionSteps extends BaseCollectionSteps {

    @Step("User deletes the collection")
    public void userDeletesTheCollection(Collection collection) throws Exception {
        deleteCollectionById(collection.getId());
    }

    @Step("The collection is deleted")
    public void theCollectionIsDeleted(Collection collection) throws Exception {
        List<Collection> collectionList = getAllUserCollections(InitializerSteps.username);
        assertThat(collectionList).as("User's " + InitializerSteps.username + " collection list contains the collection " + collection.getTitle()).doesNotContain(collection);
    }
}
