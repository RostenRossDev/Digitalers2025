package integradores.clase6.entities;

import integradores.clase6.exceptions.NotExistClientException;
import integradores.clase6.start.HomeBanking;
import integradores.clase6.util.GenerateRandomNumber;

import java.util.Objects;

public class Account {
    private Long cbu;
    private Double balance;

    public Account() {
        this.balance = 0D;
        this.cbu = GenerateRandomNumber.generateCBU();
    }

    public Double deposit(Double value){
        this.balance += value;
        return  this.balance;
    }

    public Double withdraw(Double value){
        this.balance -= value;
        return  this.balance;
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

    public void setBalance(Double balance) {
        this.balance = balance;
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
}
