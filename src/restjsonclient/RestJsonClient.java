/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restjsonclient;
import javax.ws.rs.client.*;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;

/**
 *
 * @author Michelet
 */
public class RestJsonClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        String name = client.target("http://localhost:8080/RestJson/rest/vagas")
                .request(MediaType.APPLICATION_JSON).get(String.class);
        client.close();
    
    System.out.println(name);

  }

    
}
