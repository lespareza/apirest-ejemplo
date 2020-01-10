package cl.esparza.apirest.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import cl.esparza.apirest.exception.TiempoException;
import cl.esparza.apirest.service.TiempoService;

@Service
public class TiempoServiceImpl implements TiempoService {
	
	private Logger LOG = LoggerFactory.getLogger(TiempoServiceImpl.class);
	
	private final RestTemplate restTemplate;
	
	String URL = "http://api.tiempo.com/index.php?api_lang=es&localidad=%s&affiliate_id=djr3x632aiaj&v=3.0";
	
	public TiempoServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

	@Override
	public String consultaTiempo(Long ciudad) throws TiempoException {
		
		try {
			String uri = String.format(URL, ciudad);
		    String result = restTemplate.getForObject( uri, String.class );
		    
		    LOG.info( "resultado 1:" + result);
		    return result;
    
	    } catch (HttpStatusCodeException ex) {
	        
	        LOG.error("", ex.getRawStatusCode());
	        LOG.error("", ex.getStatusCode().toString());
	        LOG.error("", ex.getResponseBodyAsString());
	        
	        org.springframework.http.HttpHeaders headers= ex.getResponseHeaders();
	        LOG.error("", headers.get("Content-Type"));
	        LOG.error("", headers.get("Server"));
	        
	        throw new TiempoException( ciudad.toString() );
	    }
		
	}

}
