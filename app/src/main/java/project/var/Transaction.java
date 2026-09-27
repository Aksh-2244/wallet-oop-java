package project.var;
import java.time.LocalDateTime;

public class Transaction {
    private String Transation_Id;
    private double amount;
    private boolean credit_transaction;
    private LocalDateTime timestamp;
      
    Transaction(String transation_id,double a,boolean c){
        this.Transation_Id = transation_id;
        this.amount = a;
        this.credit_transaction = c;
        this.timestamp = LocalDateTime.now();
    }
    public String getTransactionId(){
        return Transation_Id;
    }
    public double getamount(){
        return amount;
    }
    public boolean getcredit(){
        return credit_transaction;
    }
    public LocalDateTime getTime(){
        return timestamp;
    }
}
