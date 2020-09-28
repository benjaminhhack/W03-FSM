package tests;

import main.Reader;
import main.Description;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDescription {

    @BeforeEach
    public void setup(){
        Reader reader = new Reader();
        reader.readFile("example-1.fsm.txt");
        List<ArrayList<String>> readerStates = reader.getStates();
    }

    @Test
    public void testDescriptionObjectExpectedInput(){

//        Description description = new Description(readerStates);
    }
}
