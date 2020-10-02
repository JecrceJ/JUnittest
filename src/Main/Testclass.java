package Main;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import static org.junit.jupiter.api.Assertions.*;

@RunWith(Suite.class)
@SuiteClasses({
        Calculos.class,
        Main.class
})
public class Testclass {

    public void checkCuad(double cuad){
        Calculos tester = new Calculos();
        assertFalse(tester.testareaCuad());
        assertEquals(25,cuad);
    }
}
