import example.qa.steps.*;

public class AbstractTest {

    public final InitializerSteps initializerSteps = new InitializerSteps();

    public final BaseCollectionSteps baseCollectionSteps = new BaseCollectionSteps();

    public final CreateCollectionSteps createCollectionSteps = new CreateCollectionSteps();

    public final UpdateCollectionSteps updateCollectionSteps = new UpdateCollectionSteps();

    public final DeleteCollectionSteps deleteCollectionSteps = new DeleteCollectionSteps();

}
