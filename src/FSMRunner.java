import java.util.ArrayList;
import java.util.List;

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

        for (ArrayList<String> option : options) {
            if (option.get(1).equals(input)) {
                output = option.get(2);
                currentState = option.get(3);
                return output;
            }
        }
        return output;
    }
}
