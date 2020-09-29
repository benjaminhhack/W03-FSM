import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
            Scanner sc = new Scanner(System.in);
            String inputString = sc.nextLine();
            String [] inputs = inputString.split("");

            int i =0;
            String out = "";
            while (i < inputs.length){
                out += fsmRunner.interpret(inputs[i]);
                if (out.contains(BAD_INPUT)) {
                    System.out.println(out);
                    System.exit(0);
                }
                i++;

            }
            System.out.println(out);
            System.exit(0);

        } catch
        (ArrayIndexOutOfBoundsException e) {

            System.out.println(BAD_DESCRIPTION);
            e.printStackTrace();
            System.exit(0);
        }
        System.exit(0);
    }

}
