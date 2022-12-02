package example.qa.steps;

public class InitializerSteps {

    public static String token;
    public static String username;

    public void userIsAuthorized() {
        username = "lvasileva";
        token = System.getenv("UNSPLASH_TOKEN");
    }
}
