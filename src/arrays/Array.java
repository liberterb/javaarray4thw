package arrays;

public class Array {
	public static void main(String[] args) {
		int temp,length=10;
		int[] array = {12,87,45,61,9,7,45,78,56,31};
		System.out.printf("%s%8s%n","Index","Value");
		for (int counter =0; counter<length/2;counter++) {
			temp=array[counter];
			array[counter]=array[length-1-counter];
			array[length-1-counter]=temp;
		}
		for (int counter =0; counter<length;counter++) {
			System.out.printf("%5d%8d%n",counter,array[counter]);
		}
		
		
		
	}
}
