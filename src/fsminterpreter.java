import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fsminterpreter{

    public static final String BAD_DESCRIPTION = "Bad description";
    public static final String BAD_INPUT = "Bad input";

    public static void main(String[] args) {
	// write your code here
        Reader reader = new Reader();

        try{
//          reads the fsm and gets the states
            reader.readFile(args[0]);
            List<ArrayList<String>> states = reader.getStates();

//          initialises description and FSMRunner objects
            Description description = new Description(states);
            FSMRunner fsmRunner = new FSMRunner(description, description.getValidStates().get(0));

//            System.out.println(description);
//            System.out.println(description.getValidStates());
//            System.out.println(description.getAcceptedInputs());




//          gets input and continually runs until 'exit' is passed to the scanner
            String inputString = args[1];
            String [] inputs = inputString.split("");

            int i =0;
            while (i < inputs.length){
                String out = fsmRunner.interpret(inputs[i]);
                if (out.equals(BAD_INPUT)) {
                    System.out.println(BAD_INPUT);
                    System.exit(0);
                }
                else{
                    System.out.println(out);
                    i++;
                }


            }

        } catch
        (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.out.println("Bad input");
            System.exit(0);
        }
        System.exit(0);
    }

}
