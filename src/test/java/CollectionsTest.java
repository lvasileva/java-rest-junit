import example.qa.data.Collection;
import example.qa.steps.InitializerSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class CollectionsTest extends AbstractTest {

    public static Collection collection;

    @Test
    @DisplayName("Authorized user is able to create a new collection")
    void authorizedUserIsAbleToCreateANewCollection() {
        initializerSteps.userIsAuthorized();
        collection = createCollectionSteps.userCreatesNewCollection();
        createCollectionSteps.newCollectionIsAdded(collection);
    }

    @Test
    @DisplayName("Authorized user is able to update the collection")
    void authorizedUserIsAbleToUpdateTheCollection() {
        initializerSteps.userIsAuthorized();
        String collectionName = "Junit collection to be updated";
        collection = updateCollectionSteps.userSCollectionWithNameIsExist(collectionName);
        Collection newCollection = updateCollectionSteps.userUpdatesTheCollectionNameTo(collection, collectionName);
        updateCollectionSteps.theCollectionNameIsUpdated(newCollection, collectionName);
    }

    @Test
    @DisplayName("Authorized user is able to delete the collection")
    void authorizedUserIsAbleToDeleteTheCollection() {
        initializerSteps.userIsAuthorized();
        String collectionName = "Junit collection to be deleted";
        collection = updateCollectionSteps.userSCollectionWithNameIsExist(collectionName);
        deleteCollectionSteps.userDeletesTheCollection(collection);
        deleteCollectionSteps.theCollectionIsDeleted(collection);
    }

    @AfterEach
    void cleanUpCollection() {
        if (collection==null) {
            //do nothing, the collection is already not there
        }
        else {
            if (baseCollectionSteps.isUserCollectionExistByName(InitializerSteps.username, collection.getTitle())) {
                deleteCollectionSteps.deleteCollectionById(collection.getId());
            }
        }
    }
}
