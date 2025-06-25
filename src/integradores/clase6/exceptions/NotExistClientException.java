package integradores.clase6.exceptions;

public class NotExistClientException extends Exception{

    public NotExistClientException(){
        super("No existe el cliente en la base de datos");
    }
}
