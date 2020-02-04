package Package1;
/* Tyler Farid, CPS 2332 
This code creates an array of random integers and uses different methods to sort, swap and return the array
*/

import java.util.Arrays;
import java.util.Random;

public class ArrReview{

	private int[] array;
	public ArrReview(int length){
		array = new int[length];
		for(int i =0 ;i<length;i++){
			array[i] = (int) (Math.random()*100);
		
		}
	}

	@Override
	public String toString() {
		return "ArrReview =" + Arrays.toString(array) + "";
	}
	public int[] getArray() {
		return array;
	}
	public void setArray(int[] array){
		this.array = array;
	}
	
	public void setKthItem(int k, int item){
		array[k] = item;
	}
	public int pickMaxIndex( int start, int end){
		int max = array[start];
		int index=start;
		for(int i = start + 1 ;i< end ;i++){
			if(array[i] >= max){
				max = array[i];
				index=i;
			}
		}
		return index;
	}
	public void swap(int i , int j){
		int swapper = array[i];
		array[i] = array[j];
		array[j] = swapper;
	}
	public void selectSort(){
		int max;
		int position;
		for(int i = 0;i<array.length-1;i++){
			max = array[i];position=i;
			for(int j = i+1;j<array.length;j++){
				if(array[j]>max){
					max = array[j];
					position = j;
				}
			}
			swap(i,position);   
		}
	}
	public void printArray(){
		for(int value:array)
			System.out.println(value + " ");
	}

	public static void main(String[] args){
		
		ArrReview array1=new ArrReview(5);
		System.out.println(array1);
		
		System.out.println(" ");
		System.out.println("Index of Max number:"+array1.pickMaxIndex(0, 4));
		array1.swap(2, 3);
		System.out.println(" ");
		System.out.println("After Swaping:");
		System.out.println(array1);
		array1.selectSort();
		System.out.println(" ");
		System.out.println("After Sorting:");
		System.out.println(array1);
		
	}
	
}
