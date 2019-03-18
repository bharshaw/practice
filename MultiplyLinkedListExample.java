import java.io.File;
import java.util.LinkedList;

public class MultiplyLinkedListExample {

	public static void multiplyLinkedListSingleConvert(LinkedList<Integer> top, LinkedList<Integer> bottom){
		String topString = "";
		
		for(int i = 0; i< top.size(); i++) {
			topString+=top.get(i);
		} 
		int topConverted = Integer.parseInt(topString);
		
		int x = 1;
		int multiplied;
		int sum = 0;
						
		for(int i = bottom.size()-1; i > -1; i--) {
			multiplied = bottom.get(i) *topConverted;
			multiplied*=x;
			x*=10;
			sum+=multiplied;
			
		}					
		System.out.println(sum);
	}
	
	public static void multiplyLinkedListNoConvert(LinkedList<Integer> top, LinkedList<Integer> bottom){
		int multiply;
		int value = 0;
		String temp = "";
		int sum = 0;
		int[] carry = new int[top.size()];
		int[] results = new int[bottom.size()];
		for(int x = bottom.size()-1; x >= 0; x--) {
			for(int i = top.size()-1; i > -1; i--) {
				multiply = bottom.get(x) * top.get(i);
				if(carry[i] > 0){
					multiply+=carry[i];
				}		
				if(i > 0){
					value = multiply%10;
					if(multiply > 9){
						multiply/= 10;
						carry[i-1] =  multiply;
					}else{
						carry[i-1] = 0;
					}	
				}else{
					value = multiply;
				}
				temp=Integer.toString(value)+temp;
			} 
			results[x] = Integer.parseInt(temp);
			temp = "";
		}
		int multiplier  = 1;
		for(int i = results.length-1; i>=0 ; i--) {
			results[i] = results[i]*multiplier;
			sum = sum + results[i];
			multiplier = multiplier*10;
		}
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		LinkedList top = new LinkedList();
		LinkedList bottom = new LinkedList();
		top.add(2);
		top.add(7);
		top.add(9);
		
		bottom.add(1);
		bottom.add(7);
		bottom.add(3);
		bottom.add(5);
		System.out.println("-----Multiply 279 * 1735 converting only the top number to an int-------------");
		multiplyLinkedListSingleConvert(top, bottom);
		System.out.println("-----Multiply 279 * 1735 converting without converting either linkedlist to an int-------------");
		multiplyLinkedListNoConvert(top, bottom);
		
		
	}
	
}
