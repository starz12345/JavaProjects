import java.util.Arrays;
import java.util.Scanner;

public class ty {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        int count = 0;

        for (char i: first){
            for (char j : second){
                String test = Character.toString(i);
                String team = Character.toString(j);
                if (team.equalsIgnoreCase(test)){
                    count++;
                }
            }
        }

        if (count == first.length)return true;
        
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = "anagram";
        String b = "margana";
        scan.close();
        char[] first = a.toLowerCase().toCharArray();
        char[] second = b.toLowerCase().toCharArray();
        int count = 0;
        
        Arrays.sort(first);
        Arrays.sort(second);
        
        String tes = new String(first);
        String tis = new String(second);
        System.out.println(tes);
        System.out.println(tis);

      

        

        
        System.out.println(first.toString());
        System.out.println(second.toString());
        boolean ret = false;
        if (tes.equals(tis)) {
        	ret = true;
        } 
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
