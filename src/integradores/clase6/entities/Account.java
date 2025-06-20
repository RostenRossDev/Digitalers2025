package integradores.clase6.entities;

public class Account {
    private Long cbu;
    private Double balance = 0D;

    public Account( ) {
        this.cbu = generateCbu();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double deposit(Double value){
        this.balance += value;
        return  this.balance;
    }

    public Double withdraw(Double value){
        this.balance -= value;
        return  this.balance;
    }
}
