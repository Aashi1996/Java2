package pkg1;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class EvenOdd2 {

	public static void main(String[] args) {
		ArrayList<Integer>list1=new ArrayList<>();
		List<Integer>list2=new ArrayList<>();
		for (int i=0; i<50; i++) {
			list1.add(i);
		}
		list2=list1.stream().filter(n1->n1%2==0).collect(Collectors.toList());
		System.out.println(list2);

	}

}
