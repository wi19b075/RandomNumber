import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting REST Service...");
        ResourceConfig rc = new ResourceConfig().packages("Controllers");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("Server started");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Random value in int: " + GenerateRandom());

        server.stop(0);
        System.out.println("Server stopped");

    }

    public static String getMessage() {
        return "Hello Random Number";
    }

    public static int GenerateRandom() {
        int min = 0;
        int max = 100;

        //Generate random int value from 50 to 100
        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return random_int;

    }
}