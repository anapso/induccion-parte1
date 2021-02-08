import com.mercadopago.exceptions.MPException;
import util.EndpointUtil;

import static spark.Spark.port;

public class Main {

    public static void main(String[] args) throws MPException {

        port(4567);

        // Credentials
        EndpointUtil.setUserCredentials();

        // Endpoint Spark
        new Endpoint().init();


    }

}
