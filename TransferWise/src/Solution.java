import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;


import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'linker' function below.
     *
     * The function is expected to return a list of matches.
     * The function accepts following parameters:
     *  1. List of bankstatement
     *  2. List of transfers
     * 
     * SEE EXMAPLE above 
     */

    public static List<List<String>> linker(List<List<String>> bankStatment, List<List<String>> transfers) {
       
    	List<List<String>> endResult = new ArrayList<>(); //final values

        String end = ""; //variable to store confidence level
        List<String> rows = new ArrayList<>(); // variable to store id values
        int count = 0;


        // bankStatment.size = transfers.size;
        for (int i = 0; i < bankStatment.size(); i++) { // Bank Statement list checker
            for (int j = 0; j < bankStatment.get(i).size() ; j++) { // Bank Statement inner list checker
                for (int l = 0; l < transfers.get(i).size(); l++) { // transfers list list checker
                    rows = new ArrayList<>();
                    boolean test = bankStatment.get(i).get(1).equalsIgnoreCase(transfers.get(i).get(2)); //boolean test for firstname
                    boolean test2 = bankStatment.get(i).get(1).equalsIgnoreCase(transfers.get(i).get(2)); //boolean test for lastname          
                    if (test == false && test2 == false) break;

                    String test1 = bankStatment.get(i).get(j); //store elements in string.
                    String team = transfers.get(i).get(l); //store elements in string.
                    if (test1.equalsIgnoreCase(team)) {
                        count++;
                    }
                 
                 }

            }


            if (count == 5) { // condition to add confidence value
                end = "match";
            } else if (count == 4) {
                end = "high";
            } else if (count == 3) {
                end = "proposed";
            } else {
                end = "none";
            }
            

            count = 0; //value to reset counter.

            rows.add(bankStatment.get(i).get(0)); // add id values

            rows.add(transfers.get(i).get(0)); // add transfer id values

            endResult.add(rows);

            endResult.get(i).add(end.replaceAll("\r", "").replaceAll("\n", ""));

             
        }
        int innerSize = endResult.get(endResult.size() - 1).size();
        endResult.get(endResult.size() - 1).remove(" \r");
        
        System.out.println(endResult.size());


        return endResult;
        
    }

}
	public class Solution {
    public static void main(String[] args) throws IOException {
    	
    	FileReader reader = new FileReader("/Users/victoray/Downloads/tester/input001.txt");
    	BufferedReader bufferedReader = new BufferedReader(reader);
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    	FileWriter fileWriter = new FileWriter("/Users/victoray/Downloads/tester/output001.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        int bankStatmentRows = Integer.parseInt(bufferedReader.readLine().trim());
        int bankStatmentColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> bankStatment = new ArrayList<>();

        IntStream.range(0, bankStatmentRows).forEach(i -> {
            try {
                bankStatment.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int transfersRows = Integer.parseInt(bufferedReader.readLine().trim());
        int transfersColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<String>> transfers = new ArrayList<>();

        IntStream.range(0, transfersRows).forEach(i -> {
            try {
                transfers.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<List<String>> result = Result.linker(bankStatment, transfers);

        result.stream()
            .map(
                r -> r.stream()
                    .collect(joining(" "))
            )
            .map(r -> r + "\n")
            .collect(toList())
            .forEach(e -> {
                try {
                    bufferedWriter.write(e);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
