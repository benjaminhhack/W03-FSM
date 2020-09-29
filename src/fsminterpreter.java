import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fsminterpreter{

    public static final String BAD_DESCRIPTION = "Bad description";
    public static final String BAD_INPUT = "Bad input";

    public static void main(String [] args) {
	// write your code here
        Reader reader = new Reader();

        try{
//          reads the fsm and gets the states
            reader.readFile(args[0]);
            List<ArrayList<String>> states = reader.getStates();

//          initialises description and FSMRunner objects
            Description description = new Description(states);
            FSMRunner fsmRunner = new FSMRunner(description, description.getValidStates().get(0));

//          gets input and continually runs until 'exit' is passed to the scanner
            String inputString = args[1];
            String [] inputs = inputString.split("");

            int i =0;
            String out = "";
            while (i < inputs.length){
                out += fsmRunner.interpret(inputs[i]);
                if (out.contains(BAD_INPUT)) {
                    System.out.println(out);
                    System.exit(0);
                }
            }
            System.out.println(out);

        } catch
        (ArrayIndexOutOfBoundsException e) {

            System.out.println(BAD_DESCRIPTION);
            System.exit(0);
        }
        System.exit(0);
    }

}
