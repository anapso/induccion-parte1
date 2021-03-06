import com.sun.xml.internal.xsom.XSUnionSimpleType;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsumidorAPI {

    private static String URLBase = "https://api.mercadopago.com/checkout/preferences";
    private static String token = "APP_USR-3154206633105477-012713-b7f50bc11b9e22e12e8301d4f5e9fd60-707289365";

    private static ConsumidorAPI instance;

    private CloseableHttpClient clienteHTTP;

    private ConsumidorAPI(){
        this.clienteHTTP = HttpClients.createDefault();
    }

    public static ConsumidorAPI getInsance(){
        if(instance == null){
            instance = new ConsumidorAPI();
        }
        return instance;
    }

    public void doLogin(){

        try {
            HttpPost httpPost = new HttpPost(ConsumidorAPI.URLBase + "/Login/Autenticar?token=" + ConsumidorAPI.token);

            // Criando um handler ou manipulador de resposta customizado
            // pois queremos recuperar o conteudo da resposta e nao apenas o codigo http de resposta
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {

                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 200 && status < 300) {
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw  new ClientProtocolException("Unexpected response status " + status);
                    }
                }
            };
            String responseBody = this.clienteHTTP.execute(httpPost, responseHandler);
            System.out.println("----------------------");
            System.out.println(responseBody);
        }catch (IOException ex){
            Logger.getLogger(ConsumidorAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // metodo para realizar requisicoes da API
    public String doRequest(String path) {
        String responseBody = null;
        try {
            HttpGet httpGet = new HttpGet(ConsumidorAPI.URLBase+path);

            // Criando um handler ou manipulador de resposta customizad
            // pois queremos recuperar o conteudo da resposta e nao apenas o codigo http de resposta
            ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
                @Override
                public String handleResponse(
                        final HttpResponse response) throws ClientProtocolException, IOException {
                    int status = response.getStatusLine().getStatusCode();
                    if (status >= 20 && status < 300){
                        HttpEntity entity = response.getEntity();
                        return entity != null ? EntityUtils.toString(entity) : null;
                    } else {
                        throw new ClientProtocolException("Unexpected response status: " +status);
                    }
                }
            };
            responseBody = this.clienteHTTP.execute(httpGet, responseHandler);
            System.out.println("---------------------------");
        } catch (IOException ex) {
            Logger.getLogger(ConsumidorAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  responseBody;
    }



}
