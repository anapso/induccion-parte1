import controller.ButtonController;
import controller.PreferenceController;
import spark.Spark;
import spark.servlet.SparkApplication;
import util.JsonTransformer;
import util.Path;

import static spark.Spark.post;
import static spark.route.HttpMethod.get;

public class Endpoint implements SparkApplication {

    @Override
    public void init() {

        //Spark.post(Path.Web.CREATE_PREFERENCE_FRONT, PreferenceController::createPreferenceFront, new JsonTransformer());
        //Spark.post(Path.Web.CREATE_PREFERENCE, PreferenceController::createPreference, new JsonTransformer());

        // Velocity
        Spark.get(Path.Web.HOME_VELOCITY, ButtonController.getInit);

    }

}
