package cl.esparza.apirest.exception;


public class TiempoException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public TiempoException(String id) {
        super("Error consultando la comuna : " + id);
    }

}