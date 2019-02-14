package Program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSort {

	public static void main(String[] args) {
		
		/*if you want to achieve this in ArrayList then you have to limit the size by yourself in 
		 the code, something like this would work:
		 */

//			ArrayList list = new ArrayList();
//			if(list.get(10) != null)  //If there exists a 11th element
//			{
//			     throw new ArrayIndexOutOfBoundsException();
//			}
		
		 ArrayList<Integer> arraylist = new ArrayList<Integer>(50);
		    arraylist.add(1);
		    arraylist.add(2);
		    arraylist.add(3);
		    arraylist.add(4);
		    arraylist.add(5);
		    arraylist.add(6);
		    arraylist.add(7);
		    arraylist.add(1);
		    arraylist.add(1);
		    arraylist.add(1);
		    arraylist.trimToSize();
		    System.out.println(arraylist);
		
//List<String> arrList = new ArrayList<String>();
//arrList.add("Dog");
//arrList.add("Cat");
//arrList.add("Camel");
//arrList.add("Parrot");
//
//List<String> arrList2 = new ArrayList<String>();
//arrList2.add("Avi");
//arrList2.add("John");
//arrList2.add("James");
//arrList2.add("Cat");
//arrList2.add("Taker");
//arrList2.add("Dog");
//
//List<String> arrList3 = new ArrayList<String>();
//for(String temp : arrList) 
//
//arrList3.add(arrList2.contains(temp)? "Yes" : "No");
//System.out.println(arrList3);
		
//		List<String> arrList = new ArrayList<String>();
//		arrList.add("Dog");
//		arrList.add("Cat");
//		arrList.add("Camel");
//		arrList.add("Parrot");
//
//		List<String> arrList2 = new ArrayList<String>();
//		arrList2.add("Avi");
//		arrList2.add("John");
//		arrList2.add("James");
//		arrList2.add("Cat");
//		arrList2.add("Taker");
//		arrList2.add("Dog");
//
//		List<String> arrList3 = new ArrayList<String>(arrList2);
//		arrList3.addAll(arrList);
//		for(String temp : arrList3) 
//
//		
//		System.out.println(temp);


//Collections.reverse(arrList);
//Collections.sort(arrList, Collections.reverseOrder());
//
//for(String str : arrList)
//System.out.println(str);
//arrList.clear();
//arrList.removeAll(arrList);
//System.out.println(arrList);


	}

}
