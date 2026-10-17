package project.var;
import java.time.LocalDateTime;
import java.util.*;
public class WalletAnalyser {
    private Wallet wallet;

    WalletAnalyser(Wallet w){
        this.wallet = w;
    }
    public double totalamountcredited(){
        List <Transaction> T = wallet.getTransactions();
        double a = 0;
        for(int i = 0;i<wallet.nooftransactionsdone();i++){
           if(T.get(i).getcredit() == true){
           a+= T.get(i).getamount();
          }
        }  
        return a;
    }
    public double totalamountdebited(){
        List <Transaction> T = wallet.getTransactions();
        double a = 0;;
        for(int i = 0;i<wallet.nooftransactionsdone();i++){
           if(T.get(i).getcredit() == false){
           a+= T.get(i).getamount();
          }
        }  
        return a;
    }
    public double expenditure(LocalDateTime t1,LocalDateTime t2){
        List <Transaction> T = wallet.getTransactions();
        double a = 0;
        for(int i=0;i<wallet.nooftransactionsdone();i++){
           if(T.get(i).getTime().isAfter(t1) && T.get(i).getTime().isBefore(t2) && T.get(i).getcredit() == false){
            a+= T.get(i).getamount();
           }
        }
        return a;
}
}
