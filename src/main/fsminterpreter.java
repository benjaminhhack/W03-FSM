package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fsminterpreter{

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
            System.out.println(description);
            System.out.println(description.getValidStates());
            System.out.println(description.getAcceptedInputs());
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

//          gets input and continually runs until 'exit' is passed to the scanner
            while (!input.equals("exit")){
                if (description.getAcceptedInputs().contains(input)) {
                    System.out.println(fsmRunner.interpret(input));
                    input = sc.nextLine();
                }
                else {
                    System.out.println("Bad input");
                    System.exit(0);
                }
            }
            System.out.println(states);
        } catch
        (ArrayIndexOutOfBoundsException e) {
            System.out.println("Bad input");
            System.exit(0);
        }
    }

}
