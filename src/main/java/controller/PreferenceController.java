package controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.Item;
import com.mercadopago.resources.datastructures.preference.Payer;
import data.PreferenceData;
import service.PreferenceService;
import spark.Request;
import spark.Response;

import java.util.HashMap;
import java.util.Map;

public class PreferenceController {

    private static Gson gson = new GsonBuilder().create();
    private static Map<String, PreferenceData> preferences = new HashMap<>();

    /*public static String createPreference(Request request, Response response) throws MPException {

        String json_preference = request.body();
        PreferenceData preferenceData = gson.fromJson(json_preference, PreferenceData.class);

        PreferenceService preferenceService = new PreferenceService();
        Preference preferenceSave = preferenceService.createPreference(preferenceData);

        return preferenceSave.getInitPoint();

    }*/


}
