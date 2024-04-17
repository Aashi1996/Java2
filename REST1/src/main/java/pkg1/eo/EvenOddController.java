package pkg1.eo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EvenOddController {
	@GetMapping("/getEvenOdd")
	public List<Integer> eo(){
		List<Integer> list1=new ArrayList<>();
		List<Integer> even=new ArrayList<>();
		for(int i=0; i<=10; i++) {
			list1.add(i);
			if(i%2==0) {
				even.add(i);
			}
		}
		return even;
	}
}
