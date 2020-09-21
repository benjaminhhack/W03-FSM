package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import java.io.Reader;
import java.util.*;

public class TestReader {

    @Test
    public void exampleOneReadsCorrectly(){
//      Tests reader reads descriptions correctly
//        Reader reader = new Reader();
        ArrayList<ArrayList<String>> states = new ArrayList<ArrayList<String>>();

        ArrayList<String> s1 = new ArrayList<String>();
        s1.add("1");
        s1.add("1");
        s1.add("0");
        s1.add("2");
        states.add(s1);

        ArrayList<String> s2 = new ArrayList<String>();
        s2.add("1");
        s2.add("2");
        s2.add("0");
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
        s4.add("0");
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
        s6.add("3");
        s6.add("E");
        s6.add("2");
        states.add(s6);

        ArrayList<String> s7 = new ArrayList<String>();
        s7.add("4");
        s7.add("1");
        s7.add("0");
        s7.add("3");
        states.add(s7);

        ArrayList<String> s8 = new ArrayList<String>();
        s8.add("4");
        s8.add("2");
        s8.add("E");
        s8.add("1");
        states.add(s8);

        for (int i = 0; i < states.size(); i++) {
            for (int j = 0; j < states.get(i).size(); j++) {
                System.out.print(states.get(i).get(j) + " ");
            }
            System.out.println();
        }
        assertEquals("4", states.get(7).get(0), "State 4 item 1 must be \"4");


    }
}
