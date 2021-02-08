package util;

import com.mercadopago.MercadoPago;
import com.mercadopago.exceptions.MPException;

public class EndpointUtil {

    public static String CLIENT_ID = "3154206633105477";
    public static String CLIENT_SECRET = "jA2md2jqhi26b5Le1ggXWw7ZRXdDtsPQ";
    public static String ACCESS_TOKEN = "APP_USR-3154206633105477-012713-b7f50bc11b9e22e12e8301d4f5e9fd60-707289365";


    public static void setUserCredentials() throws MPException {
        MercadoPago.SDK.setClientId(EndpointUtil.CLIENT_ID);
        MercadoPago.SDK.setClientSecret(EndpointUtil.CLIENT_SECRET);
        MercadoPago.SDK.setAccessToken(EndpointUtil.ACCESS_TOKEN);
    };
}
