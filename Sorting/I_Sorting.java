import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Java program to sort Array and ArryaList with primitive type of data.
public class IV_Sorting {
	public static void main(String []args) {

		int[] array1 = {4, 10, 3, 7};
		Arrays.sort(array1);

		System.out.println(Arrays.toString(array1));

		char[] array2 = {'K', 'V', 'D', 'F'};
		Arrays.sort(array2);

		System.out.println(Arrays.toString(array2));

		List<String> strList = new ArrayList<String>();
		strList.add("A");
		strList.add("C");
		strList.add("B");
		strList.add("Z");
		strList.add("E");
		Collections.sort(strList);
		for(String str: strList) System.out.print(" "+str);
	}

}
