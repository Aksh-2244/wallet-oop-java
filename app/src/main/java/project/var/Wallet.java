package project.var;
import  java.time.LocalDateTime;
import java.util.*;
public class Wallet {
    private String UpiId;
    private double balance;
    private List <Transaction> Transactions = new ArrayList<>();
    Wallet(String Id,double b){
        this.UpiId = Id;
        if(b<0){
            throw new IllegalArgumentException("Balance cannot be negative");
        }else{
          this.balance = b;
        }
    }
    public void addmoney(double k){
       if(k<0){
        throw new IllegalArgumentException("Amount cannot be negative");
       }else{
         String s = "TKN" + (Transactions.size()+1) + "1";
         balance+=k;
         Transaction e = new Transaction(s, k, true,LocalDateTime.now());
         Transactions.add(e);
       }
    }
    public void deductmoney(double k){
     if(k<0){
        throw new IllegalArgumentException("Amount cannot be negative");
     }else if(k>balance){
        throw new IllegalArgumentException("balance is insufficient");
     }else{
        String s = "TKN" + (Transactions.size()+1) + "0";
        balance-=k;
       Transaction e = new Transaction(s, k, false,LocalDateTime.now());
       Transactions.add(e);
     } 
    }
    public String getUpiId(){
        return UpiId;
    }
    public double getbalance(){
        return balance;
    }
    public String getlatestTransaction(){
         return "TransactionId " + Transactions.get(Transactions.size()-1).getTransactionId()
        + "\nTransaction amount-" + Transactions.get(Transactions.size()-1).getamount()
        + "\nTransaction type-" + Transactions.get(Transactions.size()-1).getcredit();
    }
    public List<Transaction> getTransactions(){
         return Collections.unmodifiableList(Transactions);
    }
    public int nooftransactionsdone(){
        return Transactions.size();
    }

}


