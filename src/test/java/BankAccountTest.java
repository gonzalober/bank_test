import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
  private BankAccount newTrans;
  private NewOperation newOperation;

  @BeforeEach
  void setup() {
    newTrans = new BankAccount();
    newOperation = new NewOperation("credit", 2000, "08/11/2018");
  }

  @AfterEach
    void teardown(){

  }

  @Test
  public void testCanAddRecord() {
    System.out.println( "HOLA"+ newTrans);
    Object result = (Object) newTrans.addRecord(newOperation);
    System.out.println( "HOLA"+ result);
    assertEquals(new String[]{"credit", String.valueOf(2000), "08/11/2018"}, result);
  }

}
