package pkg1;
import java.util.ArrayList;
public class EvenOdd {
	public static void showEvenOdd(int limit1) {
		ArrayList<Integer>list1=new ArrayList<>();
		ArrayList<Integer>list2=new ArrayList<>();
		ArrayList<Integer>list3=new ArrayList<>();
		for (int i=0; i<limit1; i++) {
			list1.add(i);
			if (i%2==0) {
				list2.add(i);
			}
			else {
				list3.add(i);
			}
		
		}
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}

	public static void main(String[] args) {
		showEvenOdd(50);

	}

}
