import java.util.*;
public class chooseSort{
	public static void main(String[] args){
		// 选择排序 每一位都与第一位比
		/*int[] nums ={4,-8,20,66,878};
		// 控制趟数
		for(int i=0;i<nums.length-1;i++){
			//控制每一趟的次数
			for(int j=i+1;j<nums.length;j++){
				//比较
				if(nums[i]>nums[j]){
					//交换两个数
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(nums));*/
		int[] nums ={3,657,2,-876,2};
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(nums));
	}
}