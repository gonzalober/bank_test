import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {

  public List<Object> list = new ArrayList<>();

  //constructor with an argument.
  public BankAccount() {
    this.list = (List<Object>) list;
  }
  public Object addRecord(NewOperation operation) {
     return  this.list.add(operation);
  }
//  public void deposit(int userInput) {
//    userInput. = userInput;
//  }
}
