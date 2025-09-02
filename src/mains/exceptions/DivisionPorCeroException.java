package mains.exceptions;

public class DivisionPorCeroException extends ArithmeticException {

    Integer dividendo;

    public DivisionPorCeroException(String msg, Integer dividendo){
        super(msg);
        this.dividendo = dividendo;
    }

    public Integer getDividendo() {
        return dividendo;
    }

    public void setDividendo(Integer dividendo) {
        this.dividendo = dividendo;
    }
}
