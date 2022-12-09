package example.qa.steps;

import example.qa.data.Collection;

import static org.assertj.core.api.Assertions.assertThat;

public class UpdateCollectionSteps extends BaseCollectionSteps {

    public Collection userSCollectionWithNameIsExist(String collectionName) throws Exception {
        if (!isUserCollectionExistByName(InitializerSteps.username, collectionName)) {
            createCollectionWithName(collectionName);
        }
        return getUserCollectionByName(InitializerSteps.username, collectionName);
    }

    public Collection userUpdatesTheCollectionNameTo(Collection collection, String collectionName) throws Exception {
        return updateCollectionNameById(collection.getId(), collectionName);
    }

    public void theCollectionNameIsUpdated(Collection collection, String collectionName) {
        assertThat(collection.getTitle()).as("Collection name was not updated to " + collectionName).isEqualTo(collectionName);
    }
}
