package num2;

import java.util.ArrayList;
import java.util.List;

public class  AccountManager{
    static List<Account> listAcc = new ArrayList<>();
    public static Account newAccount(String nama, String noHP, String email, String password){
        listAcc.add(new Account(nama,noHP,email,password));
        return null;
    }

   public  static void totalAccount(){
       System.out.println("There are currently " + listAcc.size() + " accounts");
   }

}
