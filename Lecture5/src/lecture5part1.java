//import java.util.ArrayList;
//import java.util.List;
//import java.util.Arrays;
//
//public class lecture5part1 {
//
//	public static void main(String[] args) {
//		
//		String [] namesArray = new String [6];
//		
//		System.out.println(namesArray[0]);
//		
//		namesArray[0] = "Odin";
//		
//		System.out.println(namesArray[0]);
//		
//		for (String name : namesArray) {
//			System.out.println(name);
//		}
//		
//		List<Integer> nameList = new ArrayList<>();
//		
//		nameList.add(1);
//		nameList.add(1);
//		nameList.add(1);
//		nameList.add(1);
//		nameList.add(1);
//		
//		System.out.println(nameList);
//		.args.clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone().clone()..args..args.clone()..args.clone()..args.clone()..args.clone().clone().clone().clone()..args..args.clone()..args..args.clone()..args..args.clone().clone().clone().clone()..args.clone()..args.clone().clone()..args..args..args.clone().clone()..args..args..args.clone()..args..args.clone()..args..args.clone().clone()..args..args..args.clone()..args..args.clone()..args..args.clone()..args.clone()..args..args.clone()..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args.clone().clone()..args..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone().clone()..args..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args.clone()..args.clone()..args..args.clone()..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args..args.clone()..args.clone()..args.clone().clone().clone().clone().clone().clone()
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		.clone().clone()
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		.5
//		
//	}
//		
///**		
//		nameList.add("John");
//		
//		List studentGroup = new ArrayList<>();
//		
//		studentGroup.add("Odin");
//		studentGroup.add("Thor");
//		studentGroup.add("Baldur");
//		studentGroup.add("Loki");
//		studentGroup.add("Floki");
//		studentGroup.add("Aries");
//		studentGroup.add(5);
//		
//		//System.out.println(studentGroup.size());
//		String name;
//		for (int i = 0; i < studentGroup.size(); i++) {
//			name = (String) studentGroup.get(i);
//			if (name.startsWith("A")) {
//				System.out.println(name);
//			}
//		}
//		
//**/		
//		
//		
//		 static String findNumber(List<Integer> arr, int k) {
//		        String result = "";
//		        int h = arr.size() - 1;
//		        for (int i = 0; i < arr.size(); i++){
//		            int g;
//		            g = (int) arr.get(i);
//		            if (g == k){
//		                result = "YES";
//		            } else if (g != k){
//		                result = "NO";
//		            }
//		        }
//		        int p = (int) arr.get(0);
//		        int q = (int) arr.get(h);
//
//		     if ( p == k){
//		            result = "YES";
//		    } 
//		    if (q == k ) {
//		            result = "YES";
//		        }
//		    System.out.println(h);
//		    return result;
//
//		
//		
//
//	}
//
//	  static List<Integer> oddNumbers(int l, int r) {
//
//	        List arrOdd = new ArrayList<>();
//	        int[] arr = new int[(r - l) + 1];
//	        // arr[0] = l;
//	        arr[arr.length - 1] = r;
//	        for (int i = 1; i < arr.length; i++) {
//	            arr[i] = l++;
//	            if (arr[i]% 2 == 1){
//	                arrOdd.add(arr[i]);
//	            }
//	        } 
//	        if (r%2 == 1){
//	            arrOdd.add(r);
//	        }
//	        return arrOdd;
//
//	    }
//}