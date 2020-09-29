import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TestDescription {
    Reader reader = null;
    Description description = null;
    List<ArrayList<String>> readerStates = null;

    final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream sysOut;


    @BeforeEach
    public void setup(){
//        initialise reader
        reader = new Reader();

//        set streams for catching console output
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testDescriptionObjectExpectedInput(){
        /*
        * Tests that description object is correctly created for example 1.
        * Tests all methods (constructor, getValidStates, getAcceptedInputs, getOptions,
        * size and get.
        */
        reader.readFile("src/tests/example-1.fsm");
        readerStates = reader.getStates();

        description = new Description(readerStates);

        assertNotEquals(null, description);
//        size
        assertEquals(8, description.size());

//        each line is len 4
        for (int i =0; i < description.size(); i++){
            assertEquals(4, description.get(i).size());
        }

//        get options
        assertEquals(2, description.getOptions("1").size());

//        get accepted inputs
        assertEquals(2, description.getAcceptedInputs().size());
        assertTrue(description.getAcceptedInputs().contains("1"));
        assertTrue(description.getAcceptedInputs().contains("2"));


        //        get valid states
        assertEquals(4, description.getValidStates().size());
        assertTrue(description.getValidStates().contains("1"));
        assertTrue(description.getValidStates().contains("2"));
        assertTrue(description.getValidStates().contains("3"));
        assertTrue(description.getValidStates().contains("4"));
    }

    @Test
    public void testDescriptionWithWrongLengthofLines() {
        /*
         * Tests that description object outputs "Bad description" when given
         * a line that doesn't have the right amount of characters.
         */



        reader.readFile("wrong-line-size.fsm");
        readerStates = reader.getStates();
        description = new Description(readerStates);

        assertNull(description);

    }

    @Test
    public void testDescriptionWithWrongStateMove() {
        /*
         * Tests that description object outputs "Bad description" when given
         * a line that doesn't have the right amount of characters.
         */



        reader.readFile("wrong-state-move.fsm");
        readerStates = reader.getStates();
        description = new Description(readerStates);

        assertNull(description);

    }

    @After
    public void restoreStreams(){
        System.setOut(sysOut);
    }
}
