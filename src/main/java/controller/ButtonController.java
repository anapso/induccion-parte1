package controller;

import com.mercadopago.resources.Preference;
import service.PreferenceService;
import spark.Request;
import spark.Response;
import spark.Route;
import util.Path;
import util.ViewUtil;

import java.util.HashMap;

public class ButtonController {

    public static Route getInit = (Request request, Response response) -> {

        HashMap<String, Object> model = new HashMap<>();

        PreferenceService preferenceService = new PreferenceService();

        Preference preference = preferenceService.createPreferenciaFront();

        model.put("id", preference.getId());
        model.put("initPoint", preference.getInitPoint());

        return ViewUtil.render(request, model, Path.Template.CREATE_PREFERENCE_BUTTON);

    };
}
