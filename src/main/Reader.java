package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Reader {

    //initialising the data hashset
    static ArrayList<ArrayList<String>> states = new ArrayList<ArrayList<String>>();
    static String filename;

    //constructors
    public Reader() {
    }

    public Reader(String filename) {
        Reader.filename = filename;
    }

    // for accessing data in other classes
    public ArrayList<ArrayList<String>> getStates() {
        return states;
    }

    //checks if file exists, and if so, reads the file and creates a hashset with the data
    public List<ArrayList<String>> readFile(String filename) {
        //  String fileName = args[0]; //https://www.geeksforgeeks.org/file-class-in-java/

        try {
            File transitions = new File("src/" + filename);
            Scanner fileReader = new Scanner(transitions);
            while (fileReader.hasNextLine()) {
                String [] line = fileReader.nextLine().split(" ");

                ArrayList<String> dataItems = new ArrayList<String>(Arrays.asList(line));

                states.add(dataItems);
                //System.out.println(data);

            }
            fileReader.close();

        } catch (FileNotFoundException a) {
            System.out.println("File can't be found");
            a.printStackTrace();
        }
        return states;
    }
}
