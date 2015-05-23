package cs4820;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
public class Hw1 {

	public static void main(String[] args) {
		int n = 1024;
        ArrayList<Integer> aL = new ArrayList<Integer>(n);
        Random rm = new Random();
        for (int i=0;i<100;i++){ 
        	int index = rm.nextInt(n);
        	int element = rm.nextInt();
        	List<Integer> right = aL.subList(index, n);
        	List<Integer> left = aL.subList(0, index);
        	left.add(element);
        	left.addAll(right);
        	aL = new ArrayList<Integer>(left);
        }
        System.out.println(aL.toString());
        
	}

}
