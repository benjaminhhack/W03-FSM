package main;

import java.util.ArrayList;
import java.util.List;

public class fsminterpreter {

    public static void main(String[] args) {
	// write your code here
        Reader reader = new Reader();
        try{
            reader.readFile(args[0]);
            List<ArrayList<String>>  states = reader.getStates();
            System.out.println(states);
        } catch
        (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bad input");
            System.exit(0);
        }



    }

}
