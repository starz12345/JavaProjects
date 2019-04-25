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
        List<List<String>> endResult = new ArrayList<>();
        List<String> rows = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < bankStatment.size(); i++){
            for (int j = 0; j < bankStatment.get(i).size(); j++){
                for (int k = 0; k < transfers.size(); k++){
                    for (int l = 0; l < transfers.get(k).size(); l++){
                        rows = new ArrayList<>();

                        String test = bankStatment.get(i).get(j);
                        String team = transfers.get(k).get(l);
                        if (test.equalsIgnoreCase(team)) {
                            count++;
                        }        
                        
                    }
                }
            }

            rows.add(bankStatment.get(i).get(0));
            rows.add(transfers.get(i).get(0));

            endResult.add(rows);    

            for (int m = 0; m < endResult.size(); m++) {
                if (count / 2 == 5) {
                    endResult.get(m).add("match");
                } else if (count / 2 == 4) {
                    endResult.get(m).add("high");
                } else if (count / 2 == 3) {
                    endResult.get(m).add("proposed");
                } else if (count == 0) {
                    endResult.get(m).add("none");
                }
            }      
        }
       System.out.println(count);

        return endResult;
    	
    	
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("/Users/victoray/Documents/test_cases_b6rfthg7o9g")));

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
