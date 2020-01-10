package cl.esparza.apirest.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


class TiempoControllerTest {

	@Test
	public void testGetTiempoSuccess() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	    
	    final String baseUrl = "http://localhost:8080/api/18267";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     	    
	    assertThat(result.getStatusCodeValue()).isEqualTo(200);
	}
	
	@Test
	public void testGetTiempoError() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	    
	    final String baseUrl = "http://localhost:8080/api/18267t";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     	    
	    assertThat(result.getStatusCodeValue()).isEqualTo(500);
	}

}
