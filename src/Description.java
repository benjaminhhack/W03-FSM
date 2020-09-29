import java.util.*;

public class Description {
    public ArrayList<String> validStates = new ArrayList<String>();
    public ArrayList<String> acceptedInputs = new ArrayList<String>();
    public ArrayList<String> linkedStates = new ArrayList<String>();
    public Set<String> validStatesSet = new LinkedHashSet<>();
    public Set<String> acceptedInputsSet = new LinkedHashSet<>();
    public Set<String> linkedStatesSet = new LinkedHashSet<>();
    public List<ArrayList<String>> description;

    public final String BAD_DESCRIPTION = "Bad description";


    public Description(List<ArrayList<String>> description){
        this.description = description;

        try{
            for (ArrayList<String> strings : description) {
                validStates.add(strings.get(0));
                acceptedInputs.add(strings.get(1));
                linkedStates.add(strings.get(3));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println(BAD_DESCRIPTION);
            System.exit(0);
        }


//      removing duplicates
        validStatesSet.addAll(validStates);
        acceptedInputsSet.addAll(acceptedInputs);
        linkedStatesSet.addAll(linkedStates);

        validStates.clear();
        acceptedInputs.clear();
        linkedStates.clear();

        validStates.addAll(validStatesSet);
        acceptedInputs.addAll(acceptedInputsSet);
        linkedStates.addAll(linkedStatesSet);

//      checks for bad description
        for (ArrayList<String> strings : description) {
            if (strings.size() != 4) {
                System.out.println(BAD_DESCRIPTION);
                System.exit(0);
            }
            if (!validStates.contains(strings.get(3))) {
                System.out.println(BAD_DESCRIPTION);
                System.exit(0);
            }
            if (!linkedStates.contains(strings.get(0))){
                System.out.println(BAD_DESCRIPTION);
                System.exit(0);
            }
        }

        this.validStates = validStates;
        this.acceptedInputs = acceptedInputs;

    }

//  setters and getters
    public ArrayList<String> getValidStates(){
        return validStates;
    }
    public ArrayList<String> getAcceptedInputs(){
        return acceptedInputs;
    }
    public List<ArrayList<String>> getOptions(String currentState){
        List<ArrayList<String>> options = new ArrayList<ArrayList<String>>();
        for (ArrayList<String> strings : description) {
            if (strings.get(0).equals(currentState)) {
                options.add(strings);
            }
        }
        return options;
    }
    public int size(){
        return description.size();
    }
    public ArrayList<String> get(int i){
        return description.get(i);
    }



}
