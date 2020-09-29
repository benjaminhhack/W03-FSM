import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class Testfsminterpreter {
    /*
     * Integration tests using stacscheck tests
     */

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private String [] args;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void stacs1(){
        args = new String[]{"Tests/simple.fsm", "aba"};
        fsminterpreter.main(args);

        assertEquals("eoo", outputStreamCaptor.toString().trim());

    }

    @Test
    void stacs2(){

    }

    @Test
    void stacs3(){

    }

    @Test
    void stacs4(){

    }


}