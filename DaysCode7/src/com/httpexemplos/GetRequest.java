package com.httpexemplos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class GetRequest {

	public static final String API_KEY = "apikey";
	public static final String URI_GET = "https://imdb-api.com/en/API/Search/" + API_KEY + "/Top250Movies";
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		// Client Http
		HttpClient client = HttpClient.newHttpClient();
		
		// create request
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.timeout(Duration.ofSeconds(10))
				.uri(URI.create(URI_GET))
				.build();
		
		// send response
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
		
		// Print response
		System.out.println(response.statusCode());
		System.out.println(response.body());
		
		
	}
}
