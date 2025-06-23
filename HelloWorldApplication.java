import java.io.*;
import com.sun.net.httpserver.*;

public class HelloWorldApplication {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new java.net.InetSocketAddress(8080), 0);
        server.createContext("/", (exchange -> {
            String response = "Hello from Java!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }));
        server.start();
    }
}

