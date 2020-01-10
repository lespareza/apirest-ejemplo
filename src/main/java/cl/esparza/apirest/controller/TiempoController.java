package cl.esparza.apirest.controller;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.esparza.apirest.exception.TiempoException;
import cl.esparza.apirest.service.TiempoService;

/**
 * 
 * @author l.esparza.p@gmail.com
 *
 */

@RestController
@RequestMapping("/api")
public class TiempoController {
	
	@Autowired
	public TiempoService tiempoService;
	
	@GetMapping("/{ciudadId}")
	public String getTiempo(@PathVariable String ciudadId) throws TiempoException{
		
		try {
			if ( !isNumeric(ciudadId) ) {
				throw new TiempoException(ciudadId);
			}
			
			Long id = Long.parseLong(ciudadId);
			
			return tiempoService.consultaTiempo( id );
			
		} catch (Exception e) {
			throw new TiempoException(ciudadId);
			
		}
		
	}
	
	private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
	 
	private boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false; 
	    }
	    return pattern.matcher(strNum).matches();
	}
}
