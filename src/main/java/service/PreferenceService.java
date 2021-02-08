package service;

import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Preference;
import com.mercadopago.resources.datastructures.preference.Item;
import com.mercadopago.resources.datastructures.preference.Payer;
import data.PreferenceData;

public class PreferenceService {

    public Preference createPreference(PreferenceData preferenceData) throws MPException {

        Preference preference = new Preference().setPayer(preferenceData.getPayer()).appendItem(preferenceData.getItem()).save();
        return preference;
    }

    public Preference createPreferenciaFront() throws MPException {

        Item item = new Item().setTitle("Dummys").setQuantity(6).setDescription("Multicolor Item").setUnitPrice(80.56f);
        Payer payer = new Payer();

        Preference preferenceSave = new Preference().setPayer(payer).appendItem(item).save();

        return preferenceSave;
    }
}
