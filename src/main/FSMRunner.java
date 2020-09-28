package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FSMRunner {

    public Description description;
    public String currentState;
    public String output;
    public List<ArrayList<String>> options;

    final String BAD_INPUT = "Bad input";

//    constructor
    public FSMRunner(Description description, String currentState) {
        this.description = description;
        this.currentState = currentState;
    }

//  method for running the FSM
    public String interpret(String input){
        output = BAD_INPUT;
        options = description.getOptions(currentState);
        System.out.println(options);
        System.out.println(options.size());

        for (int i = 0; i < options.size(); i++){
            if (options.get(i).get(1).equals(input)){
                output = options.get(i).get(2);
                currentState = options.get(i).get(3);
                return output;
            }
        }

        return output;
    }
}
