package overload;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author nals_macbook_187
 */
public class JavaApplication1 {

	/**
	 * @param args the command line arguments
	 */
	static int i;
	public static void main(String[] args) {
		
		String[] string1 = "abcdamyuimm".split("");
		String[] string2 = "abcmdaa".split("");
		String distric = "";
	
		for (int i = 0; i < string1.length; i++) {
			for (int j = 0; j < string2.length; j++) {
				
				if (string1[i].equals(string2[j]) && !distric.toString().contains(string1[i])) {
					distric = distric.concat(string1[i]);
				}
			}
		}
		
		System.out.println(distric);
//        char c;
//        // int i = 0;
//
//        String a = "mai tuan anh";
//        String[] splipA = a.split("");
//        System.out.println(Arrays.toString(splipA));

		// for (c = 'A'; c <= 'Z'; ++c) {
		// for (int i = 0; i < splipA.length; i++) {
		// if (splipA[i].equals(String.valueOf(c))) {
		// splipA[i] = splipA[i].toLowerCase();
		// }
		// }
		// }
		//
//        int count = 0;
//        for (int i = 0; i < splipA.length; i++) {
//            if ("a".equals(splipA[i])) {
//                System.out.println(i);
//                count++;
//            }
//        }
//        System.out.println(count);

		// những kiểu khai báo array
		// overload

//		String str = "Hello world!";
//		String[] aray =  str.split("");
//		
//		List<String> a  = 
//		Arrays.stream(aray).map(x -> {
//			System.out.println(x);
//			return x;
//		}).collect(Collectors.toList());
//		
//		
//		System.out.println(a.toString());


	}

	public static void sortArray(int[] x, float y) {
		// abc
		int[] array = { 2, 1, 3 };
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void sortArray(int[] x, String y) {
		int[] arr = new int[] { 2, 1, 3 };
		System.out.println("Array elements after sorting:");
		// sorting logic
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			// prints the sorted element of the array
			System.out.println(arr[i]);
		}
	}

}
