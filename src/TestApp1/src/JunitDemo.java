import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class JunitDemo {
    long sum(long x, long y) {
        return x + y;
    }

}

@Test
public void sum(){
    assertEquals(4,sum(2,2));
}
}
