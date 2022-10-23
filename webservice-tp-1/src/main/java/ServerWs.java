import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerWs {
    public static void main(String[] args) {
        String hostname="http://0.0.0.0:9191/";
        Endpoint.publish(hostname,new BanqueService());
        System.out.println(String.format("Webservice deployed on %s",hostname));
    }
}
