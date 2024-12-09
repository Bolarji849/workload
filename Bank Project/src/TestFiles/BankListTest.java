package TestFiles;
import BANK.BankList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankListTest {
        @Test
        public void createBank_getNumberOfBanks(){
            BankList bank = new BankList();
             bank.addBank("fidelityBank");
             assertEquals(1, bank.getNumberOfBanks());
        }

    }
