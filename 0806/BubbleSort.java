import java.util.*;
public class BubbleSort{
	public static void main(String[] args){
		int[] nums = {-7,3,56,87874,34};
		int[] newArr =bubbleSort(nums);
		System.out.print(Arrays.toString(newArr));
		
		
	}
	// 冒泡排序 相邻的两位进行对比
	// 面向对象
	// 修饰词 返回值类型 方法名（参数列表）
	// 方法体  	bubbleSort  排序
	/*public static int[] bubbleSort(int[] arr){
	    for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				// 比较
			    if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				
			    }
			}
		}
		return arr;*/
	public static int[] bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
			return arr;
	}
}
