package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import junit.framework.*;

import java.util.ArrayList;
import java.util.List;

import main.Reader;

public class TestFSMRunner {

    private List<ArrayList<String>> states = new ArrayList<ArrayList<String>>();
    @Before
    public void setup(){
        List<ArrayList<String>> states = new ArrayList<ArrayList<String>>();

        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("1");
        s1.add("1");
        s1.add("O");
        s1.add("2");
        states.add(s1);

        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("1");
        s2.add("2");
        s2.add("O");
        s2.add("4");
        states.add(s2);

        ArrayList<String> s3 = new ArrayList<String>();
        s3.add("2");
        s3.add("1");
        s3.add("E");
        s3.add("1");
        states.add(s3);

        ArrayList<String> s4 = new ArrayList<String>();
        s4.add("2");
        s4.add("2");
        s4.add("O");
        s4.add("3");
        states.add(s4);

        ArrayList<String> s5 = new ArrayList<String>();
        s5.add("3");
        s5.add("1");
        s5.add("E");
        s5.add("4");
        states.add(s5);

        ArrayList<String> s6 = new ArrayList<String>();
        s6.add("3");
        s6.add("2");
        s6.add("E");
        s6.add("2");
        states.add(s6);

        ArrayList<String> s7 = new ArrayList<String>();
        s7.add("4");
        s7.add("1");
        s7.add("O");
        s7.add("3");
        states.add(s7);

        ArrayList<String> s8 = new ArrayList<String>();
        s8.add("4");
        s8.add("2");
        s8.add("E");
        s8.add("1");
        states.add(s8);


    }

    @Test
    public void testExampleOneFSMStandardInput(){
        System.out.println(states);
    }

    @Test
    public void testFSMExample1BadInput(){
        assertEquals(1,1);
    }

}
