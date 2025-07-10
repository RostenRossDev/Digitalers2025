package integradores.clase6.entities;

import integradores.clase6.exceptions.NotExistClientException;
import integradores.clase6.start.HomeBanking;
import integradores.clase6.util.GenerateRandomNumber;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Account {
    private String typo;
    private Long cbu;
    private Double balance;

    public Account() {
        this.typo="ARS";
        this.balance = 0D;
        this.cbu = GenerateRandomNumber.generateCBU();
    }

    public Double deposit(Double value){
        this.balance += value;
        return  this.balance;
    }

    public Double withdraw(Double value){
        if (this.balance - value > 0){
            this.balance -= value;
            return  this.balance;
        }
        return this.balance;
    }

    public static Double withdraw(Double value, String email) throws NotExistClientException {
        Client client = null;
        for(Client c: HomeBanking.clients){
            if(Objects.equals(c.getEmail(), email)){
                client = c;
                break;
            }
        }
        if(client != null){
            return client.getAccount().withdraw(value);
        }else {
            throw new NotExistClientException();
        }
    }

    public static Double deposit(Double value, String email) throws NotExistClientException {
        Client client = null;
        for(Client c: HomeBanking.clients){
            if(Objects.equals(c.getEmail(), email)){
                client = c;
                break;
            }
        }
        if(client != null){
            return client.getAccount().deposit(value);
        }else {
            throw new NotExistClientException();
        }
    }

    public static Boolean validateWithdraw(Double value, String email){
        for(Client c: HomeBanking.clients){
            if(Objects.equals(c.getEmail(), email)){
                return c.getAccount().getBalance() >= value;
            }
        }
        return false;
    }

    public static Account getAccount(String email){
        for(Client c: HomeBanking.clients){
            if(Objects.equals(c.getEmail(), email)){
                return c.getAccount();
            }
        }
        return null;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) throws Exception {
        if (balance < 0){
            throw new Exception("El balance no puede ser negativo!!!!!!");
        }
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "cbu: " + this.cbu + ", balance: " + this.balance;
    }
}
