
public class Sorting {
	public static int[] moveIntToEnd(int[] array, int x){
		int[] newArray = new int[array.length];
		int end = array.length-1;
		int start = 0;
		for(int i = 0; i< array.length -1; i++){
			if(i == 0){
				start = i;
			}
			if(array[i] != x){
				newArray[start] = array[i];
				start++;
			}else{
				newArray[end] = array[i];
				end--;
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		int[] array = new int[]{1,5,3,6,0,5,7,0,0,4,0,1,6,7,5,4,3,5,3,2,1,5,6,0,0,0,3,2,0,1,1};
		for(int i : array){
			System.out.print(i);
		}
		int x = 1;
		array = moveIntToEnd(array, x);
		System.out.println("---------------------");
		for(int i : array){
			System.out.print(i);
		}
	}
}
