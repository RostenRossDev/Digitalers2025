package mains.MyExceptions;

public class DivisionPorCincoException extends Exception{

    public DivisionPorCincoException(){
        super("La division por cinco \"5\" no es posible");
    }

    public DivisionPorCincoException(String message){
        super(message);
    }
}
