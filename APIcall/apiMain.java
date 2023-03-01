package APIcall;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class apiMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        //url of github-manishpudasaini
        String url ="https://api.github.com/users/manishpudasaini";

        //httprequest
        HttpRequest request  =  HttpRequest.newBuilder().GET()
                .uri(URI.create(url)).build();

        //or in place of variable name HttpClient you can write var it will automatically understand that it is java 9 feature
        HttpClient client = HttpClient.newBuilder().build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        //to check status
        System.out.println(response.statusCode());

        //for response
        System.out.println(response.body());










    }
}
